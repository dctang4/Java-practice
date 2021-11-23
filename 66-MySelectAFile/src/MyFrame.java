import java.awt.*;
import java.io.File;
import javax.swing.*;

public class MyFrame extends JFrame {

	JButton button;
	
	
	MyFrame(){
		
		button = new JButton("Select File");
		button.addActionListener(e -> {
			
			JFileChooser fileChooser = new JFileChooser();
			
			fileChooser.setCurrentDirectory(new File("."));  // use . for current folder else new full path
			
//			int response = fileChooser.showOpenDialog(null);  // select file to open
			int response = fileChooser.showSaveDialog(null);  // select file to save
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
			
		});
		
		this.add(button);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}
}
