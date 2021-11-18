import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
   This program demonstrates how an action listener can access 
   a variable from a surrounding block.
*/
public class Viewer
{

   private static final int FRAME_WIDTH = 300;
   private static final int FRAME_HEIGHT = 300;
   private static final String METRIC1 = "Max";
   private static final String METRIC2 = "Min";
   private static final String METRIC3 = "Avg";

   public static void main(String[] args)
   {
	      Measurable[] accounts = new Measurable[3];
	      accounts[0] = new BankAccount(0);
	      accounts[1] = new BankAccount(10000);
	      accounts[2] = new BankAccount(2000);

		   
	      Measurable[] countries = new Measurable[3];
	      countries[0] = new Country("Uruguay", 176220);
	      countries[1] = new Country("Thailand", 513120);
	      countries[2] = new Country("Belgium", 30510);

	  JPanel panel = new JPanel();
	      
//Listener for BankAccount Button Minimum    
	  JFrame frame = new JFrame();
      JButton button = new JButton("Get Bank Account " + METRIC2 + " Balance");
      panel.add(button);
      ActionListener listener = new ButtonListener(accounts, METRIC2);
      button.addActionListener(listener);
      
//Listener for BankAccount Button Maximum    
      JFrame frame2 = new JFrame();
      JButton button2 = new JButton("Get Bank Account " + METRIC1 + " Balance");
      panel.add(button2);
      ActionListener listener2 = new ButtonListener(accounts, METRIC1);
      button2.addActionListener(listener2);
      
//Listener for BankAccount Button Average   
      JFrame frame3 = new JFrame();
      JButton button3 = new JButton("Get Bank Account " + METRIC3 + " Balance");
      panel.add(button3);
      ActionListener listener3 = new ButtonListener(accounts, METRIC3);
      button3.addActionListener(listener3);
      
//Listener for Country Button Minimum    
      JFrame frame4 = new JFrame();
      JButton button4 = new JButton("Get Country " + METRIC2 + " Balance");
      panel.add(button4);
      ActionListener listener4 = new ButtonListener(countries, METRIC2);
      button4.addActionListener(listener4);
      
//Listener for Country Button Maximum    
      JFrame frame5 = new JFrame();
      JButton button5 = new JButton("Get Country " + METRIC1 + " Balance");
      panel.add(button5);
      ActionListener listener5 = new ButtonListener(countries, METRIC1);
      button5.addActionListener(listener5);
      
//Listener for country Button Average   
      JFrame frame6 = new JFrame();
      JButton button6 = new JButton("Get Country " + METRIC3 + " Balance");
      panel.add(button6);
      ActionListener listener6 = new ButtonListener(countries, METRIC3);
      button6.addActionListener(listener6);
      
      
      frame.add(panel);
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
   }
}
