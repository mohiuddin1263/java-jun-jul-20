package net.timeandtraining;

public class CalculatorApp {

	public static void main(String[] args) {
		
		Calculator myCal = new Calculator();
		
		int r = myCal.doAddition(75, 85);
		
		myCal.doSubtraction(r, 10);
		
		
		
	}

}
