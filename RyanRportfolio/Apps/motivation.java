package softwareDev;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class motivation extends JFrame { // extends creates a subclass
	
	//declare buttons here
	JButton jbtHello1;
	
	//declare button handlers
	helloButtonHandler helloHandler;
	
	// *************************************
	// GUI frame work for layout setup below
	// *************************************
	
	public motivation()
	{
		//create iFrame
		JFrame f = new JFrame("Motivation app");
		f.setLayout(new FlowLayout());
		
		// create panel
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 1));
		
		// add panel to frame
		add(p1);
		
		// gui setup
		setTitle("Motivation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 300);
		setLocationRelativeTo(null);
		
		// create JButtons
		jbtHello1 = new JButton("What type of message do you want today?");
		
		// set size and font for jbt's
		jbtHello1.setFont(new Font("Arial", Font.PLAIN, 20));
		
		// add elements to JFrame
		p1.add(jbtHello1);
		
		// create listener classes and associate with buttons
		helloHandler = new helloButtonHandler();
		jbtHello1.addActionListener(helloHandler);
		
		// set visible
		setVisible(true);
		
		}
	// ***************************
	//        Main method
	// ***************************
	public static void main(String[] args) {

		new motivation();
	}
		// *************************************
		//     Listener 1 for jbtHello1
		// *************************************
		class helloButtonHandler implements ActionListener {
			private Component frame;

			public void actionPerformed(ActionEvent e) {

				// Get button that was pressed
				JButton pressed = (JButton) (e.getSource());

			    // Reach into button and pull text
				String text = pressed.getText();    
				        			
				
				if (text.equals("What type of message do you want today?"))
				{
				// Response 3	
					String[] choices = { "Love", "Patience", "Faith", "Strength", "Comfort", "Perserverance" };
					String input = (String) JOptionPane.showInputDialog(null, "Choose now... ", 
							"The Choice of a Lifetime", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
					System.out.println(input);
					if(input.equals("Love"))
					{
						JOptionPane.showMessageDialog(frame,"I never said it wouldn't be hard I only said"
								+ " it would be worth it ",	"Anonymous said...",JOptionPane.PLAIN_MESSAGE);
					}
					else if(input.equals("Patience"))
					{
						JOptionPane.showMessageDialog(frame,"Good things come to those who wait", 
								"Anonymous said...",JOptionPane.PLAIN_MESSAGE);
					}
					else if(input.equals("Faith"))
					{
						JOptionPane.showMessageDialog(frame,"The worth of souls is great in the sight of God",
								"Joseph Smith from God said...",JOptionPane.PLAIN_MESSAGE);
					}
					else if(input.equals("Strength"))
					{
						JOptionPane.showMessageDialog(frame,"If it felt right the first time you asked "
								+ " it is right the next time around.",	
								"Elder Jeffery R. Holland...",JOptionPane.PLAIN_MESSAGE);
					}
					else if(input.equals("Comfort"))
					{
						JOptionPane.showMessageDialog(frame,"Sometimes people are just jerks.",	
								"Anonymous said...",JOptionPane.PLAIN_MESSAGE);
					}
					else if(input.equals("Perserverance"))
					{
						JOptionPane.showMessageDialog(frame,"Dont give up you just have to realize how far you've come",
								"Anonymous said...",JOptionPane.PLAIN_MESSAGE);
					}
					else
					{
					JOptionPane.showMessageDialog(frame,"You choose " + input,
							"The World says...",JOptionPane.PLAIN_MESSAGE);
					}
				}
				else
				{
					// Response 4
					JOptionPane.showMessageDialog(frame,"No messages for today.",
					"Sad but true ...",JOptionPane.PLAIN_MESSAGE);
				}
			}
		}
	}
