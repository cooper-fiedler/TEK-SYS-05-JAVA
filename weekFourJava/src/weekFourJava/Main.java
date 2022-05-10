package weekFourJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

////		LINKED LISTS
//
//		LinkedList<Integer> linkOne = new LinkedList<Integer>();
//		linkOne.add(1);
//		linkOne.add(2);
//		linkOne.add(3);
//		linkOne.add(0, 56);
//		linkOne.set(1, 25);
//		linkOne.indexOf(12);
//		linkOne.size();
////	    System.out.println(linkOne);
////	    linkOne.remove(linkOne.indexOf(25));
////	    System.out.println(linkOne);
//
////		MAPS
//
//		HashMap<Integer, String> cars = new HashMap<>();
//		cars.put(1, "Mustang");
//		cars.put(2, "Corvette");
//		cars.put(3, "Camerro");
//		System.out.println(cars.get(1));
//		System.out.println(cars.toString());
//		System.out.println((cars.containsValue("Camerro")));
//
//		HashSet<String> setHashList = new HashSet<String>();
//
//		setHashList.add("One");
//		setHashList.add("Two");
//		setHashList.add("Cooper");
//		setHashList.add("Fiedler");
//		setHashList.add("Two");
//
//		Iterator<String> itr = setHashList.iterator();
//
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//
//		}
		
		Scanner input = new Scanner(new File("sample.txt"));
		
    	
    	while (input.hasNext()) {
    		String line = input.nextLine();
    		String[] itemInfo = line.split("  ");
    		
    			System.out.println(itemInfo[0] + itemInfo[1] + itemInfo[2] + itemInfo[3]);
    		
    		
    	}

	}

}
