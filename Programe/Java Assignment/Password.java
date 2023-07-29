import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Password {
    private static final String Uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String Lowercase = "abcdefghijklmnopqrstuvwxyz";
    private static final String Numbers = "01234567890";
    private static final String SpecialChar = "!@#$%&";
     public static void main(String[]args){
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter the length for password");
         int lengthChar = scanner.nextInt();

         System.out.println("Do you want to add uppercase letters?(y/n)");
         boolean includeUppercase = scanner.next().equalsIgnoreCase("y");

         System.out.println("Do you want to add lowercase letters?(y/n)");
         boolean includeLowercase = scanner.next().equalsIgnoreCase("y");

         System.out.println("Do you want to add numbers?(y/n)");
         boolean includeNumbers = scanner.next().equalsIgnoreCase("y");

         System.out.println("Do you want to add special char?(y/n)");
         boolean includeSpecialChar = scanner.next().equalsIgnoreCase("y");

         String password = generatePassword(lengthChar, includeUppercase, includeLowercase, includeNumbers, includeSpecialChar);

         try{
             FileWriter writer = new FileWriter("password.txt", true);
             writer.write(password + "\n");
             writer.close();
             System.out.println("Passowrd saved to file.");
         }
         catch (IOException e) {
             System.out.println("Error occurred while saving");
             e.printStackTrace();
         }

     }

     private static String generatePassword(int length, boolean includeUppercase, boolean includeLowercase, boolean includeNumbers, boolean includeSpecialChar) {
         StringBuilder characters = new StringBuilder();

         if (includeUppercase){
             characters.append(Uppercase);
         }
         if (includeLowercase){
             characters.append(Lowercase);
         }
         if (includeNumbers){
             characters.append(Numbers);
         }
         if (includeSpecialChar){
             characters.append(SpecialChar);
         }
         Random random = new Random();
         StringBuilder password = new StringBuilder();

         for (int i=0; i < length; i++) {
             int index = random.nextInt(characters.length());
             password.append(characters.charAt(index));
         }
         return password.toString();
     }
}
