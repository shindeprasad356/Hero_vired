import java.util.*;
 
// public class Loops{
 
//     public static void main(String []args){
//                 for (int i = 1; i <= 15; i++) {
//                     System.out.println(i);
//                 }
//             }
// }

// public class Loops {
//     public static void main(String[] args) {
//         int n = 10;
//         for (int i = 1; i <= n; i++) {
//             if (i % 2 == 0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }  

// public class Loops {
//     public static void main(String[] args) {
//         int i = 1;
//         while (i <= 10) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }



// public class Loops {
//     public static void main(String[] args) {
//         int n = 5;
//         int factorial = 1;
//         for (int i = 1; i <= n; i++) {
//             factorial *= i;
        
//         }

//     System.out.println("Fact of "  + n + "is :" + factorial); 
    
//     }


// }   


// public class Loops {
//     public static void main(String[] args) {
//         int n = 5;
//         int factorial = 1;
//         int i = 1;
//         while ( i <= n ) {
//             factorial *= i;
//             i++;
        
//         }

//     System.out.println("Fact of "  + n + " is :" + factorial); 
    
//     }


// }    


public class Loops {
    public static void main(String[] args) {
        int n=5;
        int fact=1;

       do{
             fact=fact*n;
            n--;
        }while(n>=10);
       System.out.println("Factorial="+fact);
    }
    
}