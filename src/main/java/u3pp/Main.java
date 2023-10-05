package u3pp;

import java.util.Scanner;

/**
 * This code takes the input for the first time, runs it into a while loop, and then runs it through isLeapYear to test whether it is or isn't a
 * leap year. Once the result has been shown, the next input starts at the beginning of the while loop rather than having to start over.
 * 
 * @ian
 */

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a year (or enter STOP to end): ");
		String input = sc.nextLine();

		while (!input.toUpperCase().equals("STOP")) {

		int pickles = Integer.parseInt(input);
		boolean tomatoes = LeapYear.isLeapYear(pickles);

		if (tomatoes == true) {
			System.out.println(input + " is a leap year");
		}
		else {
			System.out.println(input + " is not a leap year");
		}

		System.out.println("Enter a year (or enter STOP to end): ");
		input = sc.nextLine();
		}

		sc.close();
	}
}