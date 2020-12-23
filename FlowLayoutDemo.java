//Use of flow layout

import java.awt.*;
import javax.swing.*;

class FlowLayoutDemo extends JFrame
{
	FlowLayoutDemo()
	{
			//Create a container
			Container cob = getContentPane();
			//Create FlowLayout object
			FlowLayout obj = new FlowLayout(FlowLayout.LEFT,10,10);//Gap of 10px in horizontal and vertical
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
		FlowLayoutDemo ob = new FlowLayoutDemo();
		ob.setSize(400,400);
		ob.setTitle("My Flow Layout");
		ob.setVisible(true);
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}