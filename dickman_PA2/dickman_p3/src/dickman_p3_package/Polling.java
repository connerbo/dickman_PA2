package dickman_p3_package;

import java.util.Scanner;

public class Polling {

	public static void main(String[] args) {
		
		// Scanner
		Scanner input = new Scanner(System.in);
		
		// Initialize Arrays
		String[] topics = new String[5];
		int[][] responses = new int[5][10];
		
		// Welcome
		System.out.println("Welcome to the Polling Program! \n");
		
		// Number of Users
		int numUsers;
		System.out.println("How Many Users Will be Participating? \n");
		numUsers = input.nextInt();
		
		// Poll
		for (int count = 0; count < numUsers; count++) {
			System.out.println("USER: " + (count + 1));
			System.out.println("On a scale of 1 to 10, how important is each topic to you?");
			
			int answer; // Used to add values to response array
			
			// 0 - Environmental Issues
			topics[0] = "Environmental Issues";
			System.out.print("Environmental Issues: ");
			answer = input.nextInt();
			responses[0][answer - 1]++;
			
			// 1 - Food
			topics[1] = "Food";
			System.out.print("Food: ");
			answer = input.nextInt();
			responses[1][answer - 1]++;
			
			// 2 - Money
			topics[2] = "Money";
			System.out.print("Money: ");
			answer = input.nextInt();
			responses[2][answer - 1]++;
			
			// 3 - Family
			topics[3] = "Family";
			System.out.print("Family: ");
			answer = input.nextInt();
			responses[3][answer - 1]++;
			
			// 4 - Technology
			topics[4] = "Technology";
			System.out.print("Technology: ");
			answer = input.nextInt();
			responses[4][answer - 1]++;
			
		}
		
		// Poll Results
		System.out.println("\t\tTopic \t 1 \t 2 \t 3 \t 4 \t 5 \t 6 \t 7 \t 8 \t 9 \t 10 \tAverage");		
		
			int max = 0;
			int min = 0;
			String maxWin;
			String minWin;
		
			// 0 - Environmental Issues
			int avg = 0;
			
			System.out.print(topics[0]);
			for (int count = 0; count < 10; count++) {
				System.out.print(" \t " + responses[0][count]);
				avg = avg + ( responses[0][count] ) * (count + 1);
			}
			avg = avg / numUsers;
			System.out.println(" \t" + (avg));
			max = avg;
			min = avg;
			maxWin = topics[0];
			minWin = topics[0];
			
			// 1 - Food
			avg = 0;
			
			System.out.print("\t\t" + topics[1]);
			for (int count = 0; count < 10; count++) {
				System.out.print(" \t " + responses[1][count]);
				avg = avg + ( responses[1][count] ) * (count + 1);
			}
			avg = avg / numUsers;
			System.out.println(" \t" + (avg));
			if (avg > max) { 
				max = avg;
				maxWin = topics[1];
			}
			if (avg < min) {
				min = avg;
				minWin = topics[1];
			}
		
			// 2 - Money
			avg = 0;
			
			System.out.print("\t\t" + topics[2]);
			for (int count = 0; count < 10; count++) {
				System.out.print(" \t " + responses[2][count]);
				avg = avg + ( responses[2][count] ) * (count + 1);
			}
			avg = avg / numUsers;
			System.out.println(" \t" + (avg));
			if (avg > max) { 
				max = avg;
				maxWin = topics[2];
			}
			if (avg < min) {
				min = avg;
				minWin = topics[2];
			}
			
			// 3 - Family
			avg = 0;
			
			System.out.print("\t\t" + topics[3]);
			for (int count = 0; count < 10; count++) {
				System.out.print(" \t " + responses[3][count]);
				avg = avg + ( responses[3][count] ) * (count + 1);
			}
			avg = avg / numUsers;
			System.out.println(" \t" + (avg));
			if (avg > max) { 
				max = avg;
				maxWin = topics[3];
			}
			if (avg < min) {
				min = avg;
				minWin = topics[3];
			}
			
			// 4 - Technology
			avg = 0;
			
			System.out.print("\t" + topics[4]);
			for (int count = 0; count < 10; count++) {
				System.out.print(" \t " + responses[4][count]);
				avg = avg + ( responses[4][count] ) * (count + 1);
			}
			avg = avg / numUsers;
			System.out.println(" \t" + (avg));
			if (avg > max) { 
				max = avg;
				maxWin = topics[4];
			}
			if (avg < min) {
				min = avg;
				minWin = topics[4];
			}
			
			// Highest Point Total
			System.out.println("Highest Point Total: " + maxWin + " with " + (max * numUsers) + " points!");
			
			// Lowest Point Total
			System.out.println("Lowest Point Total: " + minWin + " with " + (min * numUsers) + " points!");

	}
	
}
