import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements MouseListener {

	JLabel label;
	ImageIcon smile;
	ImageIcon sweat;
	ImageIcon fear;
	ImageIcon outCold;
	
	MyFrame() {
		
		smile = new ImageIcon("smile.png");
		sweat = new ImageIcon("sweat.png");
		fear = new ImageIcon("fear.png");
		outCold = new ImageIcon("outcold.png");
		
		label = new JLabel();
//		label.setBounds(0, 0, 100, 100);
//		label.setBackground(Color.red);
		label.setIcon(smile);
		label.setOpaque(true);
		label.addMouseListener(this);
		
//		this.addMouseListener(this);
		
		this.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setSize(500, 500);
//		this.setLayout(null);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and released) on a component
//		System.out.println("You clicked the mouse");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component
		System.out.println("You pressed the mouse");
//		label.setBackground(Color.yellow);
		label.setIcon(fear);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released
		System.out.println("You released the mouse");
//		label.setBackground(Color.green);
		label.setIcon(outCold);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when the mouse enters a component
		System.out.println("You entered with the mouse");
//		label.setBackground(Color.blue);
		label.setIcon(sweat);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse exits a component
		System.out.println("You exited with the mouse");
//		label.setBackground(Color.red);
		label.setIcon(smile);
	}
	
}
