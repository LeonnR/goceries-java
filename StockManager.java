public class StockManager extends User{
    private String name;
    private Store store;

<<<<<<< HEAD
    public StockManager(String name, String phoneNumber, String ID, String password) {
=======
    public StockManager(String name, String ID, String password) {
>>>>>>> store-manager
        super(ID, password);
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.store = null;
    }

    @Override
    public void goToHomePage(){
        System.out.println("Stock Manager goes to home page");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public void addInventoryItem(Inventory item) {
        store.addInventoryItem(item);
    }

    public void removeInventoryItem(Inventory item) {
        store.removeInventoryItem(item);
    }


    public void updateInventoryItem(Inventory item, int newStock, int newPrice, String newDetails) {
        store.updateInventoryItem(item, newStock, newPrice, newDetails);
    }

    public void goToHomePage(){
        System.out.println("Stock Manager goes to home page");
    }
}

