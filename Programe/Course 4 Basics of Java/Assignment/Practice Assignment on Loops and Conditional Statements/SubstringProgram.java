import java.util.Scanner;

public class SubstringProgram {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Read the input string
System.out.print("Enter the input string: ");
String inputString = sc.nextLine();

// Read the starting index
System.out.print("Enter the starting index: ");
int startIndex = sc.nextInt();

// Read the ending index
System.out.print("Enter the ending index: ");
int endIndex = sc.nextInt();

// Calculate the substring
String subString = inputString.substring(startIndex, endIndex + 1);

// Print the result
System.out.println("The substring of " + inputString + " from " + startIndex + " to " + endIndex + " is: " + subString);

// Close the scanner
sc.close();
}
}