package cihan.swing.sample;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JTableSample extends JFrame{
	private JTable table;
	String adi;
	
	public JTableSample() {
		Initialize();
	}

	private void Initialize() {
		
		  setTitle("Ekran Örnel");
		  setBounds(50, 250, 478, 400);
		  setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		  GridBagLayout gridBagLayout = new GridBagLayout();
		  gridBagLayout.columnWidths = new int[]{423, 0, 0, 0};
		  gridBagLayout.rowHeights = new int[]{359, 0, 0};
		  gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		  gridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		  getContentPane().setLayout(gridBagLayout);
		  
				  
		  String[][] data =new String[3][5];
		  String[] columnNames = {"Adý","Soyadý","tcno","No","Email"};
		  JScrollPane scrollPane = new JScrollPane();
		  GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		  gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		  gbc_scrollPane.fill = GridBagConstraints.BOTH;
		  gbc_scrollPane.gridx = 0;
		  gbc_scrollPane.gridy = 0;
		  getContentPane().add(scrollPane, gbc_scrollPane);
		  
		  data[0][0]="Cihan";
		  data[0][1]="arslan";
		  data[0][2]="arslan";
		  data[1][0]="Atilla";
		  data[1][1]="arslan";
		  data[1][2]="arslan";
		  table = new JTable(data,columnNames);
		  DefaultTableModel model = new DefaultTableModel(data,columnNames);
		  table.setModel(model);
		 
		  
		  table.addMouseListener(new MouseAdapter() {
		  	@Override
		  	public void mouseClicked(MouseEvent e) {
		  		int row=table.getSelectedRow();
		  		//adi= (String) table.getModel().getValueAt(row, 0);
		  		 DefaultTableModel m =(DefaultTableModel) table.getModel();
		  		 Object o = m.getDataVector().elementAt(row);
		  			  		
		  		adi=(String) o.toString();
		  	}
		  });
		  scrollPane.setViewportView(table);
		  
		  JButton btnNewButton = new JButton("New button");
		  btnNewButton.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		JOptionPane.showConfirmDialog(JTableSample.this, adi);
		  	}
		  });
		  GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		  gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		  gbc_btnNewButton.gridx = 1;
		  gbc_btnNewButton.gridy = 0;
		  getContentPane().add(btnNewButton, gbc_btnNewButton);
		  		  
		  
		
		  
		 
	}
}
