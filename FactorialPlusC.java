/*
Cummings,Jarrad
CSC210
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class FactorialPlusC 
{
   public static void main(String[] arg)
   {
      int numbers=0;
      int result=1;
     double finalResult=1.0;
     String temp;
      boolean isNumber = false; 
      DecimalFormat df = new DecimalFormat("#0.00");
      
      
      System.out.println("This application will calculate e^x."+
                         "\nPlease enter value of X and the precision"+
                         "\nof which e^x should be calculated."); 
                          
      
      Scanner keyboard = new Scanner(System.in); 
      
      do{
         
         System.out.println("\nRemember, a number that's NOT a negative"+
                              " and NOT a letter.");
      
         temp=keyboard.nextLine();
         
         System.out.println("\nHowever, X can be a negative number"+
                              " and NOT a letter.");
         finalResult=keyboard.nextDouble();
      
         try
         {
            numbers = Integer.valueOf(temp);
            isNumber = true;
         }
         catch(Exception e)
         {
            isNumber = false;
         }
      
          
      }while (numbers <=0 || !isNumber);
     
    
      for(int i=1;i<=numbers;i++)
      {
         result=result*i;
         
         finalResult= finalResult + (Math.pow((finalResult),i)/(result));
     
      
      }System.out.println("The factorial of is: "+df.format(finalResult));
   }
}