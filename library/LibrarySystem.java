import java.util.*;

class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void show() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author);
    }
}

class Library {
    private ArrayList<Book> list = new ArrayList<>();

    public void addBook(Book b) {
        list.add(b);
    }

    public void showBooks() {
        for (Book b : list) {
            b.show();
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book(1, "Java", "James"));
        lib.addBook(new Book(2, "Python", "Guido"));

        lib.showBooks();
    }
}








