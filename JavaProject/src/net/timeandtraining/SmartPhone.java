package net.timeandtraining;

public class SmartPhone {
	
	public void call(String n) {
		System.out.println("calling to: " + n );
	}
	
	public void sendTextMessage(String personName, String msg) {
		System.out.println("Sending text to "+ personName + " . And message is: ['"+ msg+"']");
	}
	

}
