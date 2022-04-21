package coreJavaBasics;

import java.util.Arrays;
import java.util.Collections;

public class ArraysHomework {

	public static void main(String[] args) {
//		Write a program that creates an array of integers with a length of 3.
//		Assign the values 1, 2, and 3 to the indexes. Print out each array element.

		int array[] = {1, 2, 3};
		
		for(int value : array) {
			System.out.println(value);
		}
		
//		Write a program that returns the middle element in an array. 
//		Give the following values to the integer array: {13, 5, 7, 68, 2} 
//		and produce the following output: 7

		int array2[] = {13, 5, 7, 68, 2};
		
		System.out.println(array2[(int) Math.floor(array2.length/2)]);
				
//		Write a program that creates an array of String type and initializes it with the 
//		strings “red”, “green”, “blue” and “yellow”. Print out the array length. 
//		Make a copy using the clone( ) method. Use the Arrays.toString( ) method on the 
//		new array to verify that the original array was copied.

		String array3[] = {"Red", "Green", "Blue", "Yellow"};
		System.out.println(array3.length);
		
		String array4[] = array3.clone();
		System.out.println(Arrays.toString(array4));

//		Write a program that creates an integer array with 5 elements (i.e., numbers). 
//		The numbers can be any integers.  Print out the value at the first index and 
//		the last index using length - 1 as the index. Now try printing the value at 
//		index = length ( e.g., myArray[myArray.length ] ).  
//		Notice the type of exception which is produced. 
//		Now try to assign a value to the array index 5. 
//		You should get the same type of exception.
		
		int array5[] = {13, 5, 7, 68, 2};
		System.out.println(array5[0]);
		System.out.println(array5[array5.length-1]);
		
		// Length is 5 but last value in list is index = 4 so error will occur
				 

//		Write a program where you create an integer array with a length of 5. 
//		Loop through the array and assign the value of the loop control 
//		variable (e.g., i) to the corresponding index in the array.
		 
		int[] array6 = new int[5];
		for (int i = 0; i <=4; i++) {
			array6[i] = i;
		}
		
		System.out.println(Arrays.toString(array6));

//		Write a program where you create an integer array of 5 numbers. 
//		Loop through the array and assign the value of the loop control 
//		variable multiplied by 2 to the corresponding index in the array.
		 
		int[] array7 = new int[5];
		for (int i = 0; i <=4; i++) {
			array7[i] = i*2;
		}
		System.out.println(Arrays.toString(array7));
		
//		Write a program where you create an array of 5 elements. 
//		Loop through the array and print the value of each element, 
//		except for the middle (index 2) element.
		 
		int[] array8 = new int[5];
		for (int i = 0; i <=4; i++) {
			array8[i] = i;
			if (i != 2) {
			System.out.println(array8[i]);
			}
		}
		

//		Write a program that creates a String array of 5 elements and 
//		swaps the first element with the middle element without creating a new array.
		 
		int[] array9 = new int[5];
		for (int i = 0; i <=4; i++) {
			array9[i] = i;
		}
		int temp = array9[2];
		array9[2] = array9[0];
		array9[0] = temp;
		
		System.out.println(Arrays.toString(array9));

//		Write a program to sort the following int array in ascending 
//		order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order, 
//		print the smallest and the largest element of the array. The output 
//		will look like the following:
//		Array in ascending order: 0, 1, 2, 4, 9, 13
		
		Integer[] array10 = {4, 2, 9, 13, 1, 0};
		Arrays.sort(array10);
		System.out.println(Arrays.toString(array10));
		System.out.println(Collections.min(Arrays.asList(array10)));
		System.out.println(Collections.max(Arrays.asList(array10)));

//		The smallest number is 0

//		The biggest number is 13

		 

//		Create an array that includes an integer, 3 strings, and 1 double. Print the array.
		Object[] array11 = {1,2,3,"String",67.8};
		System.out.println(Arrays.toString(array11));
	}

}
