//Use of Grid layout

import java.awt.*;
import javax.swing.*;

class GridLayoutDemo extends JFrame
{
	GridLayoutDemo()
	{
			//Create a container
			Container cob = getContentPane();
			//Create FlowLayout object
			GridLayout obj = new GridLayout(2,3,50,50);//Gap of 50px in horizontal and vertical and 2 rows and 3 columns
			cob.setLayout(obj);//Set layout to the container
			//Create components 
			JButton b1,b2,b3,b4;
			b1 = new JButton("Button1");
			b2 = new JButton("Button2");
			b3 = new JButton("Button3");
			b4 = new JButton("Button4");
			//Add components to the container
			cob.add(b1);
			cob.add(b2);
			cob.add(b3);
			cob.add(b4);
	}
	public static void main(String args[])
	{
		//Create the frame
		GridLayoutDemo ob = new GridLayoutDemo();
		ob.setSize(400,400);
		ob.setTitle("My Grid Layout");
		ob.setVisible(true);
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}