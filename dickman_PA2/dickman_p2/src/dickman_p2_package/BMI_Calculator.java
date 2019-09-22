package dickman_p2_package;

import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {
		
		// Scanner
		Scanner input = new Scanner(System.in);
		
		// Welcome
		System.out.println("BMI CALCULATOR \n");
		
		// User Selects Measurement System
		System.out.println("Select Measurement System:");
		System.out.println("\t 1: US Customary");
		System.out.println("\t 2: Metric");
		System.out.println("Selection: ");
		
		int userSystem = input.nextInt();

		// US Customary
		if (userSystem == 1) {
			
			// Input Weight
			int weight = 0;
			System.out.println("Enter Weight in Pounds: ");
			weight = input.nextInt();
			
			// Input Height
			int height = 0;
			System.out.println("Enter Height in Inches: ");
			height = input.nextInt();
			
			// BMI Calculations
			double bmi = 0;
			bmi = (703 * weight) / (Math.pow(height, 2));
			
			// Results
			System.out.println("\nUser's BMI: " + bmi);
			System.out.println("BMI Categories:");
			System.out.println("Underweight =< 18.5");
			System.out.println("Normal Weight = 18.5 – 24.9");
			System.out.println("Overweight = 25 – 29.9");
			System.out.println("Obesity = BMI of 30 or Greater");
		}
		
		// Metric
		if (userSystem == 2) {
			
			// Input Weight
			int weight = 0;
			System.out.println("Enter Weight in Kilograms: ");
			weight = input.nextInt();
			
			// Input Height
			int height = 0;
			System.out.println("Enter Height in Meters: ");
			height = input.nextInt();
			
			// BMI Calculations
			double bmi = 0;
			bmi = (703 * weight) / (Math.pow(height, 2));
			
			// Results
			System.out.println("\nUser's BMI: " + bmi);
			System.out.println("BMI Categories:");
			System.out.println("Underweight =< 18.5");
			System.out.println("Normal Weight = 18.5 – 24.9");
			System.out.println("Overweight = 25 – 29.9");
			System.out.println("Obesity = BMI of 30 or Greater");
		}
		
	}
	
}
