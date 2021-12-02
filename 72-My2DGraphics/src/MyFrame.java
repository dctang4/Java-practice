import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {

	MyPanel panel;
	
	MyFrame() {
		
		panel = new MyPanel();
		
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setSize(500, 500);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
//	@Override
//	public void paint(Graphics g) {
//		
//		Graphics2D g2D = (Graphics2D) g;
//		
//		g2D.drawLine(0, 0, 500, 500);
//		// the window bar on top is part of the frame so the line doesn't at the corner of the whitespace
//	}
	
}
