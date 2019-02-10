package cihan.swing.ornek1;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class Runner extends JFrame{
	private JTextField textField1;
	public Runner() {
		getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("Cihan");
		lbl1.setFont(new Font("Arial", Font.PLAIN, 15));
		lbl1.setBounds(29, 72, 90, 38);
		getContentPane().add(lbl1);
		
		textField1 = new JTextField();
		textField1.setText("Cihan");
		textField1.setBounds(107, 80, 116, 22);
		getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Runner.class.getResource("/resources/bomb_r.png")));
		
		btnNewButton.setBounds(132, 167, 52, 38);
		getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(261, 195, 31, 22);
		getContentPane().add(comboBox);
	}
}
