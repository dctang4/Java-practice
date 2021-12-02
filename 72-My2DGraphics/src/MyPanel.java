import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel {

	Image image;
	
	MyPanel() {
		
		image = new ImageIcon("image.jpg").getImage();
		
		this.setPreferredSize(new Dimension(500,500));

	}
	
	@Override
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(image, 0, 0, null);
		
//		g2D.setPaint(Color.blue);
//		g2D.setStroke(new BasicStroke(5));
//		g2D.drawLine(0, 0, 500, 500);
		
//		g2D.setPaint(Color.pink);
//		g2D.drawRect(0, 0, 100, 200);
//		g2D.fillRect(0, 0, 100, 200);
		
//		g2D.setPaint(Color.orange);
//		g2D.drawOval(0, 0, 100, 100);
//		g2D.fillOval(0, 0, 100, 100);
		
		//         (x, y, width, height, start angle, arc angle)
//		g2D.drawArc(0, 0, 100, 100, 0, 180);
		
		// Pokeball
		g2D.setPaint(Color.red);
		g2D.fillArc(0, 0, 100, 100, 0, 180);
		g2D.setPaint(Color.white);
		g2D.fillArc(0, 0, 100, 100, 180, 180);
		
		g2D.setPaint(Color.black);
		g2D.setStroke(new BasicStroke(5));
		g2D.drawLine(2, 50, 98, 50);
		
		g2D.setStroke(new BasicStroke(10));
		g2D.drawOval(40, 40, 20, 20);
		
		g2D.setPaint(Color.lightGray);
		g2D.setStroke(new BasicStroke(1));
		g2D.fillOval(40, 40, 20, 20);
		
		g2D.setPaint(Color.yellow);
//		int[] xPoints = {150, 250, 350};
//		int[] yPoints = {300, 150, 300};
//		//             (xPoints, yPoints, number of point)
//		g2D.drawPolygon(xPoints, yPoints, 3);
		
		// Triforce
		int[][] xPoints = {{150, 250, 350}, {50, 150, 250}, {250, 350, 450}};
		int[][] yPoints = {{300, 150, 300}, {450,300,450}};
		
		g2D.fillPolygon(xPoints[0], yPoints[0], 3);
		g2D.fillPolygon(xPoints[1], yPoints[1], 3);
		g2D.fillPolygon(xPoints[2], yPoints[1], 3);
		
//		g2D.setPaint(Color.magenta);
//		g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
//		//			  (String, x, y)  the x and y coordinate is the bottom left corner of the string
//		g2D.drawString("U R A WINNER", 50, 50);
		
		
		
	}
}
