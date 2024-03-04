import org.junit.jupiter.api.Test;

import software_engineering.BookClub;
import software_engineering.ManagerAccount;
import software_engineering.MemberAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookClubTest {
    

    @Test
    public void testBookClub() {
        ManagerAccount manager = new ManagerAccount("manager", "password", "Bobby Fischer");
        BookClub bookClub = new BookClub(manager);
        assertEquals(bookClub.getManager(), null);
        assertEquals(bookClub.getMembers().size(), 0);
        assertEquals(bookClub.getBooks().size(), 0);
    }


    @Test
    public void testBookClubAddMember() {
        ManagerAccount manager = new ManagerAccount("manager", "password", "Bobby Fischer");
        BookClub bookClub = new BookClub(manager);
        MemberAccount newMember = new MemberAccount("member", "password", "Bobby Fischer");
        bookClub.addMember(newMember);
        assertEquals(bookClub.getMembers().size(), 1);
    }

    @Test
    public void testBookClubLogBook() {
        
    }

}
