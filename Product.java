public class Product{
static int totalProducts = 0;   // static variable: one copy shared by all products
    String name;                    // instance variables: each product has its own
    double price;
    int quantity;
    
    // 1. No-argument constructor: sets default values
    Product() {
        name = "Unknown";
        price = 0;
        quantity = 0;
        totalProducts++;
    }

    // 2. Parameterized constructor
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalProducts++;
    }

    // 3. Copy constructor
    Product(Product other) {
        this.name = other.name;
        this.price = other.price;
        this.quantity = other.quantity;
        totalProducts++;
    }

    double stockValue() {
        return price * quantity;
    }

    void display() {
        System.out.println(name + " | Rs " + price + " | qty " + quantity);
    }

}
