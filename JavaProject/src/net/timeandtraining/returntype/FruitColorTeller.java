package net.timeandtraining.returntype;

public class FruitColorTeller {
	
	public void fruit(String fruitName) {
		
		switch (fruitName) {
		case "Apple":
			System.out.println("Color for the fruit " + fruitName +" is: red");
			break;
		case "Mango":
			System.out.println("Color for the fruit " + fruitName +" is: green");
			break;
		case "Cherry":
			System.out.println("Color for the fruit " + fruitName +" is: purple");
			break;
		case "Banana":
			System.out.println("Color for the fruit " + fruitName +" is: yello");
			break;
		case "Pear":
			System.out.println("Color for the fruit " + fruitName +" is: green");
			break;
		case "Grape":
			System.out.println("Color for the fruit " + fruitName +" is: green");
			break;


		default:
			System.out.println("Invalid fruitname: "+ fruitName);
			break;
		}
		/*
		 * if(fruitName.equals("Banana")) { System.out.println("Color for the fruit " +
		 * fruitName +" is: yellow"); }else if(fruitName.equals("Apple")){
		 * System.out.println("Color for the fruit " + fruitName +" is: red"); }else
		 * if(fruitName.equals("Mango")){ System.out.println("Color for the fruit " +
		 * fruitName +" is: green"); }else { System.out.println("Invalid fruit name");
		 * 
		 * }
		 */
		
		
	}

}
