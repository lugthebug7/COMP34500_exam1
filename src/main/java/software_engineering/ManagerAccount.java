package software_engineering;

public class ManagerAccount extends UserAccount{

    private Boolean isManager = true;
    
    public ManagerAccount(String username, String password, String name) {
        super(username, password, name);
    }
 
}
