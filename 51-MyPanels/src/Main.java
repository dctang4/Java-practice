import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		// JPanel = a GUI component that functions as a container to hold other components
		
		ImageIcon image = new ImageIcon("geass_tiny.jpg");
		
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(image);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);

		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setLayout(new BorderLayout());
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		bluePanel.setLayout(new BorderLayout());
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(new BorderLayout());
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750, 750);
		frame.setVisible(true);
		frame.setIconImage(image.getImage());
		greenPanel.add(label);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		

	}

}
