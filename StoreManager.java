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

    
}