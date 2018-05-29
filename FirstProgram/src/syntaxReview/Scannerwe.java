package syntaxReview;

import java.util.Scanner;

public class Scannerwe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a=10;
//		a=10
				
//		Scanner myScanner=new Scanner(System.in);
//		System.out.println("Please enter first number");
//		int firstNumber=myScanner.nextInt();
//		System.out.println(firstNumber);
		
//		System.out.println("Please enter second number");
//		int secondNumber=myScanner.nextInt();
		
//		if(firstNumber>secondNumber) {
//		System.out.println(firstNumber + "is greater than "+ secondNumber);
//			
//		}
		
		
		// let user input favorite vehicle make and based on input give msg
		
//		Scanner carScanner = new Scanner(System.in);
//		System.out.println("Please enter your favorite car");
//		String car = carScanner.next();
//
//		if (car.equals("Toyota")) {
//			System.out.println("Your like japanese cars");
//		} else if (car.equals("Maserati")) {
//			System.out.println("You are rich");
//		} else if (car.equals("BMW")) {
//			System.out.println("You like german cars");
//		} else {
//			System.out.println("I dont know what type of cars you like");
			
//		}
		
		//Ask where user was born and based on the input tell what language
		//they speak(give at least 3 options):
		//Ex: if user says USA--> english
		
		
		//Scanner languageScanner = new Scanner(System.in);
	//	System.out.println("Please enter the country you were born");
		//String language= languageScanner.next();
		
	//	if (language.equals("USA")) {
			//System.out.println("You speak English");
		//}else if (language.equals("Cuba")){
		//System.out.println("You speak Spanish");
	//	}else if (language.equals("China")) {
			//System.out.println("You speak Chinese");
		//}else {
			
			
	//	}
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
