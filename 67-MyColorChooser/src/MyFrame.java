import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {

	JButton button;
	JLabel label;
	
	MyFrame() {
		
		button = new JButton("Pick a Color");
		button.addActionListener(e -> {
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
			
			label.setForeground(color);
//			label.setBackground(color);
		});
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("This is some text.");
		label.setFont(new Font("MV Boli", Font.PLAIN, 100));
		label.setOpaque(true);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
		
	}
	
}
