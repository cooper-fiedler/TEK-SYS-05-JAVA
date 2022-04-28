package coreJavaBasics;

public class Loops {

	public static void main(String[] args) {
//		Write a program that uses a for-loop to loop 
//		through the numbers 1-10 and prints out each number.

		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
//		Write a program that uses a while loop to loop 
//		through the numbers 0-100 in increments of 10 and prints out each number.

		int i = 0;
		
		while (i <= 100){
			if (i % 10 == 0) {
				System.out.println(i);
			}
			i += 1;
		}
		
		
//		Write a program that uses a do-while-loop to loop 
//		through the numbers 1-10 and prints out each number.
		i = 1;
		do {
			System.out.println(i);
			i += 1;
		} while (i <= 10);
		
//		Write a program that uses a for-loop to loop 
//		through the numbers 1-100. Print out each number if is a multiple of 5, 
//		but do not print out any numbers between 25 and 75. 
//		Use the “continue” statement to accomplish this.

		
		for(i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				if (i < 25 || i > 75) {
					System.out.println(i);
				}
			}
		}
		
		
//		Write a program that uses a for-loop to loop through the numbers 1-100. 
//		Print out each number if is a multiple of 5, 
//		but do not print out any numbers greater than 50. 
//		Use the “break” keyword to accomplish this.

		for (i = 1; i <= 100; i++) {
			if (i > 50) {
				break;
			}
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
		
//		Write a program that uses nested for-loops to output the following:
//		Week 1:
//
//		Day 1
//
//		Day 2
//
//		Day 3
//
//		Day 4
//
//		Day 5
//
//		Week 2:
//
//		Day 1
//
//		Day 2
//
//		Day 3
//
//		Day 4
//
//		Day 5
//		
		int week = 1;
		int day = 1;
		
		for (week = 1; week <= 2; week++) {
			System.out.println("Week " + week + ":");
			for (day = 1; day <= 5; day++) {
				System.out.println("Day " + day);
			}
		}
		
		
		
//		 
//
//		Write a program that returns all the available palindromes within 10 and 200. 
//		The following output will be produced:
//		11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191,
		
		for (i = 10; i <= 200; i++) {
			int num = i;
			int reversed = 0;
			for(;num != 0; num /= 10) {
			      int digit = num % 10;
			      reversed = reversed * 10 + digit;
			    }
		    
			if (i == reversed) {
				System.out.println(i);
			}
		}
//		 
//
//		Write a program that prints the Fibonacci Sequence from 0 to 50. 
//			The following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
//		int num1 = 0, num2 = 1;
		int num1 = 0;
		int num2 = 1;

  
        while (num1 < 50) {
        	
            System.out.println(num1);

            int num3 = num2 + num1;
            
            num1 = num2;
            num2 = num3;

        }
//
//		Write a program that nests a for-loop inside another. 
//			Print out the inner and outer variable (e.g., i or j) in the inner 
//			loop (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);).

	}

}
