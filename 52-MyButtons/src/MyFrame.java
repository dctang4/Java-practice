// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

import java.awt.Font;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// public class MyFrame extends JFrame implements ActionListener {
public class MyFrame extends JFrame {
	
	JButton button;
	JLabel label;
	
	MyFrame() {
		
		ImageIcon icon = new ImageIcon("geass_tiny.jpg");
		ImageIcon icon2 = new ImageIcon("geass_small.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(72, 225, 350, 225);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(100, 100, 300, 100);
//		button.addActionListener(this);
//		button.addActionListener(e -> System.out.println("Sup"));
		button.addActionListener(e -> {
			System.out.println("Sup");
			button.setEnabled(false);
			label.setVisible(true);
		});
		button.setText("Please press me");
		button.setFocusable(false);  // removes border around text
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
//		button.setIconTextGap(-5);
		button.setForeground(Color.red);
		button.setBackground(Color.black);
		button.setBorder(BorderFactory.createEtchedBorder());
//		button.setEnabled(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		this.setLayout(null);
		this.setSize(500,500);  
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		if(e.getSource()==button) {
//			System.out.println("Sup");
//			button.setEnabled(false);
//		}
//		
//	}



	
}
