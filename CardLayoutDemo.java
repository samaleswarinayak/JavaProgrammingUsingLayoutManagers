//Use of Card layout

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class CardLayoutDemo extends JFrame implements ActionListener
{
	//Variable declaration
	Container cob;
	CardLayout obj;
	JButton b1,b2,b3,b4;
	CardLayoutDemo()
	{
			//Create a container
			cob = getContentPane();
			//Create FlowLayout object
			obj = new CardLayout(50,10);//Gap of 50px in horizontal and 10px in vertical
			cob.setLayout(obj);//Set layout to the container
			//Create components 
			b1 = new JButton("Button1");
			b2 = new JButton("Button2");
			b3 = new JButton("Button3");
			b4 = new JButton("Button4");
			//Add components to the container
			cob.add("First Card",b1);
			cob.add("Second Card",b2);
			cob.add("Third Card",b3);
			cob.add("Fourth Card",b4);
			//Add ActionListener to the Buttons
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		obj.next(cob);//When a button gets clicked show the next card
	}
	public static void main(String args[])
	{
		//Create the frame
		CardLayoutDemo ob = new CardLayoutDemo();
		ob.setSize(400,400);
		ob.setTitle("My Flow Layout");
		ob.setVisible(true);
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}