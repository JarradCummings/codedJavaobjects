/*
Cummings,Jarrad
CSC210
*/


//Class

public class Car
   {
      private int yearmodel; // holds the year model of the car.
      private String make; // holds the type of car.
      private int speed;// holds the speed of the car.
      
      // constructor accept the yesrmodel and make as arguments
      public Car (int year, String carmake)
         {
            yearmodel = year;
            make = carmake;
            speed = 0;
         }
         
         //gets the vslues stored in the object yearmodel field
       public int getYearmodel()
         {
            return yearmodel;
         } 
         
          //gets the vslues stored in the object make field
       public String getMake()
         {
            return make;
         }
         
          //gets the vslues stored in the object speed field
       public int getSpeed()
         {
            return speed;
         }
         
         // Adds 5 to the speed field each time it is called
       public void AccelerateSpeed (int speed)
          {
            speed = speed + 5;
          }
          
          // Adds 5 to the speed field each time it is called
       public void BrakeSpeed (int speed)
          {
            speed = speed - 5;
          } 
                  
                  
}