import java.util.Scanner;

public class DistanceConverter {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
boolean flag = true;
while(flag) {
System.out.println("Menu based app - Unit conversion for Distance\n");
System.out.println("1. CM to M");
System.out.println("2. M to KM");
System.out.println("3. KM to M");
System.out.println("4. M to CM\n");
System.out.print("Enter your menu - ");
int choice = input.nextInt();
switch(choice) {
case 1: {
System.out.print("\nPlease enter the CM Value: ");
double cm = input.nextDouble();
double m = cm / 100;
System.out.println(cm + " CM = " + m + " M\n");
break;
}
case 2: {
System.out.print("\nPlease enter the M Value: ");
double m = input.nextDouble();
double km = m / 1000;
System.out.println(m + " M = " + km + " KM\n");
break;
}
case 3: {
System.out.print("\nPlease enter the KM Value: ");
double km = input.nextDouble();
double m = km * 1000;
System.out.println(km + " KM = " + m + " M\n");
break;
}
case 4: {
System.out.print("\nPlease enter the M Value: ");
double m = input.nextDouble();
double cm = m * 100;
System.out.println(m + " M = " + cm + " CM\n");
break;
}
default: {
System.out.println("\nInvalid menu choice, please try again!\n");
break;
}
}
System.out.print("Do you want to Continue: ");
String ch = input.next();
if(ch.equalsIgnoreCase("n")) {
flag = false;
}
}
input.close();
}

}
