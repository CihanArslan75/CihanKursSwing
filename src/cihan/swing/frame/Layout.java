package cihan.swing.frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Layout extends JFrame{
	private JTextField txtKullaniciAdi;
	private JTextField txtSifre;
	public Layout() {
		setTitle("Giriş Ekranı");
		getContentPane().setLayout(null);
		setBounds(100, 100, 500, 500);
		
		JLabel lbl1 = new JLabel("Kullanıcı Adı");
		lbl1.setBounds(47, 48, 87, 16);
		getContentPane().add(lbl1);
		
		JLabel lbl2 = new JLabel("Şifre");
		lbl2.setBounds(47, 88, 56, 16);
		getContentPane().add(lbl2);
		
		txtKullaniciAdi = new JTextField();
		txtKullaniciAdi.setBounds(146, 45, 116, 22);
		getContentPane().add(txtKullaniciAdi);
		txtKullaniciAdi.setColumns(10);
		
		txtSifre = new JTextField();
		txtSifre.setBounds(146, 80, 116, 22);
		getContentPane().add(txtSifre);
		txtSifre.setColumns(10);
		
		JButton btnIptal = new JButton("İptal");
		btnIptal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnIptal.setBounds(100, 149, 97, 25);
		getContentPane().add(btnIptal);
		
		JButton btnGiris = new JButton("Giriş");
		btnGiris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtKullaniciAdi.getText().equals("cihan")) {
						if(txtSifre.getText().equals("arslan")) {
							AnaFrame a= new AnaFrame(txtKullaniciAdi.getText());
							a.setVisible(true);
							Layout.this.dispose();
						}
						else {
							JOptionPane.showMessageDialog(Layout.this,"Şifre Hatalı");
						} 
				   }
					else 
					{
						JOptionPane.showMessageDialog(Layout.this,"Kullanıcı Adı Hatalı");
					}
				}
		});
		btnGiris.setBounds(220, 149, 97, 25);
		getContentPane().add(btnGiris);
	}
}
