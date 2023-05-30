import java.util.Scanner;

public class PrimeNumber {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();

boolean prime = true;

//checking if the number is divisible by any other number except 1 and itself
for(int i = 2; i < num; i++) {
if(num % i == 0) {
prime = false;
break;
}
}

if(prime) {
System.out.println(“The given number " + num + " is a Prime number”);
} else {
System.out.println(“The given number " + num + " is NOT a Prime number.”);
}
}

}