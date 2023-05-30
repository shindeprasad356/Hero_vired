// I was in hospital didnt get time to complete the program so I have written major steps for logic 

import java.util.Arrays;
import java.util.Scanner;

public class InventoryManagement {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

//initialize inventory array
String[][] inventory = {
{"Laptop", "HP", "8GB RAM", "50000", "10"},
{"Smartphone", "Samsung", "6GB RAM", "25000", "20"},
{"Tablet", "Apple", "10.5 inch", "45000", "5"},
{"Speaker", "JBL", "20W", "5000", "15"}
};

//menu options
while(true){
System.out.println("Choose an option:");
System.out.println("1. Product List");
System.out.println("2. Product Count");
System.out.println("3. View Product Details");
System.out.println("4. Edit Product");
System.out.println("5. Update Inventory");
System.out.println("6. Exit");

int choice = sc.nextInt();

switch(choice){
case 1:
//Product List
System.out.println("Product List:");
for(int i = 0; i < inventory.length; i++){
System.out.println(Arrays.toString(inventory[i]));
}
break;

case 2:
//Product Count
System.out.println("Enter the product ID:");
int id = sc.nextInt();
System.out.println("The quantity available is " + inventory[id-1][4]);
break;

case 3:
//View Product Details
System.out.println("Enter the product name:");
String productname = sc.next();

break;


case 4:
//Edit Product
System.out.println("Enter the product name:");
productname = sc.next();

break;



case 5:
//Update Inventory
System.out.println("Enter the product ID:");
id = sc.nextInt();

break;

case 6:
//Exit
System.out.println("Exiting product");

break;

default:
System.out.println("Invalid option selected.");
}

}

}

}