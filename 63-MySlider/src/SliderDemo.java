import java.awt.*;
import javax.swing.*;
//import javax.swing.event.*;

//public class SliderDemo implements ChangeListener{
public class SliderDemo {

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo() {
		
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0, 100, 50);  // arguments includes: min, max, and starting point of slider
		
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		
		slider.setPaintLabels(true);
		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
		
//		slider.setOrientation(SwingConstants.VERTICAL);  // default setting
		slider.setOrientation(SwingConstants.VERTICAL);
		
//		slider.addChangeListener(this);
		slider.addChangeListener(e -> label.setText("°C = " + slider.getValue()));
		
		label.setText("°C = " + slider.getValue());
		label.setFont(new Font("MV Boli", Font.BOLD, 25));
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setVisible(true);
	}

//	@Override
//	public void stateChanged(ChangeEvent e) {
//		label.setText("°C = " + slider.getValue());
//		
//		
//	}
	
}
