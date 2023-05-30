import java.util.Scanner;

public class InventoryManagementSystem {
    static String[] productName = {"Product A", "Product B", "Product C"};
    static String[] productSpecs = {"Specs A", "Specs B", "Specs C"};
    static double[] productCost = {, , };
    static int[] productQuantity = {5, 10, 3};

    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        int choice;

        do {
            ("Inventory Management System Menu:");
            ("1. Product List");
            ("2. Product Count");
            ("3. View Product Details");
            ("4. Edit Product");
            ("5. Update Inventory");
            ("0. Exit");

            ("Enter your choice: ");
            choice = ();

            switch (choice) {
                case 0:
                    ("Exiting ");
                    break;
                case 1:
                    displayProductList();
                    break;
                case 2:
                    checkProductCount();
                    break;
                case 3:
                    viewProductDetails();
                    break;
                case 4:
                    editProduct();
                    break;
                case 5:
                    updateInventory();
                    break;
                default:
                    ("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }

    public static void displayProductList() {
        ("Product List:");
        for (int i = 0; i < ; i++) {
            (productName[i]);
        }
    }

    public static void checkProductCount() {
        Scanner scanner = new Scanner();
        ("Enter the product ID: ");
        int id = ();
        ("Quantity available: " + productQuantity[id-1]);
    }

    public static void viewProductDetails() {
        Scanner scanner = new Scanner();
        ("Enter the product name: ");
        String name = ();
        int id = -1;
        for (int i = 0; i < ; i++) {
            if ((productName[i])) {
                id = i;
                break;
            }
        }
        if (id != -1) {
            ("Product Details:");
            ("Name: " + productName[id]);
            ("Specifications: " + productSpecs[id]);
            ("Cost: $" + productCost[id]);
            ("Quantity available: " + productQuantity[id]);
        } else {
            ("Product not found.");
        }
    }

    public static void editProduct() {
        Scanner scanner = new Scanner();
        ("Enter the product name: ");
        String name = ();
        int id = -1;
        for (int i = 0; i < ; i++) {
            if ((productName[i])) {
                id = i;
                break;
            }
        }
        if (id != -1) {
            ("Enter the new product information:");
            ("Specifications: ");
            productSpecs[id] = ();
            ("Cost: $");
            productCost[id] = ();
            ("Quantity available: ");
            productQuantity[id] = ();
        } else {
            ("Product not found.");
        }
    }

    public static void updateInventory() {
        Scanner scanner = new Scanner();
        ("Enter the product ID: ");
        int id = ();
        ("Increase or decrease quantity? (+/-): ");
        String operation = ();
        ("Enter the quantity: ");
        int quantity = ();
        if (("+")) {
            productQuantity[id-1] += quantity;
        } else if (("-")) {
            productQuantity[id-1] -= quantity;
        } else {
            ("Invalid operation.");
        }
    }
}