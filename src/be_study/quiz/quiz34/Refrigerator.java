package be_study.quiz.quiz34;

public class Refrigerator {

	String brand;
	int liter;
	boolean isPowerOn;
	boolean isTemperatureControl;
	int door;
	
	Freezer freezer;

	
	public void powerOn() {
		this.isPowerOn = true;
	}
	
	public void isTemperatureControl() {
		this.isTemperatureControl = true;
	}
}
