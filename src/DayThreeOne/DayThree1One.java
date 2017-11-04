//defining methods
//method overloading

package DayThreeOne;

import java.util.Scanner;

public class DayThree1One {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);

		int x = 0, y = 0;
		//double z = 0, t = 0;
		int Result = 0;
		//double Result1 = 0;

		// if you put (int Result = x + y; before the sysout,
		// you're putting the result before the input so it
		// won't work

		x = readInput();

		y = readInput();

		Result = addNumbers(x, y);
		
		//double Result1 = addNumbers(12.5,7);
		
		System.out.println(Result);
		//System.out.println(Result1);
		System.out.println();

		scan1.close();
	}

	public static int addNumbers(int x, int y) {
		int Result;
		Result = x + y;
		return Result;
	}

	// method overloading day3.3
	public static double addNumbers(double x, double y) {
		double Result;
		Result = x + y;
		return Result;
	}

	public static int readInput() {
		int input = 0;
		Scanner scan1 = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		input = scan1.nextInt();
		scan1.nextLine();
		// scan1.close();
		return input;
		// nothing comes after return, it's the last statement

	}

}
