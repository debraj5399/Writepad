package writepad;
import java.awt.Image;

import javax.swing.*;

public class About extends JFrame {
	About() {
		setBounds(600, 200, 700, 600);
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(""));
		Image i2 = i1.getImage().getScaledInstance(400, 80, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		l1.setBounds(150, 40, 400, 80);
		add(l1);
	}
	
	public static void main(String[] args) {
		new About().setVisible(true);
	}
}
