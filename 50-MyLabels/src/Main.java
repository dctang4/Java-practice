import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		
		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("geass.jpg");
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		JLabel label = new JLabel();  // create a label
		label.setText("Bro, do you even code?");  // set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);  // set text LEFT, CENTER, RIGHT of ImageIcon
		label.setVerticalTextPosition(JLabel.TOP);  // set text TOP, CENTER, BOTTOM of ImageIcon
		label.setForeground(new Color(0x00FF00));  // set font color of text
		label.setFont(new Font("MV Boli", Font.PLAIN, 50));  // set font of text
		label.setIconTextGap(-25);  // set gap of text to image
		label.setBackground(Color.black);  // set background color
		label.setOpaque(true);  // display background color
		label.setBorder(border);  // sets border of label (not image+text)
//		label.setVerticalAlignment(JLabel.CENTER);  // set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER);  // set horizontal position of icon+text within label
//		label.setBounds(0, 0, 1000, 750);  // set x,y position within frame as well as dimensions

		JFrame frame = new JFrame();  // creates a frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit out of application
//		frame.setSize(1000,787);  // sets the x-dimension and y-dimension of frame
//		frame.setLayout(null);  // set the layout of the frame
		frame.setVisible(true);  // make frame visible
		frame.setIconImage(image.getImage());  // change icon of frame
		frame.add(label);  // adds the label into the frame
		frame.pack();  // auto sizes the frame to fit everything.  Must come at the end
	}

}
