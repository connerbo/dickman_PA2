package dickman_p1_package;

import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		
		// Scanner
		Scanner input = new Scanner(System.in);
		
		// Welcome
		System.out.println("INTERNET DECRYPTION PROGRAM \n");
		
		// User Input
		System.out.println("Enter Four (4) Digit Encrpyted Value:");
		
		int data[] = new int[4];
		
			// Loop Used to Add Each Digit to the Array
			for (int count = 0; count < 4; count++) {
				System.out.println("Digit " + (count + 1) + (":"));
				data[count] = input.nextInt();
			}
			
		// Decryption Calculations
		System.out.println("\nDecrypting... \n");
		
			// Swap Values
			int temp;
			
				// First and Third
				temp = data[0];
				data[0] = data[2];
				data[2] = temp;
				
				// Second and Fourth
				temp = data[1];
				data[1] = data[3];
				data[3] = temp;
				
			// Remainder of (Value + 7) / 10
			for (int count = 0; count < 4; count++) {
				data[count] = (data[count] + 3) % 10;
			}
					
		// Print Encrypted Digits
		System.out.print("Encrypted Data: ");
		for (int count = 0; count < 4; count++) {
			System.out.print(data[count]);
		}
		
	}
	
}
