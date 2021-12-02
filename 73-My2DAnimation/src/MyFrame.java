import java.awt.*;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	MyPanel panel;
	
	MyFrame() {
		
		panel = new MyPanel();
		
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
}
