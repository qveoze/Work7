package work7;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String title){
        if (books.isEmpty()) {
            System.out.println("Библиотека пустая");
        } else {
            int flag = 0;
            for (Book element: books){
                if (title.equalsIgnoreCase(element.getTitle())){
                    books.remove(element);
                    System.out.println("Книга успешно удалена");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                System.out.println("Книги с таким названием не найдено");
            }
        }
    }
    public void findBookByAuthor(String author){
        List<String> booksByAuthors = new ArrayList<>();
        List<String> authorSplit = Arrays.asList(author.toLowerCase().split(" "));
        for (Book element: books){
            List<String> elementSplit = Arrays.asList(element.getAuthor().toLowerCase().split(" "));
            if (elementSplit.containsAll(authorSplit)){
                booksByAuthors.add((element.getTitle()));
            }
        }
        if (booksByAuthors.isEmpty()){
            System.out.println("Книг с таким автором не найдено");
        } else {
            for (String element: booksByAuthors){
                System.out.println(element);
            }
        }
    }
    public void printAllBooks(){
        if (books.isEmpty()){
            System.out.println("Книги в библиотеке отсутствуют");
        } else {
            for (Book book: books) {
                System.out.println(book.getBook());
            }
        }
    }
}
