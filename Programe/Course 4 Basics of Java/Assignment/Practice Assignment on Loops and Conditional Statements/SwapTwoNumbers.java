import java.util.Scanner;

public class SwapTwoNumbers {

public static void main(String[] args) {

Scanner in = new Scanner(System.in);

System.out.print("Enter value of a: ");

int a = in.nextInt();

System.out.print("Enter value of b: ");

int b = in.nextInt();

System.out.println("Before swapping:");

System.out.println("a = " + a + ", b = " + b);

int temp = a;

a = b;

b = temp;

System.out.println("After swapping:");

System.out.println("a = " + a + ", b = " + b);

}

}