package SwingDemo;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DataNotFound {
	JLabel l6;
	public DataNotFound() {
		JFrame fr = new JFrame("Alert");
		fr.setVisible(true);
		fr.setSize(300, 200);
		fr.setLayout(null);
		
		l6 = new JLabel("data not found");
		l6.setBounds(50, 100, 120, 20);
		fr.add(l6);
	}
}
