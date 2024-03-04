package software_engineering;

public class BookReview {
    
    private String review;
    private int rating;
    private UserAccount reviewer;
    private Book book;
    
    public BookReview(String review, int rating, UserAccount reviewer, Book book) {
        this.review = review;
        this.rating = rating;
        this.reviewer = reviewer;
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
    
    public UserAccount getReviewer() {
        // TODO implement here
        return null;
    }
    
    public String getBookTitle() {
        // TODO implement here
        return "";
    }
    
    public String toString() {
        return "Review: " + review + "\nRating: " + rating + "\nUsername: " + reviewer.getName() + "\nBook Title: " + book.getTitle() + "\n";
    }
    
}
