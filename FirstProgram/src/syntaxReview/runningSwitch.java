package syntaxReview;

import java.util.Scanner;

public class runningSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner carScanner = new Scanner(System.in);
		System.out.println("Please enter your favorite car");
		String car = carScanner.next();
		
		switch(car) {

		case "USA":
			System.out.println("You speak English");
			break;
		case "Cuba":
			System.out.println("You speak Spanish");
			break;
		case "China":
			System.out.println("You Speak Chinese");
			break;
		default:
			System.out.println("I dont know what language you speak");

		}
		
	}

}
