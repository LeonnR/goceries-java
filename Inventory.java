public class Inventory {
    private String name;
    private int stock;
    private String details;
    private int price;

    public Inventory(String name, int stock, String details, int price){
        this.name = name;
        this.stock = stock;
        this.details = details;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public String getDetails(){
        return details;
    }

    public void changePrice(int newPrice){
        this.price = newPrice;
    }

    public void changeDetails(String newDetails){
        this.details = newDetails;
    }

    public void incrementStock(){
        this.stock++;
    }
    
    public void decrementStock(){
        this.stock--;
    }

    public void changeStock(int newStock){
        this.stock = newStock;
    }
}
