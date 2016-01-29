package softwareDev;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Author: Kyle Stucki Date 1/21/2016 Program: HelloWorldApp
 **/

@SuppressWarnings("serial")
public class HelloWorldApp extends JFrame {

	// declare buttons
	JButton jbtHello1;
	JButton jbtHello2;
	JButton jbtHello3;
	JButton jbtHello4;
	JButton jbtHello5;

	// declare buttonHandlers
	helloButtonHandler helloHandler;

	// *************************************
	// GUI frame work for layout setup below
	// *************************************

	public HelloWorldApp() {

		// create jframe
		JFrame f = new JFrame("Hello World App");
		f.setLayout(new FlowLayout());

		// create panel
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(3, 3));

		// add panel to frame
		add(p1);

		// gui setup
		setTitle("HobbitNameApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 300);
		setLocationRelativeTo(null);

		// create JButtons
		jbtHello1 = new JButton("Hello World!");
		jbtHello2 = new JButton("Hows the weather?");
		jbtHello3 = new JButton("Busy today?");
		jbtHello4 = new JButton("Take care friend.");
		jbtHello5 = new JButton("Hobbit Names.");

		// set size and font for jbt's
		jbtHello1.setFont(new Font("Arial", Font.PLAIN, 20));
		jbtHello2.setFont(new Font("Arial", Font.PLAIN, 20));
		jbtHello3.setFont(new Font("Arial", Font.PLAIN, 20));
		jbtHello4.setFont(new Font("Arial", Font.PLAIN, 20));
		jbtHello5.setFont(new Font("Arial", Font.PLAIN, 20));

		// add elements to JFrame
		p1.add(jbtHello1);
		p1.add(jbtHello2);
		p1.add(jbtHello3);
		p1.add(jbtHello4);
		p1.add(jbtHello5);

		// create listener classes and associate with buttons
		helloHandler = new helloButtonHandler();
		jbtHello1.addActionListener(helloHandler);
		jbtHello2.addActionListener(helloHandler);
		jbtHello3.addActionListener(helloHandler);
		jbtHello4.addActionListener(helloHandler);
		jbtHello5.addActionListener(helloHandler);
	
		// set visible
		setVisible(true);

	}

	// ***************************
	//        Main method
	// ***************************
	public static void main(String[] args) {

	   new HelloWorldApp();
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
			
		    
			     
			        			
			
			if (text.equals("Hello World!"))
			{
				// Response 1
				JOptionPane.showMessageDialog(frame,"Why hello there good sir.",
				"The World says...",JOptionPane.PLAIN_MESSAGE);
			}
			else if (text.equals("Hows the weather?"))
			{
				// Response 2
				JOptionPane.showMessageDialog(frame,"Good weather bad weather it's all the same to me.",
				"The World says...",JOptionPane.PLAIN_MESSAGE);
				
			}else if (text.equals("Busy today?"))
			{
				// Response 3			
				JOptionPane.showMessageDialog(frame,"Mostly business as usual.",
				"The World says...",JOptionPane.PLAIN_MESSAGE);
			}
			else if (text.equals("Hobbit Names."))
			{
			// Response 3	
				String[] choices = { "Frodo", "Sam", "BrandyBuck", "Bilbo", "Merry", "Pippin" };
				String input = (String) JOptionPane.showInputDialog(null, "Choose now... ", 
						"The Choice of a Lifetime", JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);
				System.out.println(input);
				JOptionPane.showMessageDialog(frame,"You choose " + input,
						"The World says...",JOptionPane.PLAIN_MESSAGE);
			}
			else
			{
				// Response 4
				JOptionPane.showMessageDialog(frame,"You take care as well.",
				"The World says...",JOptionPane.PLAIN_MESSAGE);
			}
		}
	}
}
