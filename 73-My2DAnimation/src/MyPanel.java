import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel{

	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Image enemy;
	Image background;
	Timer timer;
	int xVelocity = 5;
	int yVelocity = 2;
	int x = 0;
	int y = 0;

	MyPanel() {

		enemy = new ImageIcon("alien.png").getImage();
		background = new ImageIcon("background.jpg").getImage();
		timer = new Timer(50, e -> { 
			
			if (x >= PANEL_WIDTH - enemy.getWidth(null) || x < 0) {
				xVelocity = -xVelocity;
			}
			
			x = x + xVelocity;
			
			if (y >= PANEL_HEIGHT - enemy.getHeight(null) || y < 0) {
				yVelocity = -yVelocity;
			}
			
			y = y + yVelocity;
			
			repaint(); 
		});
		
		timer.start();
		
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.black);

	}

	public void paint(Graphics g) {

		super.paint(g); // this will paint background

		Graphics2D g2D = (Graphics2D) g;

		g2D.drawImage(background, 0, 0, null);
		g2D.drawImage(enemy, x, y, null);
	}

}
