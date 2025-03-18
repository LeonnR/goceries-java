public class StoreManager {
    private String name;
    private Store store;

    public StoreManager(String name) {
        this.name = name;
        store = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createStore(String store_name, StoreManager manager, StockManager stockManager) {
        store = new Store(store_name, manager, stockManager);
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