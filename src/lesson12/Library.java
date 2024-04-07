package lesson12;

import java.util.*;

public class Library {
    private Map<String, List<Book>> list = new HashMap<>();

    public void addBook(String nameBook, String description, String nameAuthor) {
        Book book = new Book(nameBook, description, nameAuthor);
        if (list.containsKey(nameAuthor)) {
            list.get(nameAuthor).add(book);
        } else {
            List<Book> list = new ArrayList<>();
            list.add(book);
            this.list.put(nameAuthor, list);
        }
        System.out.println("Книга добавлена в библиотеку.");
    }

    public void takeBook(String nameBook, String nameAuthor) {
        if (list.containsKey(nameAuthor) && searchBookInArray(list.get(nameAuthor), nameBook)) {
            List<Book> listBook = list.get(nameAuthor);
            for (int i = 0; i < listBook.size(); i++) {
                if (Objects.equals(listBook.get(i).getNameBook(), nameBook)) {
                    listBook.remove(listBook.get(i));
                    break;
                }
            }
            System.out.println("Книга удалена из библиотеки.");
        } else {
            System.out.println("Книга не найдена.");
        }
    }

    public boolean searchBookInArray(List<Book> list, String nameBook) {
        boolean flag = false;
        for (Book i : list) {
            if (Objects.equals(i.getNameBook(), nameBook)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void getBookInfo(String authorName, String nameBook) {
        if (list.containsKey(authorName)) {
            List<Book> books = list.get(authorName);
            for (Book book : books) {
                if (book.getNameBook().equals(nameBook)) {
                    System.out.println("Информация о книге:");
                    System.out.println("ID: " + book.getId());
                    System.out.println("Название: " + book.getNameBook());
                    System.out.println("Описание: " + book.getDescription());
                    System.out.println("Автор: " + book.getNameAuthor());
                    return;
                }
            }
        }
        System.out.println("Книга не найдена.");
    }

    public void getBooksByAuthor(String author) {
        if (list.containsKey(author)) {
            List<Book> books = list.get(author);
            System.out.println("Книги автора " + author + ":");
            for (Book book : books) {
                System.out.println(book.getNameBook());
            }
        } else {
            System.out.println("У автора нет книг в библиотеке.");
        }
    }

    public void getAllAuthors() {
        System.out.println("Список всех авторов в библиотеке:");
        for (String author : list.keySet()) {
            System.out.println(author);
        }
    }

}
