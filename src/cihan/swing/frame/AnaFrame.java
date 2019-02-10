package cihan.swing.frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

public class AnaFrame extends JFrame{
	private JTextField txt1;
	public AnaFrame(String a) {
		setTitle("Uyar\u0131 Ekran\u0131");
		getContentPane().setLayout(null);
		setBounds(200, 200, 400, 200);
		
		JLabel lblUyari = new JLabel("Uyar\u0131");
		lblUyari.setBounds(69, 87, 87, 16);
		getContentPane().add(lblUyari);
		
		txt1 = new JTextField();
		txt1.setBounds(185, 84, 116, 22);
		getContentPane().add(txt1);
		txt1.setColumns(10);
		txt1.setText(a);
	}
}
