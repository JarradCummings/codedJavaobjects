/*
Cummings,Jarrad
CSC210
*/


import javax.swing.*;         //Needed for Swing Classes
import java.awt.event.*;      //Needed for ActionListener Interface

/**
   The RetailPriceCalculator class displays a JFrame that
   lets the user enter a wholesale cost and its
   markup percetage into text fields.
*/

public class RetailPriceCalculator extends JFrame
{
   private JPanel panel;               //To reference a panel
   private JLabel messageLabel1;        //To reference a label 1
   private JLabel messageLabel2;        //To reference a label 2
   private JTextField wholeSaleCostTextField;   //To reference a text field
   private JTextField markupPercentTextField;   //To reference a text field
   private JButton calcButton;         //To reference a button
   private final int WINDOW_WIDTH = 330;  //Window width
   private final int WINDOW_HEIGHT = 150; //Window height
 
   
//Constructor
   
   public RetailPriceCalculator()
   {
      //Set the window tile.
      setTitle("Retail Price Converter");
      
      //Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      //Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //Build the panel and add it to the frame
      buildPanel();
      
      //Add the panel to the frame's contenct pane.
      add(panel);
      
      //Display the window
      setVisible(true);
    }
    

    
    private void buildPanel() 
    {
      //Create a label to display instructions.
      messageLabel1 = new JLabel("Enter a wholesale " +
                                 "in dollars: ");
                                 
      //Create a text field 10 characters wide.
      wholeSaleCostTextField = new JTextField(10);
      
      
      
      //Create a label to display instructions.
      messageLabel2 = new JLabel("Enter a markup " +
                                 "percentage: ");
                                 
      //Create a text field 10 characters wide.
      markupPercentTextField = new JTextField(10);
      
      //Create a button with teh caption "Calculate".
      calcButton = new JButton("Calculate");
      
      //Add an action listener to the button.
      calcButton.addActionListener(new CalcButtonListener());
      
      
      
      //Create a JPanel object and let the panel
      //field reference it.
      panel = new JPanel();
      
      //Add the label, text field, and button
      //components to the panel.
      panel.add(messageLabel1);
      panel.add(wholeSaleCostTextField);
      panel.add(messageLabel2);
   
      panel.add(markupPercentTextField);
      panel.add(calcButton);
    }
    
   
    
    
    private class CalcButtonListener implements ActionListener
    {

       
       public void actionPerformed(ActionEvent e)
       {
         double markup;    //Markup in percent
         double cost;      //cost in dollars
         double retailPrice;     
         
         //Get the text entered by the user into the 
         //text field.
         cost = Double.parseDouble(wholeSaleCostTextField.getText());     
         markup = Double.parseDouble(markupPercentTextField.getText())/100;
         retailPrice = cost+cost*markup;
         
         //Display the result.
         JOptionPane.showMessageDialog(null, "Your retail price is $ " +
                                       retailPrice);
         
         //For debugging, display a message indicating
         //the application is ready for more input.
         System.out.println("Ready for the next input.");
         }
       } //End of CalcButtonListener class

    
    public static void main(String[] args)
    {
      new RetailPriceCalculator();
    }
 }
       
         
    
       