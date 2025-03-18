public class Courier extends User {
    private String name;
    private String phoneNumber;
    private String ID;
    private String password;
    
    public Courier(String name, String phoneNumber, String ID, String password) {
        super(name, phoneNumber, ID, password);
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.ID = ID;
        this.password = password;
    }
    
    @Override
    public void goToHomePage() {
        System.out.println("Courier goes to home page");
    }
    
    public void takeOrder() {
        // Implement takeOrder functionality
    }
}

