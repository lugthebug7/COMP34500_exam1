package software_engineering;

import java.util.HashSet;

public class UserAccount {

    private String username;
    private String password;
    private String name;
    private HashSet<Book> booksRead;
    private boolean hostStatus;
    private boolean isManager;

    
    public UserAccount(String username, String password, String name) {
        // TODO implement here
    }

    public String getUsername() {
        // TODO implement here
        return "";
    }

    public String getPassword() {
        // TODO implement here
        return "";
    }

    public String getName() {
        // TODO implement here
        return "";
    }

    /*
     * @param  book
     * @param  review
     * Adds a review to the book
     * If book already has review by user, updates review
     */
    public void addBook(Book book, BookReview review) {
        // TODO implement here
    }

    public void deleteAccount() {
        // TODO implement here
    }

    /*
     * @param  book 
     * Checks if Book in BooksRead
     * Deletes BookReview if user has read book
     */
    public void removeBook(Book book) {
        // TODO implement here
    }

    public boolean getHostStatus() {
        // TODO implement here
        return false;
    }

    public void setHostStatus(boolean status) {
        // TODO implement here
    }

    public boolean getIsManager() {
        // TODO implement here
        return false;
    }


}
