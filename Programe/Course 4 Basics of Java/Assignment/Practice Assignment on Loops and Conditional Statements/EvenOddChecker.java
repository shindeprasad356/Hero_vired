import java.util.Scanner;

public class EvenOddChecker {

public static void main(String[] args) {

Scanner in = new Scanner(System.in);

char choice;

do {

System.out.println("Menu based app - Even/Odd Checker");

System.out.print("Please enter the number: ");

int num = in.nextInt();

if(num % 2 == 0) {

System.out.println("The given number - " + num + " is an EVEN Number");

} else {

System.out.println("The given number - " + num + " is an ODD Number");

}

System.out.print("Do you want to Continue: ");

choice = in.next().charAt(0);

} while(choice == 'y' || choice == 'Y');

}

}