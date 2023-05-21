import java.util.Scanner;

public class StringMatcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to match: ");
        String stringToMatch = scanner.nextLine();
        System.out.print("Enter a string to compare: ");
        String inputString = scanner.nextLine();
        if (stringToMatch.equals(inputString)) {
            System.out.println("Strings match!");
        } else {
            System.out.println("Strings do not match.");
        }
    }
}