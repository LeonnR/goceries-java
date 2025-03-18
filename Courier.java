public class Courier extends User {
    private String name;
    private String phoneNumber;

    
    public Courier(String name, String phoneNumber, String ID, String password) {
        super(ID, password);
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public void goToHomePage() {
        System.out.println("Courier goes to home page");
    }
    
    public void takeOrder() {
        // Implement takeOrder functionality
    }
}

