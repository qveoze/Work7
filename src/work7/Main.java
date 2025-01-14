package work7;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(); //Создание библиотеки

        //Добавляем книги
        library.addBook(new Book("Преступление и наказание", "Фёдор Михайлович Достоевский", 1866));
        library.addBook(new Book("Зелёный свет", "Мэттью Макконахи", 2021));
        library.addBook(new Book("Жизнь на продажу", "Юкио Мисима", 1968));

        library.findBookByAuthor(" ");
    }
}
