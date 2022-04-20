package weekThreeJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

//////////////////// Testing String Equality ////////////////////		

//		Scanner userInput = new Scanner(System.in);
//
//		int num = 12;
//		int otherNum = 12;
//		System.out.println("Is " + num + " Less than " + otherNum);
//		String answer = userInput.next();
//		String solution = "";
//
//		if (num < otherNum) {
//			solution = "Yes";
//
//		} else if (num == otherNum) {
//			solution = "No, They are equal";
//		}
//
//		else {
//			solution = "No";
//		}
//
//		if (answer.equals(solution)) {
//			System.out.println("Correct!");
//		}
//
//		else if ((answer.equals("No")) && (num == otherNum)) {
//			System.out.println("Correct");
//		}
//
//		else {
//			System.out.println("Incorrect");
//		}
//
//		userInput.close();

//////////////////// Testing Int Equality ////////////////////		

//		int option = 10;
//		int optionB = 10;
//
//		boolean exp = (option == optionB) ? true : false;
//		System.out.println(exp);

//////////////////// While and Do While Loops ////////////////////				

//		int count = 1;
//		while (count <= 20) {
//			System.out.println("Welcome #" + count);
//			count++;
//
//		}
//
//		count = 0;
//		do {
//			System.out.println(count);
//			count++;
//		} while (count < 5);

//////////////////// For Loops ////////////////////				

//		for (int count = 0; count < 10; count++) {
//			for (int j = 1; j <= 3; j++) {
//				System.out.println(count + " count");
//			}
//
//		}

//////////////////// Switch Cases ////////////////////		

		int day = 2;
		switch (day) {
		case 1 -> System.out.println("Monday");
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("Wednseday");
		case 4 -> System.out.println("Thursday");
		case 5 -> System.out.println("Friday");
		case 6 -> System.out.println("Saturday");
		case 7 -> System.out.println("Sunday");
		}

//////////////////// Arrays ////////////////////		

		//////// ONE OR OTHER

		List<Double> myIntList = new ArrayList<>();

//		double[] myIntList = new double[100];

		/////////////////////

		//////// ONE OR OTHER

		for (int i = 1; i <= 100; i++) {
			myIntList.add(Math.random());
		}

//		for (int i = 0; i < myIntList.length; i++) {
//			myIntList[i] = Math.random();
//		}		

		/////////////////////

		double sum = 0;
		for (double value : myIntList) {
			sum += value;
		}

		//////// ONE OR OTHER

		double arrayAverage = 0;
		arrayAverage = sum / myIntList.size();
		System.out.println(myIntList);

//		double arrayAverage = 0;
//		arrayAverage = sum / myIntList.length;
//		for (double element: myIntList) {
//		System.out.println(element);
//		}

		/////////////////////

		System.out.println(sum);
		System.out.println(arrayAverage);

		int count = 0;
		for (double value : myIntList) {
			if (value > arrayAverage) {
				count += 1;
			}
		}

		System.out.println(count);

		String[] myStr = new String[10];
		myStr[0] = "Hello ";
		myStr[1] = "Cooper";
		myStr[2] = "!";

		//////// ENHANCED FOR LOOP
		
		for (String element : myStr) {
			if (element != null) {
				System.out.print(element);
			}
			
		}

	}

}
