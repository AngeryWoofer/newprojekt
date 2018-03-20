package pack;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Okno extends JFrame {
	private JLabel label;
	private JTextField field;
	private JButton but;
	private JTextArea area;
	
	public Okno() {
		this.setTitle("šifrování XOR");
		this.setResizable(false);
		this.setSize(700, 400);
		this.setLayout(new FlowLayout());
		
		
	}

}
