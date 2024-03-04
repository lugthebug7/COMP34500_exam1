package software_engineering;

import java.util.HashSet;

public class BookClub {
    
    private ManagerAccount manager;
    private HashSet<MemberAccount> members;
    private HashSet<Book> books;

    public BookClub(ManagerAccount manager) {
        this.manager = manager;
        this.members = new HashSet<MemberAccount>();
        this.books = new HashSet<Book>();
    }

    public void addMember(MemberAccount member) {
        // TODO - implement BookClub.addMember
    }

    public void removeMember(MemberAccount member) {
        // TODO - implement BookClub.removeMember
    }

    public void addBook(Book book) {
        // TODO - implement BookClub.addBook
    }

}
