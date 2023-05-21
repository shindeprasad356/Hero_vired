import java.util.Scanner;

public class inputjava {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        // System.out.println("Enter Your Name: ");
        // String name = s.nextLine();
        // System.out.println(name);
        // System.out.println("Enter Your Age: ");
        // int age = s.nextInt();
        // if (age >= 18)
        // {
        //     System.out.println("You can vote");
        // } else{
        //     System.out.println("You can't vote");
        // }
        // s.nextLine(); 
        // System.out.println("Enter your Hobbies");
        // String hobby = s.nextLine();
        // System.out.println("Enter your contact number");
        // long phone = s.nextLong();
        
        System.out.print("Who Created Java : ");
        String author = s.nextLine();
        if (author.equalsIgnoreCase("James Gosling")){
            System.out.println("Correct answer");
        }
        else{
            System.out.println("Wrong answer");
        }
           


    }
    
}