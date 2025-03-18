public class StockManager extends User{
    private String name;
    private Store store;

    public StockManager(String name, String ID, String password) {
        super(ID, password);
        this.name = name;
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
}

