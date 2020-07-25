package net.timeandtraining.returntype;

public class CoinChanger {
	
	
	
	public void takeDollar(int dollar) {
		boolean res  = (
				dollar == 1 
				|| dollar == 5 
				|| dollar == 10 
				|| dollar == 20
				|| dollar == 50
				);
		
		if(res == true) {
			int cents = (dollar * 100);
			int quarter = (cents / 25);
			System.out.println("You will get " + quarter +  " quarter");
		}else {
			System.out.println("Please only enter bill of: 1, 5, 10, 20 and 50");
		}
		
	}
	

}
