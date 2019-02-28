package cihan.swing.sample;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Genisletme extends  JLabel { //JButton{
	private String adi;
	private String soyadi;
	private String tckNo;
	private Roller rol;
	private int rolNo;
	
	public int getRolNo() {
		return rolNo;
	}

	public void setRolNo(int rolNo) {
		this.rolNo = rolNo;
	}

	public Genisletme() {
		super("asasdsd");  //labelin textini superden aldýk.
	} 
	
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public String getTckNo() {
		return tckNo;
	}
	public void setTckNo(String tckNo) {
		this.tckNo = tckNo;
	}
	public Roller getRol() {
		return rol;
	}
	public void setRol(Roller rol) {
		this.rol = rol;
	}
	

}
