package dickman_p1_package;

import java.util.Scanner; // Import Scanner for Inputting Values

public class Encrypt {
	
	public static void main(String[] args) {
		
		// Scanner Help
		Scanner input = new Scanner(System.in);
			
		// Welcome Message
		System.out.println("INTERNET ENCRYPTION PROGRAM \n");
		
		// User Input
		System.out.println("Enter a Four (4) Digit Value:");
		
			int data[] = new int[4]; // Creates Array
			
			// Loop Used to Add Each Digit to the Array
			for (int count = 0; count < 4; count++) {
				System.out.println("Digit " + (count + 1) + (":"));
				data[count] = input.nextInt();
			}
			
		// Encryption Calculations
		System.out.println("\nEncrypting... \n");
		
			// Remainder of (Value + 7) / 10
			for (int count = 0; count < 4; count++) {
				data[count] = (data[count] + 7) % 10;
			}
			
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
				
			
		// Print Encrypted Digits
		System.out.print("Encrypted Data: ");
		for (int count = 0; count < 4; count++) {
			System.out.print(data[count]);
		}

	}

}
