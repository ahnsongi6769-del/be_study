package be_study.quiz.quiz34;

public class Trashcan {

	int liter;
	String color;
	int fullPercentage;
	boolean openClose;

	
	
	
	public int literIn(int n) {
		
		return liter += n;
	}
	
	public int literOut(int n) {
		
		return liter -= n;
	 }
	
	public void literOn() {
		this.openClose= true;
	}
	public void literOff() {
		this.openClose= false;
	}

	
	
}
