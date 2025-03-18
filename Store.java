import java.util.ArrayList;

public class Store {
	private String name;
	private ArrayList<Inventory> inventory;
	private StoreManager manager;
	private StockManager stockManager;
	private String address;

	public Store(String name, StoreManager m, StockManager sm){
		this.name = name;
		this.inventory = new ArrayList<Inventory>();
		this.manager = m;
		this.stockManager = sm;
	}

  public void setManager(StoreManager newSM){
        this.manager = newSM;
  }
	public void changeAddress(String newAddress){
		address = newAddress;
	}

	public void closeStore(){
		name = null;
		manager = null;
		stockManager = null;
		address = null;
		inventory.clear();
	}

	public void addInventoryItem(Inventory item){
		inventory.add(item);
	}

	public void removeInventoryItem(Inventory item){
		inventory.remove(item);
	}


	public void updateInventoryItem(Inventory item, int newStock, int newPrice, String newDetails){
		item.changeStock(newStock);
		item.changePrice(newPrice);
		item.changeDetails(newDetails);
	}
  
  
}
