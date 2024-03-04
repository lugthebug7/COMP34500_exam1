package software_engineering;

import java.util.HashMap;
import java.util.HashSet;

public class Book {
    String title;
    String author;
    String genre;
    HashMap<String, BookReview> reviews;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.reviews = new HashMap<String, BookReview>();
    }

    public void addReview(String username, BookReview review) {
        // TODO implement here
    }

    public void removeReview(BookReview review) {
        // TODO implement here}
    }

    public String getTitle() {
        // TODO implement here
        return "";
    }

    public String getAuthor() {
        // TODO implement here
        return "";
    }

    public String getGenre() {
        // TODO implement here
        return "";
    }

    public HashMap<String, BookReview> getReviews() {
        // TODO implement here
        return null;
    }

    public BookReview getReview(String username) {
        // TODO implement here
        return null;
    }
}
