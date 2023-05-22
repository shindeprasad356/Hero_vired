public class assignmentOperators {
            public static void main(String[] args) {
                int num1 = 10;
                
                // add 2 to num1 using +=
                num1 += 2;
                System.out.println("After addition: num = " + num1);
                
                // subtract 4 from num1 using -=
                num1 -= 4;
                System.out.println("After subtraction: num = " + num1);
                
                // multiply num1 by 7 using *=
                num1 *= 7;
                System.out.println("After multiplication: num = " + num1);
                
                // divide num1 by 4 using /=
                num1 /= 4;
                System.out.println("After division: num = " + num1);
                
                // get the remainder when num1 is divided by 4 using %=
                num1 %= 4;
                System.out.println("After modulus: num = " + num1);
            }
        }