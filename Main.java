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

                    // TODO: if the array is full (count is 10), print a message

                    // TODO: else if price <= 0 or quantity < 0, print an error message

                    // TODO: otherwise create the Product with the parameterized

                    //       constructor, store it at products[count] and increase count

                    break;

                case 2:

                    // TODO: if count is 0 print a message, otherwise loop from 0 to

                    //       count - 1 and call display() on each product

                    //       (print the number i + 1 before each one)

                    break;

                case 3:

                    // TODO: loop over the stored products, add up stockValue()

                    //       and print the total (message if count is 0)

                    break;

                case 4:

                    // TODO: calculate the average price as a double and print it

                    //       also print it rounded down using an explicit cast

                    break;

                case 5:

                    System.out.print("Product number: ");

                    int num = sc.nextInt();

                    System.out.print("Quantity to add: ");

                    int extra = sc.nextInt();

                    sc.nextLine();

                    // TODO: check num is between 1 and count and extra is above 0,

                    //       otherwise print an error; then add extra to the quantity

                    //       of products[num - 1]

                    break;

                case 6:

                    System.out.print("Product number: ");

                    int n = sc.nextInt();

                    sc.nextLine();

                    // TODO: check n is between 1 and count (and the array is not full)

                    // TODO: create a copy of products[n - 1] with the copy constructor,

                    //       add " (copy)" to the copy's name, store it at

                    //       products[count] and increase count

                    break;

                case 0:

                    System.out.println("Goodbye!");

                    break;

            }

        } while (choice != 0);

        System.out.println("Products created in total: " + Product.totalProducts);

    }
}