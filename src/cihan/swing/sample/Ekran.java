package cihan.swing.sample;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Ekran extends JFrame{
	 JRadioButton rdbtnMale ;
	 JRadioButton rdbtnFemale ;
	  
 
	public Ekran() {
			
		  setTitle("Ekran Örnel");
		  setBounds(50, 250, 400, 400);
		  getContentPane().setLayout(null);
		  setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		  
		  
		  Genisletme btnBenimLbl = new Genisletme();
		  btnBenimLbl.setBounds(28, 70, 91, 23);
		  getContentPane().add(btnBenimLbl);
		  btnBenimLbl.setSoyadi("Arslan");
		  btnBenimLbl.setAdi("Cihan");
		  btnBenimLbl.setRol(Roller.JAVA_TEKNOLOJI_LEAD);
		  btnBenimLbl.setRolNo(Roller.JAVA_TEKNOLOJI_LEAD.getNo());
		  
		 
		  
		  
		  btnBenimLbl.addMouseListener(new MouseAdapter() {
		  	
		    @Override
		  	public void mouseClicked(MouseEvent e) {
		    	JOptionPane.showMessageDialog(Ekran.this,btnBenimLbl.getAdi()+" "+btnBenimLbl.getSoyadi()+" "+btnBenimLbl.getRolNo());
		  	}
		  });
		  
		  JButton btnNewButton = new JButton("New button");
		  btnNewButton.setBounds(238, 70, 91, 23);
		  getContentPane().add(btnNewButton);
		  
		   rdbtnMale = new JRadioButton("Male");
		   rdbtnFemale = new JRadioButton("Female");
		  
		  rdbtnMale.addItemListener(new ItemListener() {
		  	public void itemStateChanged(ItemEvent e) {
		  		stateChangeEventForRadioMale(e);
		  	}

		
		  });
		  rdbtnMale.setBounds(10, 152, 109, 23);
		  getContentPane().add(rdbtnMale);
		  
		  
		  rdbtnFemale.addItemListener(new ItemListener() {
		  	public void itemStateChanged(ItemEvent e) {
		  		stateChangeEventForRadioFemale(e);
		  	 
		  	}
		  });
		  
		  rdbtnFemale.setBounds(120, 152, 109, 23);
		  getContentPane().add(rdbtnFemale);
		  
	}
			protected void stateChangeEventForRadioMale(ItemEvent e) {
				 if(rdbtnMale != null && rdbtnFemale!=null) {
					 if(rdbtnMale.isSelected()) 
						 rdbtnFemale.setSelected(false);
				  }
			
	}
			
			protected void stateChangeEventForRadioFemale(ItemEvent e) {
				 if(rdbtnFemale != null && rdbtnMale!=null) {
					 if(rdbtnFemale.isSelected()) 
						 rdbtnMale.setSelected(false);
				  }
				
	}
	
		  
}
