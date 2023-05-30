import java.util.Scanner;

public class SmallestLargestAverage {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the first number: ");
int num1 = input.nextInt();

System.out.print("Enter the second number: ");
int num2 = input.nextInt();

System.out.print("Enter the third number: ");
int num3 = input.nextInt();

// Find the smallest number
int smallest = num1;
if (num2 < smallest) {
smallest = num2;
}
if (num3 < smallest) {
smallest = num3;
}

// Find the largest number
int largest = num1;
if (num2 > largest) {
largest = num2;
}
if (num3 > largest) {
largest = num3;
}

// Calculate the average of three numbers
double average = (num1 + num2 + num3) / 3.0;

// Print the output
System.out.println("The Smallest Number: " + smallest);
System.out.println("The Largest Number: " + largest);
System.out.println("Average of all three numbers: " + average);

input.close();
}

}
