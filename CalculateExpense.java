/*
Cummings,Jarrad
CSC210
*/

//import statement
    
import javax.swing.*;         //Needed for Swing Classes
import java.awt.*;            //Needed for GUI applications
import java.awt.event.*;      //Needed for ActionListener Interface
import java.text.DecimalFormat; //Needed for formatting decimal numbers


/**
   The CalculateExpense class displays a JFrame that
   lets the user enter a wholesale cost and its
   markup percetage into text fields.
*/

public class CalculateExpense extends JFrame
{
   private JPanel panel;               //To reference a panel
   private JLabel messageLabel1;        //To reference a label 1
   private JLabel messageLabel2;        //To reference a label 2
   private JLabel messageLabel3;        //To reference a label 3
   private JLabel messageLabel4;        //To reference a label 4
   private JLabel messageLabel5;        //To reference a label 5
   private JLabel messageLabel6;        //To reference a label 6
   private JLabel messageLabel7;        //To reference a label 7
   private JLabel messageLabel8;        //To reference a label 8
   private JTextField NumDaysTextField;   //To reference a text field
   private JTextField AirFareTextField;   //To reference a text field
   private JTextField CarRentalTextField;   //To reference a text field
   private JTextField MilesDrivenTextField;   //To reference a text field
   private JTextField ParkingFeesTextField;   //To reference a text field
   private JTextField TaxiFeesTextField;   //To reference a text field
   private JTextField ConferenceRegTextField;   //To reference a text field
   private JTextField LodgingTextField;   //To reference a text field
   private JButton CalcButton;            //To reference a button
   private JButton ResetButton;
   private final int WINDOW_WIDTH = 200;  //Window width
   private final int WINDOW_HEIGHT = 500; //Window height
  
   /**
      Constructor
   */
   
   public CalculateExpense()
   {
      //Set the window tile.
      setTitle("Travel Expenses");
      
      //Set the size of the window.
      setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
      
      //Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //Build the panel and add it to the frame
      buildPanel();
      
      //Add the panel to the frame's contenct pane.
      add(panel);
      
      //Display the window
      setVisible(true);
    }
    
    /**
      The buildPanel method adds a label, a text field,
      and a button to a panel.
    */
    
    private void buildPanel() 
    {
      //Create a label to display instructions.
      messageLabel1 = new JLabel("Number of days on " +
                                 "the trip: ");
                                 
      //Create a text field 10 characters wide.
      NumDaysTextField = new JTextField(10);
      
      
      //Create a label to display instructions.
      messageLabel2 = new JLabel("Amount of  " +
                                 "airfare: ");
                                 
      //Create a text field 10 characters wide.
      AirFareTextField = new JTextField(10);
      
      
      
      //Create a label to display instructions.
      messageLabel3 = new JLabel("Amount of  " +
                                 "car rental: ");
                                 
      //Create a text field 10 characters wide.
      CarRentalTextField = new JTextField(10);

      //Create a label to display instructions.
      messageLabel4 = new JLabel("Miles driven: ");
                                 
      //Create a text field 10 characters wide.
      MilesDrivenTextField = new JTextField(10);
      
      //Create a label to display instructions.
      messageLabel5 = new JLabel("Parking fees: ");
                                 
      //Create a text field 10 characters wide.
      ParkingFeesTextField = new JTextField(10);
      
      //Create a label to display instructions.
      messageLabel6 = new JLabel("Taxi fees: ");
                                 
      //Create a text field 10 characters wide.
      TaxiFeesTextField = new JTextField(10);
      
      //Create a label to display instructions.
      messageLabel7 = new JLabel("Conference  " +
                                 "registration: ");
                                 
      //Create a text field 10 characters wide.
      ConferenceRegTextField = new JTextField(10);
      
     //Create a label to display instructions.
      messageLabel8 = new JLabel("Lodging charges  " +
                                 "per night: ");
                                 
      //Create a text field 10 characters wide.
      LodgingTextField = new JTextField(10);
     
      //Create a button with the caption "Calculate".
      CalcButton = new JButton("Calculate");
      
      //Add an action listener to the button.
      CalcButton.addActionListener(new CalcButtonListener());
      
       //Create a button with the caption "Reset".
      ResetButton = new JButton("Reset");
      
      //Add an action listener to the button.
      ResetButton.addActionListener(new ResetButtonListener());
      
      
      //Create a JPanel object and let the panel
      //field reference it.
      panel = new JPanel();
      
      //Add the label, text field, and button
      //components to the panel.
      panel.add(messageLabel1);
      panel.add(NumDaysTextField);
      panel.add(messageLabel2);
      panel.add(AirFareTextField);
      panel.add(messageLabel3);
      panel.add(CarRentalTextField);
      panel.add(messageLabel4);
      panel.add(MilesDrivenTextField);
      panel.add(messageLabel5);
      panel.add(ParkingFeesTextField);
      panel.add(messageLabel6);
      panel.add(TaxiFeesTextField);
      panel.add(messageLabel7);
      panel.add(ConferenceRegTextField);
      panel.add(messageLabel8);
      panel.add(LodgingTextField);
      panel.add(CalcButton);
      panel.add(ResetButton);
    }
    
    /**
      CalcButtonListener is an action listener class for  
      the Calculate button.   
    */
    private class ResetButtonListener implements ActionListener
    {
      /**
         The actionPerformed method executes when the user
         clicks on the Calculate button.
         @param e The event object.
       */
       
       public void actionPerformed(ActionEvent e)
       {
         String input;                             //To hold user's input
         double NumDays;                           //Number of days traveled. Must be at least 1
         double AirFare;                           //Amount of airfare.   Must be at least 0
         double CarRental;                        //Amount of rental car fees. Must be at least 0
         double MilesDriven;                        //Amount of miles driven in personal vehicle. Must be at least 0
         double ParkingFees;                        //Amount of parking fees. Must be at least 0
         double TaxiFees;                        //Amount of taxi charges. Must be at least 0
         double ConferenceReg;                    //Amount of conference or seminar registration fees. Must be at least 0
         double Lodging;                    //Amount of lodging charges. Must be at least 1
         
         NumDaysTextField.setText("0");
         AirFareTextField.setText("0");
         CarRentalTextField.setText("0");
         MilesDrivenTextField.setText("0");
         ParkingFeesTextField.setText("0");
         TaxiFeesTextField.setText("0");
         ConferenceRegTextField.setText("0");
         LodgingTextField.setText("0");
        
       
       
       }
       }
    private class CalcButtonListener implements ActionListener
    {
      /**
         The actionPerformed method executes when the user
         clicks on the Calculate button.
         @param e The event object.
       */
       
       public void actionPerformed(ActionEvent e)
       {
                  
         String input; // user's input
         double NumDays; // days traveled (1)
         double AirFare; //airfare (0)
         double RentalFees; //rental car fees (0)
         double MilesDriven; //miles driven in personal vehicle(0)
         double ParkingFees;  //parking fees (0)
         double TaxiCharges;  //taxi charges (0)
         double RegistrationFees; //Amount of conference or seminar registration fees. Must be at least 0
         double LodgingCharges; //Amount of lodging charges. Must be at least 1
         double TotalExpenses;  //Total amount of travel expenditures.
         double MilesDrivenAllowableExpense; // gas money 
         double MealsAllowableExpense = 37; // meals 
         double ParkingAllowableExpense = 10; // parking fees 
         double TaxiAllowableExpense = 20; // taxi fees 
         double LodgingAllowableExpense = 95; // lodging fees 
         double TotalAllowableExpenses; //reimbursed
         double ExpenseDifference; //Difference between travel expenditures and total amount
         
         
         //(0) for no expense No negative numbers

           input = NumDaysTextField.getText();
           NumDays = Double.parseDouble(input);
           input = AirFareTextField.getText();
           AirFare = Double.parseDouble(input);
           input = CarRentalTextField.getText();
           RentalFees = Double.parseDouble(input);
           input = MilesDrivenTextField.getText();
           MilesDriven = Double.parseDouble(input);
           input = ParkingFeesTextField.getText();
           ParkingFees = Double.parseDouble(input);
           input = TaxiFeesTextField.getText();
           TaxiCharges = Double.parseDouble(input);
           input = ConferenceRegTextField.getText();
           RegistrationFees = Double.parseDouble(input);
           input = LodgingTextField.getText();
           LodgingCharges = Double.parseDouble(input);
          
           //While loop to validate numDays input is greater than 0.
           while (NumDays <= 0)
           {
               //Dialog box to let the user know to try again.
               input = JOptionPane.showInputDialog(null, "The number of days you traveled must be greater than 0! " +
                                                   "Try again.");
               NumDays = Double.parseDouble(input);          
              
           }//end while loop
          
           //While loop to validate airfare input is not a negative number.
           while (AirFare < 0)
           {
               //Dialog box to let the user know to try again.
               input = JOptionPane.showInputDialog(null, "Airfare cannot be a negative number! Try again.");
               AirFare = Double.parseDouble(input);          
              
           }//end while loop
          
           //While loop to validate rentalFees input is not a negative number.
           while (RentalFees < 0)
           {
               //Dialog box to let the user know to try again.
               input = JOptionPane.showInputDialog(null, "Rental fees cannot be a negative number! Try again.");
               RentalFees = Double.parseDouble(input);          
              
           }//end while loop
          
           //While loop to validate milesDriven input is not a negative number.
           while (MilesDriven < 0)
           {
               //Dialog box to let the user know to try again.
               input = JOptionPane.showInputDialog(null, "The miles you drove cannot be a negative number! Try again.");
               MilesDriven = Double.parseDouble(input);          
              
           }//end while loop
          
           //While loop to validate parkingFees input is not a negative number.
           while (ParkingFees < 0)
           {
               //Dialog box to let the user know to try again.
               input = JOptionPane.showInputDialog(null, "Your parking fee cannot be a negative number! Try again.");
               ParkingFees = Double.parseDouble(input);          
              
           }//end while loop
          
           //While loop to validate taxiCharges input is not a negative number.
           while (TaxiCharges < 0)
           {
               //Dialog box to let the user know to try again.
               input = JOptionPane.showInputDialog(null, "Your taxi charges cannot be a negative number! Try again.");
               TaxiCharges = Double.parseDouble(input);          
              
           }//end while loop
          
           //While loop to validate registrationFees input is not a negative number.
           while (RegistrationFees < 0)
           {
               //Dialog box to let the user know to try again.
               input = JOptionPane.showInputDialog(null, "Your registration fees cannot be a negative number! Try again.");
               RegistrationFees = Double.parseDouble(input);          
              
           }//end while loop
          
           //While loop to validate lodgingCharges input is greater than 0.
           while (LodgingCharges <= 0)
           {
               //Dialog box to let the user know to try again.
               input = JOptionPane.showInputDialog(null, "Your lodging fees must be greater than 0! Try again.");
               LodgingCharges = Double.parseDouble(input);                                          
              
           }//end while loop
          
           //Calculate TotalExpenses.
           TotalExpenses = (RentalFees + ParkingFees + TaxiCharges + LodgingCharges)*NumDays + RegistrationFees +
                           AirFare;
                          
           //Calculate MilesDrivenAllowableExpense.
           MilesDrivenAllowableExpense = MilesDriven * .27;
          
           //Calculate TotalAllowableExpenses.
           TotalAllowableExpenses = (MilesDrivenAllowableExpense + MealsAllowableExpense + ParkingAllowableExpense +
                                   TaxiAllowableExpense + LodgingAllowableExpense)*NumDays;
                                  
           //Calculate ExpenseDifference
           ExpenseDifference = TotalAllowableExpenses - TotalExpenses;
                 
           //Create decimal format object to format output.
           DecimalFormat rounder = new DecimalFormat("#.00");  
              
           //Display total expenses incurred by the business person and the total allowable expenses for the trip.
           JOptionPane.showMessageDialog(null, "The total expense you incurred is $" + rounder.format(TotalExpenses) + "." +
                                                "\n" + "The total reimbursable expense is $" +
                                                rounder.format(TotalAllowableExpenses) + ".");      
          
           //If totalExpenses is < totalAllowable expenses, display window showing the amount the user saved.
           if (TotalExpenses < TotalAllowableExpenses)
               JOptionPane.showMessageDialog(null, "You saved $" + rounder.format(ExpenseDifference) + "!");
                  
           //If expenseDifference is > totalAllowable expenses, display window showing the amount the user owes.
           if (TotalExpenses > TotalAllowableExpenses)
               JOptionPane.showMessageDialog(null, "You owe $" + rounder.format(ExpenseDifference * -1) + "!");          
      
       }//end actionPerformed method
  
    }//end CalcButtonListener private inner class    
   
   public static void main(String[] args)
    {
      new CalculateExpense();
    }

}//end class