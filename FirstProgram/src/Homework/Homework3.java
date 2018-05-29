package Homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		
		Scanner number= new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first number: ");
		fnum = number.nextDouble();
		System.out.println("Enter second number: ");
		snum = number.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
		
		
	}
}
