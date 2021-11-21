package quanlykhohang.model.entities;
import java.util.Date;

public class Product implements Comparable<Product>{
    private String id;
    private String type;
    private String name;
    private int quantity;
    private int inventory;
    private double price;
    private Date inputDay;

    public Product() {
    }

    public Product(String type, String name, int quantity, double price, Date inputDay, int inventory) {
        this.id = type+"_"+System.currentTimeMillis();
        this.type = type;
        this.name = name;
        this.inventory = inventory; 
        this.quantity = quantity;
        this.price = price;
        this.inputDay = inputDay;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInputDay(Date inputDay) {
        this.inputDay = inputDay;
    }

    public Date getInputDay() {
        return inputDay;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("==> id = " + id + " <==");
        System.out.println("==> type = " + type +" <==");
        System.out.println("==> name = " + name +" <==");
        System.out.println("==> quantity = " + quantity +" <==");
        System.out.println("==> inventory = " + inventory +" <==");
        System.out.println("==> price = " + price + " USD/product" +" <==");
        System.out.println("==> inputDay = " + inputDay +" <==");
        System.out.println("==> Depot = " + (price*(inventory+quantity)) + "USD" + " <==");
        System.out.println("---------------------------------");
        System.out.println("");
        return "";
    }

    // Nó sẽ so sánh để trả về 1 giá trị kiểu số dương
    @Override
    public int compareTo(Product o) {
        return (int) (this.getPrice()-o.getPrice());
    }
}
