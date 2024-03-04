package software_engineering;

import java.util.HashSet;

public class Book {
    String title;
    String author;
    String genre;
    HashSet<BookReview> reviews;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.reviews = new HashSet<BookReview>();
    }

    public void addReview(BookReview review) {
        this.reviews.add(review);
    }

    public void removeReview(BookReview review) {
        this.reviews.remove(review);
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getGenre() {
        return this.genre;
    }

    public HashSet<BookReview> getReviews() {
        return this.reviews;
    }
}
