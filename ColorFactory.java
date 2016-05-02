/*
Cummings,Jarrad
CSC210
*/

//Import Statement
import javax.swing.*;    // Needed for Swing classes
import java.awt.*;       // Needed for Color class
import java.awt.event.*; // Needed for event listener interface


//class
public class ColorFactory extends JFrame
{

	
	private JLabel messageLabel;    // To display a message
   private JButton redButton;      // Changes color to red
   private JButton orangeButton;     // Changes color to orange
   private JButton yellowButton;   // Changes color to yellow
   private JRadioButton radio1;
   private JRadioButton radio2;
   private JRadioButton radio3;
   private JPanel panel1;           // A panel to hold components
   private JPanel panel2;
   private ButtonGroup group;
   private final int WINDOW_WIDTH = 500; // Window width
   private final int WINDOW_HEIGHT = 300; // Window height
   
    public ColorFactory()
   {
      // Set the title bar text.
      setTitle("Color Factory");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(new BorderLayout());
      buildPanel();
      add(panel1, BorderLayout.NORTH);
      buildRadioPanel();
      add(panel2, BorderLayout.SOUTH);
      
      // Create a label.
      messageLabel = new JLabel(" Top buttons change the panel color" +
                                 " and bottom radio buttons change the text color.");
      add(messageLabel, BorderLayout.CENTER);
      
      setVisible(true);

   }
    
    private void buildPanel()
    {
    

      // Create the three buttons.
      redButton = new JButton("Red");
      orangeButton = new JButton("Orange");
      yellowButton = new JButton("Yellow");
      
		redButton.setActionCommand("but1");
		orangeButton.setActionCommand("but2");
		yellowButton.setActionCommand("but3");

      // Register an event listener with all 3 buttons.
      redButton.addActionListener(new ButtonListener());
      orangeButton.addActionListener(new ButtonListener());
      yellowButton.addActionListener(new ButtonListener());

      // Create a panel and add the components to it.
      panel1 = new JPanel();
      
      panel1.add(redButton);
      panel1.add(orangeButton);
      panel1.add(yellowButton);
      
      
    }

      // Add the panel to the content pane.
     
    private void buildRadioPanel()
    { 
      JRadioButton radio1 = new JRadioButton ("Green");
       JRadioButton radio2 = new JRadioButton ("Blue");
        JRadioButton radio3 = new JRadioButton ("cyan");
        
 		radio1.setActionCommand("radio1");
 		radio2.setActionCommand("radio2");
 		radio3.setActionCommand("radio3");
        
        group = new ButtonGroup();
        
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        
        radio1.addActionListener(new RadioListener());
        radio2.addActionListener(new RadioListener());
        radio3.addActionListener(new RadioListener());

                
        panel2 = new JPanel();
        
        panel2.add(radio1);
        panel2.add(radio2);
        panel2.add(radio3);
        
     }
     
     
     //The RadioListener
     
     private class RadioListener implements ActionListener
      {
    	 public void actionPerformed(ActionEvent e)
            {
               if (e.getActionCommand()== ("radio1"))
               {messageLabel.setForeground(Color.green);}
               
           	else if(e.getActionCommand()== ("radio2"))
				{
           		messageLabel.setForeground(Color.blue);
				}
			else if(e.getActionCommand()== ("radio3"))
			{
				messageLabel.setForeground(Color.cyan);
			}

            }
      }
      //The ButtonListner
      
     private class ButtonListener implements ActionListener
	 	{
	 		public void actionPerformed(ActionEvent e)
	 			{
	 				
	 				if(e.getActionCommand()==("but1"))
	 					{
	 						getContentPane().setBackground(Color.red);
	 					}
	 				else if(e.getActionCommand()==("but2"))
	 					{
	 						getContentPane().setBackground(Color.orange);
	 					}
	 				else if(e.getActionCommand()==("but3"))
	 				{
	 					getContentPane().setBackground(Color.yellow);
	 				}
	 			}
	 	}
     

	 public static void main(String[] args)
		{
			new ColorFactory();
			
		}

     
}



