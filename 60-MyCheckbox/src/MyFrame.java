import java.awt.FlowLayout;
import java.awt.Font;
//import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;



public class MyFrame extends JFrame{

	JButton button;
	JCheckBox checkBox;
	ImageIcon xIcon;
	ImageIcon checkIcon;
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
//		xIcon = new ImageIcon("x.png");  // don't have the image
//		checkIcon = new ImageIcon("check.png");  // don't have the image
		
		button = new JButton("Submit");
		button.addActionListener(e -> {
			System.out.println(checkBox.isSelected()); 
		});
		
		checkBox = new JCheckBox();
		checkBox.setText("I'm not a rebot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
//		checkBox.setIcon(xIcon);  // sets the unchecked icon
//		checkBox.setSelectedIcon(checkIcon);  // sets the selected icon
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
	}
	
}
