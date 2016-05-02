/*
Cummings,Jarrad
CSC210
*/

//Import statement

import java.util.*;

//Class

public class CarDemo
   {
      public static void main(String[]args)
         {
            
           
            
            Car car = new Car (2004, "Porshe");
            
            System.out.println("Year Model: " + Car.getYearmodel); 
            System.out.println("Make: " + Car.getMake);
            System.out.println("Car Speed: " + Car.getSpeed);
            
            for (int number = 1; number <= 5; nunmber ++);
            
            Car.Acceleratespeed();
            System.out.println (" the speed is now" + Car.getSpeed);
            
            
            for (int number = 1; number <= 5; nunmber --);
            
            Car.Brakespeed();
            System.out.println (" the speed is now" + Car.getSpeed);

            
            

            
            }
            }