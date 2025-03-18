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

    public void createStore(String store_name, String store_address, String contactNumber, StoreManager storeManager) {
        store = new Store(store_name, store_address, contactNumber, this);
    }

    public Store getStore() {
        return store;
    }

    public void removeStore() {
        store = null;
    }
}