import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{

	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	ImageIcon pizzaIcon;
	ImageIcon hamburgerIcon;
	ImageIcon hotdogIcon;
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaIcon = new ImageIcon("pizza.png");
		hamburgerIcon = new ImageIcon("hamburger.png");
		hotdogIcon = new ImageIcon("hotdog.png");
		
		pizzaButton = new JRadioButton("pizza");
		hamburgerButton = new JRadioButton("hamburger");
		hotdogButton = new JRadioButton("hotdog");
		
		// By adding it the JRadioButtons into a ButtonGroup you limit the selection to one
		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);
		
		pizzaButton.addActionListener(e -> System.out.println("You ordered a pizza"));
		hamburgerButton.addActionListener(e -> System.out.println("You ordered a hamburger"));
		hotdogButton.addActionListener(e -> System.out.println("You ordered a hotdog"));
		
		pizzaButton.setIcon(pizzaIcon);
		hamburgerButton.setIcon(hamburgerIcon);
		hotdogButton.setIcon(hotdogIcon);
		
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);
		this.pack();
		this.setVisible(true);
	}
	
}
