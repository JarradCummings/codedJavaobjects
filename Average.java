/*
Cummings, Jarrad
CSC210
*/

//import statement

import java.util.*;

//Class

public class Average {
	
	private int[] data;
   	private double mean;
           
   public Average()
    {
    data = new int[5];
    Scanner keyboard = new Scanner (System.in);
     
    for (int index = 0; index < data.length; index++)
    {
    System.out.println ("Please enter test score no." + (index+1) + ": ");
    data[index]= keyboard.nextInt();
    }
    selectionSort ();
     
    calculateMean();
     
    }
     
   public void selectionSort ()
    {
      int maxIndex;
      int maxValue;
 
   for (int startScan = 0; startScan < data.length-1; startScan++)
    
    {
      maxIndex = startScan;
      maxValue = data[startScan];
   for (int index = startScan + 1; index < data.length; index++)
    
    {
   if (data[index] > maxValue)
    {
      maxValue = data[index];
      maxIndex = index;
    }
    }
      data[maxIndex] = data[startScan];
      data[startScan] = maxValue;
     }    
    }
     
     
   public void calculateMean()
    {
     int runningTotal=0 ; 
      
     for (int index = 0; index < data.length; index++)
    {
    runningTotal = runningTotal + data[index]; 
    }
    mean = (runningTotal/data.length);
    }
    
   public String toString()
    {
     
     String output;
     output = "The test scores in descending order are \n ";
    
   for (int index = 0; index < data.length; index++)
    {
     output = output + data[index] + " ";
    }
     output = output + "\nThe average is " + mean;
     return output;
     
	}	
}
