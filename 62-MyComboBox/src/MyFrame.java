import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {

	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		// Uses wrapper classes i.e. Integer[], Double[]
		String[] animals = {"dog", "cat", "bird"};
		JComboBox comboBox = new JComboBox(animals);
		
		comboBox.addActionListener(e -> {
			System.out.println(comboBox.getSelectedItem());
			System.out.println(comboBox.getSelectedIndex());
		});
		
		comboBox.setEditable(true);  // allows you to type and edit the text-box
//		System.out.println(comboBox.getItemCount());
//		comboBox.addItem("horse");  // adds an item to the end of the comboBox
//		comboBox.insertItemAt("pig", 0);  // adds an item at index 0 but will not be selected
//		comboBox.setSelectedIndex(0);  // sets the selected item
//		comboBox.removeItem("cat");  // removes an item by name
//		comboBox.removeItemAt(0);  // removes an item by index
//		comboBox.removeAllItems();  // removes all items

		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}
}
