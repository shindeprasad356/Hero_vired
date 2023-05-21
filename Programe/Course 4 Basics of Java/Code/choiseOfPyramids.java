import java.util.Scanner;

public class choiseOfPyramids {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select a pattern to print:");
        System.out.println("1. Pyramid");
        System.out.println("2. Diamond");
        System.out.println("3. Number Pattern");
        System.out.println("4. Floyd's Triangle ");

        System.out.print("Enter your choice (1-4): ");
        int choice=sc.nextInt();2
        switch (choice){
            case 1:{
                System.out.println("Pyramid Pattern: ");
                break;
            }
            case 2:{
                System.out.println("Diamond Pattern: ");
                break;

        }
        case 3:{
            System.out.println("Number Pattern: ");
            break;
        
    }
        case 4:{
            System.out.println("Floyd's Triangle Pattern: ");
            break;
        }
        default:{
            System.out.println("Invalid Choice");
        }
    }
    
}}