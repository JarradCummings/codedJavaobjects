/*
Cummings,Jarrad
CSC210
*/

import java.util.Scanner;
import java.text.*;


public class PayrollClass
{
   public static void main(String[] args)
   {
      int[] employId = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850,7580489};
                     
      Scanner input = new Scanner (System.in);
      
      int hours;
      double payrate; 
      double[] grosspay = new double[7]; 
      
   
      for (int index = 0; index < 7; index++)
      {
         System.out.println("Enter the hours worked by employee number: "
                            + employId[index]);
                            
         hours = input.nextInt();
         
         for(;hours <= 0;)
         {
            System.out.println("Error: 0 or greater for hours.");
         
            
            System.out.println("Enter the hours worked by employee number: "
                            + employId[index]);
                            
            hours = input.nextInt();
         }   
         
         System.out.println("Enter the pay rate worked by employee number: "
                            + employId[index]);
                            
         payrate = input.nextDouble();
        
         for(;payrate < 6.0;)
         {
            System.out.println("Error: 6 or greater for payrate.");
            
            System.out.println("Enter the pay rate worked by employee number: "
                            + employId[index]);
                            
            payrate = input.nextDouble();
            
            
         }
         
         grosspay[index] = hours*payrate;
      }
              
      display(employId,grosspay);
   }     
   
   public static void display(int[]emId,double[]gPay){
   
      DecimalFormat df =new DecimalFormat("#.00");
   
      System.out.println("PAYROLL DATA");
      System.out.println("============");
   
      for (int index = 0; index < 7; index++)
      {
      
         System.out.println("Employee ID: " + emId[index]);
         System.out.println("Gross Pay: $ " + (df.format(gPay[index])));
         System.out.println("   ");
      }
   
   }
}
