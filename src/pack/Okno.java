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
		this.setTitle("�ifrov�n� XOR");
		this.setResizable(false);
		this.setSize(700, 400);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		label = new JLabel("Zadejte cestu: ");
		this.add(label);
		field = new JTextField(40);
		this.add(field);
		but = new JButton("Za�ifrovat");
		this.add(but);
		area = new JTextArea(15,45);
		this.add(area);
		this.setVisible(true);
	}
	
	

}
