package software_engineering;

public class BookReview {
    
    private String review;
    private int rating;
    private String username;
    private Book book;
    
    public BookReview(String review, int rating, String username, Book book) {
        this.review = review;
        this.rating = rating;
        this.username = username;
        this.book = book;
    }
    
    public String getReview() {
        // TODO implement here
        return "";
    }
    
    public int getRating() {
        // TODO implement here
        return 0;
    }
    
    public String getUsername() {
        // TODO implement here
        return "";
    }
    
    public String getBookTitle() {
        // TODO implement here
        return "";
    }
    
    public String toString() {
        return "Review: " + review + "\nRating: " + rating + "\nUsername: " + username + "\nBook Title: " + book.getTitle() + "\n";
    }
    
}
