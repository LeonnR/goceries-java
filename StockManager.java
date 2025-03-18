public class StockManager {
    private Store store;

    public StockManager(Store store) {
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