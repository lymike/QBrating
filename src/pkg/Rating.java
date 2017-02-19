package pkg;

import java.util.Scanner;

public class Rating {

	public static void main(String[] args){
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Total number of passing attempts:");
		double ATT = userInput.nextDouble();
		
		System.out.println("Total number of completions:");
		double COMP = userInput.nextDouble();
		
		System.out.println("Total number of passing yards:");
		double YDS = userInput.nextDouble();
		
		System.out.println("Total number of touchdown passes:");
		double TD = userInput.nextDouble();
		
		System.out.println("Total number of interceptions:");
		double INT = userInput.nextDouble();
		
		double a = ((COMP/ATT - 0.3) * 5);
		double b = ((YDS/ATT - 3) * 0.25);
		double c = (TD/ATT * 20);
		double d = (2.375 - INT/ATT * 25);
		
		double score = ((a + b + c + d)/6 * 100);
		
		System.out.println("Player Rating: " + score);
	}
		
	 
}
