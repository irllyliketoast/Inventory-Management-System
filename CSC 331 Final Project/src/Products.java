// Product class representing individual products
// product is the superclass
// subclasses include daily products, weekly products, and month products
// daily products extends products like milk
// weekly products extends products like meat
// monthly products extends products like toilet paper
// each singular product like product price and identification number

public class Products {
    /**
     * @author Group 15 - Laura Estremera
     * Course: CSC 331-001
     * Date: 4/5/2024
     * Description: This represents the product as an object.
     *  This class included the item ID, the name of the item, the price of the item,
     *  and the quanity that has been sold from our grocery store.
     */
    private int id;
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Products(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Override toString method to provide a string representation of the Product
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
