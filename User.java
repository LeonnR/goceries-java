public abstract class User{
    private String ID;
    private String password;

    public User(String name, String phoneNumber, String ID, String password){
        this.ID = ID;
        this.password = password;
    }

    public void login(String ID, String password){
        if(this.ID.equals(ID) && this.password.equals(password)){
            System.out.println("Login successful");
        }
        else{
            System.out.println("Login failed");
        }
    }

    public void logout(){
        System.out.println("Logout successful");
    }

    public abstract void signUp();
    public abstract void goToHomePage();
    public abstract void editUserProfile();
    public abstract void confirmOrderReceived();
    public abstract void placeOrder();
    public abstract void viewOrderHistory();
    public abstract void payForOrder();
    public abstract void cancelOrder();
}