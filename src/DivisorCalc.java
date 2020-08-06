/* August 5, Rachel Papiernik
This program reads an input numbers and finds the greatest common divisor between two positive numbers
*/
import java.util.Scanner;
public class DivisorCalc {

	public static void main(String[] args) {
		// variables declared
		int num1, num2;

		// scanner to get user input
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number#1 :");
		num1 = sc.nextInt();

		System.out.print("Enter the Number#2 :");
		num2 = sc.nextInt();

		
		int greatestComDiv = gcd(num1, num2);

		// Displaying the greatest common divisor of the entered numbers
		System.out.println("The GCD of " + num1 + " and " + num2 + " is :" + greatestComDiv);

		sc.close();
	}
	// recusion method
	private static int gcd(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		}
		return gcd(num2, num1 % num2);
		

	}

}