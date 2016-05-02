/*
Cummings,Jarrad
CSC210
*/

import javax.swing.*;           //Needed for Swing classes

import java.awt.*;              //Needed for GUI applications

import java.awt.event.*;        //Needed for ActionListener Interface

import java.text.DecimalFormat; //Needed for formatting decimal numbers




//Create a class called TravelExpenses that inherits from JFrame.

	
	public class TravelExpenses extends JFrame
{
      

private JPanel panelNorth;                                                                      
     
private JLabel messageLabelGreeting;                                                           
     
private JPanel panelCenter;
     
private JLabel messageLabelNumDays;                                                              
     
private JLabel messageLabelAirfare;                                                              
     
private JLabel messageLabelRental;                                                          
     
private JLabel messageLabelMiles;                                                          
      
private JLabel messageLabelParking;                                                              
     
private JLabel messageLabelTaxi;                                                              
     
private JLabel messageLabelRegistration;                                                      
     
private JLabel messageLabelLodging;                                                              
     
private JTextField numDaysTextField;                                                              
     
private JTextField airfareTextField;                                                          
      
private JTextField rentalTextField;                                                                  
    
private JTextField milesTextField;                                                                  
    
private JTextField parkingTextField;                                                              
     
private JTextField taxiTextField;                                                                  
    
private JTextField registrationTextField;                                                          
   
private JTextField lodgingTextField;                                                              
    
private JPanel panelSouth;                                                                      
    
private JButton calcButton;                                                                       
   
private final int WINDOW_WIDTH = 500;                                                                   
    
private final int WINDOW_HEIGHT = 500;
  
   

	public TravelExpenses()
   {
        

//Set the title of the window to Travel Expense Calculator.
  
 setTitle("Travel Expense Calculator");  
      
   

//Set the size of the window using the constants.
   
setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
  
   

//Specify what happens when the close button is clicked.
   
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
   

//Get the content pane of the JFrame and set the layout manager to border layout.
 
getContentPane().setLayout(new BorderLayout());
  
   

//Create a greeting label that contains the message �This program will calculate your travel expenses!�
  
 messageLabelGreeting = new JLabel("This program will calculate your travel expenses!");
  
   

//Create the north panel.
   
panelNorth = new JPanel();
  
   

//Add the label to the north panel.
   
panelNorth.add(messageLabelGreeting);
  
  

//Add north panel to the content frame.
   
add(panelNorth, BorderLayout.NORTH);
  
   

//Create labels that direct the user to enter the required information.
   messageLabelNumDays = new JLabel("Enter the number of days you traveled:");                                                              
   messageLabelAirfare = new JLabel("Enter the amount of your airfare, without dollar sign or commas. If none, enter 0:");                                                              
   messageLabelRental = new JLabel("Enter the daily rate of your rental car, without dollar sign or commas. If none, " +
                                   "enter 0:");                                                          
   messageLabelMiles = new JLabel("Enter the number of miles you drove daily in your private vehicle. If none, enter 0:");                                                          
   messageLabelParking = new JLabel("Enter the daily rate of parking fees you paid, without dollar sign or commas. " +
                                   "If none, enter 0:");                                            
messageLabelTaxi = new JLabel("Enter the daily rate of taxi fees you paid, without dollar sign or commas. " + "If none, enter 0:");                                                              
   messageLabelRegistration = new JLabel("Enter any seminar or conference registration fees you paid, without dollar " +
                                          "sign or commas. If none, enter 0:");                                                      
   messageLabelLodging = new JLabel("Enter the per night rate of lodging you paid, without dollar sign or commas:");
  
   //Create text fields to recieve user input.
   numDaysTextField = new JTextField(10);                                                              
   airfareTextField = new JTextField(10);                                                          
   rentalTextField = new JTextField(10);                                                                  
   milesTextField = new JTextField(10);                                     
parkingTextField = new JTextField(10);   
taxiTextField = new JTextField(10);                                                                  
   
registrationTextField = new JTextField(10);                                                          
   
lodgingTextField = new JTextField(10);
  
  

//Create the center panel.
   
panelCenter = new JPanel();
  
   

//Add all labels and text fields to center panel.
  
panelCenter.add(messageLabelNumDays);
  
panelCenter.add(messageLabelAirfare);  
   
panelCenter.add(messageLabelRental);
   
panelCenter.add(messageLabelMiles);
  
panelCenter.add(messageLabelParking);
  
panelCenter.add(messageLabelTaxi);
   
panelCenter.add(messageLabelRegistration);
  
panelCenter.add(messageLabelLodging);
   
panelCenter.add(numDaysTextField);
   
panelCenter.add(airfareTextField);
   
panelCenter.add(rentalTextField);
   
panelCenter.add(milesTextField);
  
panelCenter.add(parkingTextField);
  
panelCenter.add(taxiTextField);
  
panelCenter.add(registrationTextField);
   
panelCenter.add(lodgingTextField);
  
  
 
//Add center panel to content frame.
   
add(panelCenter, BorderLayout.CENTER);
  
  
 
//Create a button with the caption "Calculate".
   
calcButton = new JButton("Calculate");
  
   

//Add button listener that implements action listener for this button.
   
calcButton.addActionListener(new CalcButtonListener());
  
  
 
//Create the south panel.
   
panelSouth = new JPanel();
  
   

//Add button to the south panel.
  
panelSouth.add(calcButton);
  
  
 
//Add south panel to content frame.
  
 add(panelSouth, BorderLayout.SOUTH);
  
   
//Display the window.
   
setVisible(true);  

   
}


   

//Write a private inner class called CalcButtonListener that implements ActionListener.
   

private class CalcButtonListener implements ActionListener
   
 {
      
     
public void actionPerformed(ActionEvent e)
      
 {
           
//Variables
           
String input;                             //To hold user input
           
double numDays;                           //Number of days traveled. Must be at least 1
           
double airfare;                           //Amount of airfare.   Must be at least 0
           
double rentalFees;                       //Amount of rental car fees. Must be at least 0
          
double milesDriven;                        //Amount of miles driven in personal vehicle. Must be at least 0
           
double parkingFees;                       //Amount of parking fees. Must be at least 0
           
double taxiCharges;                        //Amount of taxi charges. Must be at least 0
           
double registrationFees;                    //Amount of conference or seminar registration fees. Must be at least 0
           
double lodgingCharges;                    //Amount of lodging charges. Must be at least 1
          
double totalExpenses;                     //Total amount of travel expenditures.
           
double milesDrivenAllowableExpense;        //Total amount of gas money allowable to be reimbursed.
          
double mealsAllowableExpense = 37;        //Total amount of meals allowable to be reimbursed.
          
double parkingAllowableExpense = 10;      //Total amount of parking fees allowable to be reimbursed.
          
double taxiAllowableExpense = 20;         //Total amount of taxi fees allowable to be reimbursed.
           
double lodgingAllowableExpense = 95;      //Total amount of lodging fees allowable to be reimbursed.
           
double totalAllowableExpenses;            //Total amount that can be reimbursed.
           
double expenseDifference;                  //Difference between travel expenditures and total amount that can be
                                                     

          

input = numDaysTextField.getText();
           
numDays = Double.parseDouble(input);
           

input = airfareTextField.getText();
           
airfare = Double.parseDouble(input);
           

input = rentalTextField.getText();
          
rentalFees = Double.parseDouble(input);
           

input = milesTextField.getText();
           
milesDriven = Double.parseDouble(input);
           

input = parkingTextField.getText();
           
parkingFees = Double.parseDouble(input);
           

input = taxiTextField.getText();
           
taxiCharges = Double.parseDouble(input);
           

input = registrationTextField.getText();
           
registrationFees = Double.parseDouble(input);
          

input = lodgingTextField.getText();
           
lodgingCharges = Double.parseDouble(input);
          
           //While loop to validate numDays input is greater than 0.
           

while (numDays <= 0)
           {
               //Dialog box to let the user know to try again.
               
input = JOptionPane.showInputDialog(null, "The number of days you traveled must be greater than 0! " +
 "Try again.");
               
numDays = Double.parseDouble(input);          
              
           }//end while loop
          
          

//While loop to validate airfare input is not a negative number.
           

while (airfare < 0)
           {
               //Dialog box to let the user know to try again.
               
input = JOptionPane.showInputDialog(null, "Airfare cannot be a negative number! Try again.");
               
airfare = Double.parseDouble(input);          
              
           }//end while loop
          
           //While loop to validate rentalFees input is not a negative number.
           

while (rentalFees < 0)
           {
               //Dialog box to let the user know to try again.
               
input = JOptionPane.showInputDialog(null, "Rental fees cannot be a negative number! Try again.");
               
rentalFees =Double.parseDouble(input);          
              
           }//end while loop
          
           //While loop to validate milesDriven input is not a negative number.
           

while (milesDriven < 0)
           {
               //Dialog box to let the user know to try again.
               
input = JOptionPane.showInputDialog(null, "The miles you drove cannot be a negative number! Try again.");
               
milesDriven = Double.parseDouble(input);          
              
           }//end while loop
          
           //While loop to validate parkingFees input is not a negative number.
           

while (parkingFees < 0)
           {
               //Dialog box to let the user know to try again.
               
input = JOptionPane.showInputDialog(null, "Your parking fee cannot be a negative number! Try again.");
              
parkingFees = Double.parseDouble(input);          
              
           
}           
while (taxiCharges < 0)
           {
               //Dialog box to let the user know to try again.
               input = JOptionPane.showInputDialog(null, "Your taxi charges cannot be a negative number! Try again.");
               taxiCharges = Double.parseDouble(input);          
              
           }  
           