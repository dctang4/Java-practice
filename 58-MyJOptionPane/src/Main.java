import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// JOptionPane =	pop up a standard dialog box that prompts users for a value
		//					or informs them of something.
		
//		JOptionPane.showMessageDialog(null, "This is a plain message", "title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is an informational message", "title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is a question message", "title", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is a warning message", "title", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is an error message", "title", JOptionPane.ERROR_MESSAGE);

//		JOptionPane.showConfirmDialog(null, "bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
//		System.out.println(JOptionPane.showConfirmDialog(null, "bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION));
//		int answer = JOptionPane.showConfirmDialog(null, "bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
//		String name = JOptionPane.showInputDialog("What is your name? ");
		
		String[] responses = {"Yes, yes I am!", "No, you're awesome!", "Thank You!"};
		
		ImageIcon icon = new ImageIcon("geass_tiny.jpg");
		
		
//		JOptionPane.showOptionDialog(null, "You are awesome!", "secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, 0);
		JOptionPane.showOptionDialog(
				null, 
				"You are awesome!", 
				"secret message", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				icon, 
				responses, 
				0
		);
		
	}

}
