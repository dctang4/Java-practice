import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage {

	JFrame frame = new JFrame();
	JButton button = new JButton("New Window");
	
	LaunchPage() {
		
		button.setBounds(100,100,200,40);
		button.setFocusable(false);
		button.addActionListener(e -> {
			frame.dispose();
			new NewWindow();
		});
		
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
}
