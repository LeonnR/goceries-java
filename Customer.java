public class Customer extends User  {
    private String name;
    private String phoneNumber;
    private String ID;
    private String password;
    
    public Customer(String name, String phoneNumber, String ID, String password){
        super(name, phoneNumber, ID, password);
    }

    @Override
    public void goToHomePage(){
        //TODO: Implement go to home page
    }

    public void signUp(){
        //TODO: Implement sign up
    }

    public void placeOrder(){
        //TODO: Implement place order
    }

    public void viewOrderHistory(){
        //TODO: Implement view order history
    }

    public void payForOrder(){
        //TODO: Implement pay for order
    }

    public void cancelOrder(){
        //TODO: Implement cancel order
    }

    public void editUserProfile(){
        //TODO: Implement edit user profile
    }

    public void confirmOrderReceived(){
        //TODO: Implement confirm order received
    }
}