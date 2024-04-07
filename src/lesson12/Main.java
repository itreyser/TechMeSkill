package lesson12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library app = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Взять книгу");
            System.out.println("3. Получить информацию о книге");
            System.out.println("4. Вывести названия книг для автора");
            System.out.println("5. Вывести всех авторов");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите имя автора: ");
                    String author = scanner.nextLine();
                    System.out.print("Введите название книги: ");
                    String title = scanner.nextLine();
                    System.out.print("Введите описание книги: ");
                    String description = scanner.nextLine();
                    app.addBook(title, description, author);
                    break;
                case 2:
                    System.out.print("Введите имя автора: ");
                    String authorTake = scanner.nextLine();
                    System.out.print("Введите название книги: ");
                    String titleTake = scanner.nextLine();
                    app.takeBook(titleTake, authorTake);
                    break;
                case 3:
                    System.out.print("Введите имя автора: ");
                    String authorInfo = scanner.nextLine();
                    System.out.print("Введите название книги: ");
                    String titleInfo = scanner.nextLine();
                    app.getBookInfo(authorInfo, titleInfo);
                    break;
                case 4:
                    System.out.print("Введите имя автора: ");
                    String authorBooks = scanner.nextLine();
                    app.getBooksByAuthor(authorBooks);
                    break;
                case 5:
                    app.getAllAuthors();
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    System.exit(0);
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }
}