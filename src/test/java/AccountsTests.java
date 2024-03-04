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
    }

    @Test
    public void testManagerAccount() {}

    @Test
    public void testMemberAccount() {}
        


}
