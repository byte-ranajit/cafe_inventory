import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // reading input: provided for you
        Product[] products = new Product[10];  // an array with room for 10 products
        int count = 0;                         // how many products are stored so far
        int choice;

        do {

            System.out.println("\n--- Campus Cafe Inventory ---");
            System.out.println("1. Add product");
            System.out.println("2. Display all products");
            System.out.println("3. Total stock value");
            System.out.println("4. Average price");
            System.out.println("5. Restock a product");
            System.out.println("6. Duplicate a product");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            choice = sc.nextInt();
            sc.nextLine();   // clears the leftover newline after nextInt()
            
            if (choice < 0 || choice > 6) {
                System.out.println("Invalid choice, try again.");
            }

            switch (choice) {

                case 1:

                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();

                    if(count == products.length) {
                        System.out.println("Array is full, cannot add more products.");
                    } else if(price <= 0 || quantity < 0) {
                        System.out.println("Invalid price or quantity.");
                    } else {
                        products[count] = new Product(name, price, quantity);
                        count++;
                    }

                    break;

                case 2:

                    if(count == 0) {
                        System.out.println("No products to display.");
                    } else {
                        for(int i = 0; i < count; i++) {
                            System.out.print((i + 1) + ". ");
                            products[i].display();
                        }
                    }
                    break;

                case 3:

                    double totalStockValue = 0;
                    if(count == 0) {
                        System.out.println("No products to calculate stock value.");
                    } else {
                        for(int i = 0; i < count; i++) {
                            totalStockValue += products[i].stockValue();
                        }
                        System.out.println("Total stock value: Rs " + totalStockValue);
                    }

                    break;

                case 4:

                    double totalPrice = 0;
                    if(count == 0) {
                        System.out.println("No products to calculate average price.");
                    } else {
                        for(int i = 0; i < count; i++) {
                            totalPrice += products[i].price;
                        }
                        double averagePrice = totalPrice / count;
                        System.out.println("Average price: Rs " + averagePrice);
                        System.out.println("Average price (rounded down): Rs " + (int)averagePrice);
                    }

                    break;

                case 5:

                    System.out.print("Product number: ");
                    int num = sc.nextInt();
                    System.out.print("Quantity to add: ");
                    int extra = sc.nextInt();
                    sc.nextLine();

                    if(num < 1 || num > count) {
                        System.out.println("Invalid product number.");
                    } else if(extra <= 0) {
                        System.out.println("Quantity to add must be positive.");
                    } else {
                        products[num - 1].quantity += extra;
                        System.out.println("Product restocked successfully.");
                    }

                    break;

                case 6:

                    System.out.print("Product number: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    if(n < 1 || n > count) {
                        System.out.println("Invalid product number.");
                    } else if(count == products.length) {
                        System.out.println("Array is full, cannot duplicate product.");
                    } else {
                        Product original = products[n - 1];
                        Product copy = new Product(original);
                        copy.name += " (copy)";
                        products[count] = copy;
                        count++;
                        System.out.println("Product duplicated successfully.");
                    }

                    break;

                case 0:

                    System.out.println("Goodbye!");

                    break;

            }

        } while (choice != 0);

        System.out.println("Products created in total: " + Product.totalProducts);
        
        sc.close();

    }
}