import java.util.*;
 
public class EmiCalc{
 
    public static void main(String []args)
    {
         
        //Scanner class to take user input.
        Scanner X = new Scanner(System.in);
         
        double principal, rate, time, emi;
  
        System.out.print("Enter principal: ");
        principal = X.nextFloat();
      
        System.out.print("Enter rate: ");
        rate = X.nextFloat();
      
        System.out.print("Enter time in year: ");
        time = X.nextFloat();
      
        rate=rate/(12*100); /*one month interest*/
        time=time*12; /*one month period*/
      
      
        emi= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
      
        System.out.print("Monthly EMI is= "+emi+"\n");
                 
    }
}