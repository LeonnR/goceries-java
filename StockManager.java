public class StockManager {
    private String name;
    private Store store;

    public StockManager(String name) {
        this.name = name;
        this.store = null;
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
} 