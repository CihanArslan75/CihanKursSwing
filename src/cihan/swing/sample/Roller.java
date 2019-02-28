package cihan.swing.sample;

public enum Roller {
	JAVA_TEKNOLOJI_LEAD(1),   //0
	DEVELOPER(2),     //1
	COMPUTER_ENGINEER(3),  //2 
	CIO(4); // 3 eþleþtiriyor
	
	private final int no;
	Roller(int no) {
		  this.no = no;
	}
	
	public int getNo() {
		return this.no;
	}

}
