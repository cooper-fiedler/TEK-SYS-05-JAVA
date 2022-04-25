package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
	// EXCEPTIONS
	public static void main(String[] args) {
		// FileNotFoundException
		try {
			File myFile = new File("text.txt");
			FileReader fr = new FileReader(myFile);

		} catch (

		FileNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		}

//		int num[] = { 1, 2, 3, 4 };
//		System.out.println(num[7]);

	}

}
