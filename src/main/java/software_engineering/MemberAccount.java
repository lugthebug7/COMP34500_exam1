package software_engineering;

public class MemberAccount extends UserAccount{

    private Boolean isManager = false;
    
    public MemberAccount(String username, String password, String name) {
        super(username, password, name);
    }
}
