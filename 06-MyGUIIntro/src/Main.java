import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// JOptionPane.showInputDialog is a pop-up that takes an input and assigns it as a String
		// JOptionPane.showMessageDialog is a pop-up message
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		// Integer.parseInt converts a String to an integer
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are " + age + " years old");
		
		// Integer.parseDouble converts a String to an double
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");

	}

}
