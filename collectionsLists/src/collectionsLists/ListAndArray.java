package collectionsLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		
		int sum = 0;
		
		List<Integer> myNumberList;
		
		ArrayList<Integer> myNumberArrayList = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			myNumberArrayList.add(i);
		}
//		System.out.println(myNumberArrayList.indexOf(5));
//		System.out.println(myNumberArrayList.contains(8));
//		System.out.println(myNumberArrayList.contains(18));
//		
//		boolean success = myNumberArrayList.remove((Integer)8);
//		System.out.println(success);
		
		for (Integer i : myNumberArrayList) {
			sum += i;
			
		}
		System.out.println(sum);
		
		
		//Java Collection Classes Slide 22
		myNumberArrayList.sort((x,y) -> x.compareTo(y));
		
		List<Double> listOfDoubles = Arrays.asList(2.0,2.7,6.0,3.0);
		System.out.println(listOfDoubles.getClass().getName());

	}

}
