public class StoreManager {
    private String name;
    private String managerID;
    private Store store;

    public StoreManager(String name, String managerID, Store store){
        this.name = name;
        this.managerID = managerID;
        this.store = store;
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
}