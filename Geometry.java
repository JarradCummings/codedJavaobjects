/*
Cummings,Jarrad
CSC210
Project 5
*/


import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;


/**
	This program demonstrates using static methods
*/
public class Geometry
{
    //instantiate a Scanner object that can be used by all static methods local to this class that need to read from the keyboard
	static Scanner keyboard = new Scanner (System.in);		

    static final int EXIT_MENU = 7;
    
	public static void main (String [] args)
	{    
   
     
        
        int response=EXIT_MENU;
      
		do                                                       // begin loop
		{
			response = getUsersChoice();                         // get the user's choice from the menu
            processChoice(response);                          // process the user's choice
		}
        while (response != EXIT_MENU);                       // repeat if they entered a Y or y response
	}
    
    /**
		The getUsersChoice method returns the user's selection from a menu
		@return The user's choice 
	*/
    public static int getUsersChoice ()
	{
		System.out.println("\n\nThis is a geometry calculator");
		System.out.println("Choose what you would like to calculate");
		System.out.println("1.  Find the area of a circle");
		System.out.println("2.  Find the area of a rectangle");
		System.out.println("3.  Find the area of a triangle");
		System.out.println("4.  Find the circumference of a circle");
		System.out.println("5.  Find the perimeter of a rectangle");
		System.out.println("6.  Find the perimeter of a triangle");
        System.out.println("7.  Exit program");
		System.out.print("Enter your choice:  ");
        int choice = keyboard.nextInt();
        return choice;
	}

    /**
		The processChoice method processes the user's choice from a menu
		@param userChoice  The user's choice
		
	*/    
    public static void processChoice(int userChoice)
    {
            DecimalFormat df = new DecimalFormat("#0.00");
            //process the user's choice
			switch (userChoice)
			{
				case 1: // choice was circle area
                    {
					System.out.print("Enter the radius of the circle:  ");
					double radius = keyboard.nextDouble();
					//call  to the circleArea method. 
					double result = circleArea(radius);
                    
					System.out.println("The area of the circle is " +df.format(result));
                    }
					break; // exit the switch block
				case 2: // choice was rectangle area
                    {
					System.out.print("Enter the length of the rectangle:  ");
					double length = keyboard.nextDouble();
					System.out.print("Enter the width of the rectangle:  ");
					double width = keyboard.nextDouble();
               double result = length*width;
			        //output the result 
					System.out.println("The area of the rectangle is " + result);
                    }
					break; // exit the switch block
				case 3: // choice was triangle area
                    {
					System.out.print("Enter the height of the triangle:  ");
					double height = keyboard.nextDouble();
					System.out.print("Enter the base of the triangle:  ");
					double base = keyboard.nextDouble();
				   double result=base * height *0.5;
					System.out.println("The area of the triangle is " + result);
                    }
					break; // exit the switch block
				case 4:
                    {
					System.out.print("Enter the radius of the circle:  ");
					double radius = keyboard.nextDouble();
			       double result=2*Math.PI * radius;
					System.out.println("The circumference of the circle is " + df.format(result));                    }
					break; // exit the switch block
				case 5:
                    {
					System.out.print("Enter the length of the rectangle:  ");
					double length = keyboard.nextDouble();
					System.out.print("Enter the width of the rectangle:  ");
					double width = keyboard.nextDouble();
					double result=length*2 + width*2;
					System.out.println("The perimeter of the rectangle is " + result);
                    }
					break; // exit the switch block
				case 6:
                    {
					System.out.print("Enter the length of side 1 of the triangle:  ");
					double side1 = keyboard.nextDouble();
					System.out.print("Enter the length of side 2 of the triangle:  ");
					double side2 = keyboard.nextDouble();
					System.out.print("Enter the length of side 3 of the triangle:  ");
					double side3 = keyboard.nextDouble();
					double result= side1 + side2 + side3;
					System.out.println("The perimeter of the triangle is " + result);
                    }
					break; // exit the switch block
                case 7: 
                    System.out.println("You have chosen to exit the program. Good-bye!");
                    break; 
				default:
					System.out.println("You did not enter a valid choice.");
			}	
            //Housekeeping! consume the new line character left in the buffer from the previous keyboard entry 
			keyboard.nextLine();
    }
    
    /**
		The circleArea method returns the area of the circle
		@param radius  The radius of the circle
		@return The area of the circle
	*/
	public static double circleArea(double radius)
	{
        return Math.PI * radius * radius;        
        
	}

   	/**
		The rectangleArea returns the area of the rectangle
		@param length The length of the rectangle
		@param width  The width of the rectangle
		@return The area of the rectangle
	*/
     
	public static double rectangleArea (double length, double width)
	{
      
      return length*width;
      
  	}
	 
 	/**
		The triangleArea method calculates the area of the triangle
		@param height The height of the triangle
		@param base  The base of the triangle
		@return The area of the triangle
	*/
	public static double triangleArea (double height, double base)
	{    
       return base * height *0.5;              
	}
	
		/**
		The circleCircumference returns the circumference of the circle
		@param radius  The radius of the circle
		@return The circumference of the circle
	*/
	public static double circleCircumference(double radius)

	{
                return 2 * Math.PI * radius;
                 
	}
	
	/**
		The rectanglePerimeter method calculates the perimeter of the rectangle
		@param length  The length of the rectangle
		@param width  The width of the rectangle
		@return The perimeter of the rectangle
	*/
	public static double rectanglePerimeter (double length, double width)
	{
      return length*2 + width*2;
   
  	}
	
	/**
		The trianglePerimeter method calculates the perimeter of the triangle
		@param side1 The length of the first side of the triangle
		@param side2 The length of the second side of the triangle
		@param side3 The length of the thrid side of the triangle
		@return The perimeter of the triangle
 
	*/ 
	 public static double trianglePerimeter (double side1, double side2, double side3)
	{
      return side1+side2+side3;
   
  	}

    
}