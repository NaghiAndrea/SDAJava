package testing.fundamentals.library;

import java.util.Date;

public class Book {
    private String author;
    private String yearOfPublication;
    private String title;

    public Book(String author, String yearOfPublication, String title) {
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "author='" + author + '\'' +
                ", yearOfPublication='" + yearOfPublication + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
