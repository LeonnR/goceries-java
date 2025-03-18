public class StoreManager extends User{
    private String name;
    private String managerID;
    private Store store;

<<<<<<< HEAD
    public StoreManager(String name, String managerID, Store store, String phoneNumber, String password) {
        super(managerID, password);
=======
    public StoreManager(String name, String managerID, Store store, String ID, String password){
        super(ID, password);
>>>>>>> store-manager
        this.name = name;
        this.managerID = managerID;
        this.store = store;
    }

    @Override
    public void goToHomePage(){
        System.out.println("Store Manager goes to home page");
    }

    public void changeStore(Store store){
        this.store.setManager(null);
        this.store = store;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void createStore(String store_name, StockManager stockManager) {
        store = new Store(store_name, this, stockManager);

    }

    public Store getStore() {
        return store;
    }

    public void moveStore(String newAddress){
        store.changeAddress(newAddress);
    }

    public void removeStore() {
        store.closeStore();
        store = null;
    }

<<<<<<< HEAD
    public void goToHomePage(){
        System.out.println("Store Manager goes to home page");
    }
}
=======
    public void listInventory(){
        store.listInventory();
    }

    public void updatedetails(Inventory inv, String newDetails){
        store.updateProductDetail(inv, newDetails);
    }

    public void addProduct(Inventory inv){
        store.addInventoryItem(inv);
    }

    public void deleteProduct(Inventory item){
        store.removeInventoryItem(item);
    }
}
>>>>>>> store-manager
