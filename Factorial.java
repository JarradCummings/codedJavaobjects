/*
Cummings,Jarrad
CSC210
Extra Credit
*/
   
//Import Statement
import java.util.Scanner;

public class Factorial
{
   public static void main(String[] arg)
   {
      int numbers=0;
      int result=1;
      String temp;
      boolean isNumber = false; 
      
      System.out.println("This program computes"+
                          " and prints its factorial."+
                          "\nPlease input a nonnegative integer."); 
      
      Scanner keyboard = new Scanner(System.in); 
      
      do{
         
         System.out.println("\nRemember, a number that's NOT a negative"+
                              " and NOT a letter.");
      
         temp=keyboard.nextLine();
      
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
      
      
      }System.out.println("The factorial of is: "+result);
   }
}