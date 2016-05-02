/*
Cummings,Jarrad
CSC210
Project 9
*/
 
 
import java.util.Scanner;

public class TimeDemo
{
	public static void main (String [] args)
	{	
		Scanner key = new Scanner(System.in);
		char answer = 'Y';
		String enteredTime;
		String response;
	
		// Prompt for user input of time in military form
		// Prompt for user input for action and validation of input
		while (answer == 'Y')
		{
			// Prompt for and save user unput.
			System.out.print("Enter a miitary time using the ##:## form   ");
			enteredTime = key.nextLine();
			
			Time now = new Time (enteredTime);
			
			// Check for user preference and validate user input.
			do
			{	
				System.out.print("\nDo you want to enter another (Y/N)?  ");
				response = key.nextLine().toUpperCase();
				
				answer = response.charAt(0);
				
				if (answer != 'Y'  &&   answer != 'N')
		 			System.out.println("\nLooks like you have an invalid entry."+
                                 "\n"+"\nPlease try again.");
			}
			while (answer != 'Y'  &&   answer != 'N');
		}
		System.out.println ("\n'Till we meet again. Ciao.");
	}
}