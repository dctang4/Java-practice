import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame {

	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	
	MyFrame() {
		
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		loadIcon = new ImageIcon("load.png");
		saveIcon = new ImageIcon("save.png");
		exitIcon = new ImageIcon("exit.png");
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		loadItem.addActionListener(e -> System.out.println("*beep boop* you loaded a file"));
		saveItem.addActionListener(e -> System.out.println("*beep boop* you saved the file"));
		exitItem.addActionListener(e -> System.exit(0));
		
		loadItem.setMnemonic(KeyEvent.VK_L);  // l for load
		saveItem.setMnemonic(KeyEvent.VK_S);  // s for save
		exitItem.setMnemonic(KeyEvent.VK_E);  // e for exit
		
		fileMenu.setMnemonic(KeyEvent.VK_F);  // alt + f for file
		editMenu.setMnemonic(KeyEvent.VK_E);  // alt + e for edit
		helpMenu.setMnemonic(KeyEvent.VK_H);  // alt + h for help
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		
	}
	
}
