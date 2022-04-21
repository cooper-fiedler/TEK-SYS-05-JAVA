package coreJavaBasics;

import java.util.Stack;

public class OperatorsAndNumbers {

	public static void main(String[] args) {

//		 QUESTION 1 - Converting decimal values to binary values
//		 1: 0000 0001
//		 8: 0000 1000
//		 33: 0010 0001
//		 78: 0100 1110
//		 787: 0011 0001 0011
//		 33,987: 1000 0100 1100 0011

		Stack<Integer> remainders = new Stack<>();
		int decimalNumber = 33987;
		while (decimalNumber >= 2) {
			remainders.push(decimalNumber % 2);
			decimalNumber /= 2;
		}
		remainders.push(decimalNumber);
		StringBuilder builder = new StringBuilder();
		int size = remainders.size();
		for (int i = 0; i < size; i++) {
			builder.append(remainders.pop());
		}
		
		System.out.println(builder);

//		 QUESTION 2 - Converting binary values to decimal values
//		 0010: 2
//		 1001: 9
//		 0011 0100: 52
//		 0111 0010: 144
//		 0010 0001 1111: 1055
//		 0010 1100 0110 0111: 11367

		int binaryNumber = 110100;
		decimalNumber = 0;
		int n = 0;
		while (true) {
			if (binaryNumber == 0) {
				break;
			}
			else {
				int temp = binaryNumber % 10;
				decimalNumber += temp * Math.pow(2, n);
				binaryNumber = binaryNumber / 10;
				n++;
			}

		}

		System.out.println(decimalNumber);

//		 QUESTION 3
//		
//		 Write a program that declares an integer a variable x and assigns the value 2
//		 to it and prints out the binary string version of the number (
//		 Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift
//		 by 1 and assign the result to x. Before printing the results, write a comment
//		 with the predicted decimal value and binary string. Now, print out x in
//		 decimal form and in binary notation.

		int x = 2;

		System.out.println(Integer.toBinaryString(x));

		x = x << 1;

		System.out.println("Decimal: " + x + ", Binary: " + Integer.toBinaryString(x));

//		 QUESTION 4
//		
//		 Write a program that declares a variable x and assigns 150 to it and prints
//		 out the binary string version of the number. Now use the right shift operator
//		 (>>) to shift by 2 and assign the result to x. Write a comment indicating
//		 what you anticipate the decimal and binary values to be. Now print the value
//		 of x and the binary string.

		x = 150;

		System.out.println(Integer.toBinaryString(x));

		x = x >> 2;

		System.out.println("Decimal: " + x + ", Binary: " + Integer.toBinaryString(x));

//		 QUESTION 5
//		
//		 Write a program that declares 3 int variables x, y, and z. Assign 7 to x and
//		 17 to y. Write a comment that indicates what you predict will be the result
//		 of the bitwise & operation on x and y. Now use the bitwise & operator to
//		 derive the decimal and binary values and assign the result to z. Now, with
//		 the preceding values, use the bitwise | operator to calculate the “or” value
//		 between x and y. As before, write a comment that indicates what you predict
//		 the values to be before printing them out.

		x = 7;
		int y = 17;
		int z;

		z = x & y;

		System.out.println(Integer.toBinaryString(z));

		z = x | y;

		System.out.println(Integer.toBinaryString(z));

//		 QUESTION 6
//		
//		 Write a program that declares an integer variable, assigns a number, and uses
//		 a postfix increment operator to increase the value. Print the value before
//		 and after the increment operator.

		x = 7;

		System.out.println(x++);
		System.out.println(x);

//		QUESTION 7
//		
//		 Write a program that demonstrates at least 3 ways to increment a variable by
//		 1 and does this multiple times. Assign a value to an integer variable, print
//		 it, increment by 1, print it again, increment by 1, and then print again. 

		x = 7;

		System.out.println(++x);
		System.out.println(x += 1);
		System.out.println(x = x + 1);

//		 QUESTION 8
//	
//		 Write a program that declares 2 integer variables, x, and y, and then assigns
//		 5 to x and 8 to y. Create another variable sum and assign the value of ++x
//		 added to y and print the result. Notice the value of the sum (should be 14).
//		 Now change the increment operator to postfix (x++) and re-run the program.
//		 Notice what the value of sum is. The first configuration incremented x and
//		 then calculated the sum while the second configuration calculated the sum and
//		 then incremented x.

		x = 7;
		y = 10;
		z = ++x + y;

		System.out.println(z);

		x = 7;
		y = 10;
		z = x++ + y;

		System.out.println(z);
	}
}
