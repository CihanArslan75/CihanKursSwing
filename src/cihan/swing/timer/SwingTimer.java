package cihan.swing.timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;
import javax.swing.Timer;
import javax.swing.JTextArea;

public class SwingTimer extends JFrame{
	JProgressBar prgbarOrnek = null;
	JButton btnTikla=null;
	JTextArea txt1 = null;
	Timer timer=null;
	
	public SwingTimer() {
		Initialize();
	}

	private void Initialize() {
		setTitle("Deneme Ekranı");
		getContentPane().setLayout(null);
		setBounds(150, 250 ,484, 400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		btnTikla = new JButton("Tıkla");
	
		prgbarOrnek = new JProgressBar();
		prgbarOrnek.setBounds(23, 46, 264, 44);
		getContentPane().add(prgbarOrnek);
		
		btnTikla.setVisible(true);
		btnTikla.setBounds(311, 57, 103, 23);
		
		txt1 = new JTextArea();
		txt1.setBounds(29, 118, 140, 23);
		txt1.setVisible(true);
		getContentPane().add(txt1);
			
			
//		btnTikla.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				
//				Thread t1= new Thread(new Runnable() {
//					@Override
//					public void run() {
//						btnTikla.setEnabled(false);
//						for (int i = 0; i <= 100; i++) {                 // butonun cliğinin bittiğini bilmiyor.
//							System.out.println(prgbarOrnek.getValue());
//							prgbarOrnek.setValue(i);
//							prgbarOrnek.setStringPainted(true);
//							prgbarOrnek.setString(" "+i);
//							txt1.setText(toString().valueOf(i));
//							txt1.getText(); 
//							try {
//								Thread.sleep(100);
//							} catch (InterruptedException e1) {
//								
//								e1.printStackTrace();
//							}
//						}
//						btnTikla.setEnabled(true);
//					}
//				});
//				t1.start();
//				
//				
//				
//			}
//		});
		
		
		btnTikla.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(timer==null) {
				timer =new Timer(50,new ActionListener() {
					int deger=0;
					@Override
					public void actionPerformed(ActionEvent e) {
						deger++;
						if(deger>100) {
							timer.stop();
						    timer=null;	
						}
						prgbarOrnek.setValue(deger);
						txt1.setText(toString().valueOf(deger));
					}
				});
				timer.start();
				}		
			}
		});
		
		getContentPane().add(btnTikla);
			
		
	}
}