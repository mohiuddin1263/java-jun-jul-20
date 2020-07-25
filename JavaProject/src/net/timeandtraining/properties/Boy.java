package net.timeandtraining.properties;

public class Boy {
	int candyCount = 5;
	
	public void giveCandyToGuest() {
		
		if (candyCount > 0) {
			System.out.println("Okaaaay! I gave 1 candy.");
			candyCount = candyCount-1;
		}else {
			System.out.println("Sorry I don't have anymore candy :(");
		}
		
		
	}
	
	public void howManyCandyYouHave() {
		System.out.println("I have "+ candyCount+" candy");
		
	}
	
	

}
