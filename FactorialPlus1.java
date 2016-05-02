/*
Cummings,Jarrad
CSC210
*/


import javax.swing.JOptionPane;   
import java.text.DecimalFormat;
import java.util.*;

public class FactorialPlus1
{
   public static void main(String[] arg)
   {
      int numbers=0;
      int result=1;
     double result2=1;
      String temp;
      boolean isNumber = false; 
      DecimalFormat df = new DecimalFormat("#0.00");
      
      
      System.out.println("This application will help us investigate"+
                          "\nhow quick the right part of Euler number"+
                          "\nconverges to its left part."+
                          "\n\nPlease input a nonnegative integer."); 
                          
       Scanner keyboard = new Scanner(System.in); 
     /**input = JOptionPane.showInputDialog("This application will help us investigate"+
                          "\nhow quick the right part of Euler number"+
                          "\nconverges to its left part."+
                          "\n\nPlease input a nonnegative integer.");*/
      do{
         
         /*input = JOptionPane.showInputDialog("\nRemember, a number that's NOT a negative"+
                              " and NOT a letter.");*/
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
      
          
      }while (numbers <0 || !isNumber);
     
    
      for(int i=1;i<=numbers;i++)
      {
         result=result*i;
         
         result2= result2 +(1.0/(result));
     
      
      }//JOptionPane.showMessageDialoq(null,"The factorial of is: "+df.format(result2));
      System.out.println("The factorial of is: "+df.format(result2));
   }
   }