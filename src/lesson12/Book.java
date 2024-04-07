package lesson12;


public class Book {
    private int id = 1;
    private String nameBook;
    private String description;
    private String nameAuthor;

    public Book() {
    }

    public Book(String nameBook, String description, String nameAuthor) {
        this.id++;
        this.nameBook = nameBook;
        this.description = description;
        this.nameAuthor = nameAuthor;
    }


    public String getNameBook() {
        return this.nameBook;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

}
