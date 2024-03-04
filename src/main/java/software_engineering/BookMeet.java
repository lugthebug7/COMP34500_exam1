package software_engineering;

import java.util.HashMap;

public class BookMeet {

    Book book;
    UserAccount host;
    String date;
    String time;
    String location;
    HashMap<UserAccount, Boolean> attendees;
    
    public BookMeet(UserAccount host) {
        this.host = host;
    }

    public void setBook(Book book) {
        // TODO - implement BookMeet.setBook
    }

    public void setDate(String date) {
        // TODO - implement BookMeet.setDate
    }

    public void setTime(String time) {
        // TODO - implement BookMeet.setTime
    }

    public void setLocation(String location) {
        // TODO - implement BookMeet.setLocation
    }

    public Book getBook() {
        // TODO - implement BookMeet.getBook
        return null;
    }

    public UserAccount getHost() {
        // TODO - implement BookMeet.getHost
        return null;
    }

    public String getDate() {
        // TODO - implement BookMeet.getDate
        return "";
    }

    public String getTime() {
        // TODO - implement BookMeet.getTime
        return "";
    }

    public String getLocation() {
        // TODO - implement BookMeet.getLocation
        return "";
    }

    public HashMap<UserAccount, Boolean> getAttendees() {
        // TODO - implement BookMeet.getAttendees
        return null;
    }

    public void setAttendeeStatus(UserAccount attendee, Boolean status) {
        // TODO - implement BookMeet.addAttendee
    }


    
}
