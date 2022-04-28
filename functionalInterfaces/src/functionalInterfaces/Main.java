package functionalInterfaces;

import java.util.StringJoiner;

public class Main {

	public static void main(String[] args) {
		// Functional Programming 1 slide 3 - 6
		
		// String Joiner
		
		StringJoiner joinNames = new StringJoiner(":", "[", "]");
		joinNames.add("Name1");
		joinNames.add("Name2");
		
		System.out.println(joinNames.toString());
	}

}
