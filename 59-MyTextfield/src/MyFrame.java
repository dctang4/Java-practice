import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame{

	JButton button;
	JTextField textField;
	
	MyFrame() {
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		
		button = new JButton("Submit");
		button.addActionListener(e -> {
//			this.dispose();
			System.out.println("Welcome " + textField.getText());
			button.setEnabled(false);
			textField.setEditable(false);
		});
		button.setFocusable(false);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font("Consolas", Font.PLAIN, 35));
		textField.setForeground(new Color(0x00FF00));  // text color
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);  // the blinking line indicating where to type
		textField.setText("username");
		
		
		this.add(button);
		this.add(textField);
		this.pack();  // adjust to fit components added
		this.setVisible(true);
		

	}
	
}
