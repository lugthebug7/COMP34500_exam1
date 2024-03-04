import org.junit.jupiter.api.Test;

import software_engineering.UserAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountsTests {
    
    @Test
    public void testUserAccount() {
        UserAccount user = new UserAccount("username", "password", "Bobby Fischer");
        assertEquals("username", user.getUsername());
        assertEquals("password", user.getPassword());
        assertEquals("Bobby Fischer", user.getName());
        
    }

    @Test
    public void testManagerAccount() {
        UserAccount manager = new UserAccount("manager", "password", "Bobby Fischer");
        assertEquals("manager", manager.getUsername());
        assertEquals("password", manager.getPassword());
        assertEquals("Bobby Fischer", manager.getName());


    }

    @Test
    public void testMemberAccount() {
        UserAccount member = new UserAccount("member", "password", "Bobby Fischer");
        assertEquals("member", member.getUsername());
        assertEquals("password", member.getPassword());
        assertEquals("Bobby Fischer", member.getName());
    }
        


}
