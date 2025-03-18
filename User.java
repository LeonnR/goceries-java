public abstract class User{
    private String ID;
    private String password;

    public User(String ID, String password){
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

    public abstract void goToHomePage();
}