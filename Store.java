import java.util.ArrayList;

public class Store {
	private String name;
	private ArrayList<Inventory> inventory;
	private StoreManager manager;
	private StockManager stockManager;

	public Store(String name, StoreManager m, StockManager sm){
		this.name = name;
		this.inventory = new ArrayList<Inventory>();
		this.manager = m;
		this.stockManager = sm;
	}


}
