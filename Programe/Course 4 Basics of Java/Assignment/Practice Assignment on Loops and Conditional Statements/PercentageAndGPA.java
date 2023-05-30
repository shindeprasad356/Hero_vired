import java.util.Scanner;

public class PercentageAndGPA {

public static void main(String[] args) {

Scanner in = new Scanner(System.in);

System.out.print("Enter marks obtained: ");

float marks = in.nextFloat();

System.out.print("Enter total marks: ");

float totalMarks = in.nextFloat();

float percentage = (marks / totalMarks) * 100;

System.out.println("Percentage = " + percentage + "%");



if(percentage >= 90) {

System.out.println("Grade: A");

System.out.println("GPA: 4.0");

} else if(percentage >= 80) {

System.out.println("Grade: B");

System.out.println("GPA: 3.0");

} else if(percentage >= 70) {

System.out.println("Grade: C");

System.out.println("GPA: 2.0");

} else if(percentage >= 60) {

System.out.println("Grade: D");

System.out.println("GPA: 1.0");

} else {

System.out.println("Grade: F");

System.out.println("GPA: 0.0");

}

}

}