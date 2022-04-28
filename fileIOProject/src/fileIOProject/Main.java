package fileIOProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
//		Java Files and Java IO: Slide 7, 53, 37, 30
//		Absolute Path
//		Relative Path

//		Byte Streams (8-Bit Bytes)
////		FileInputStream in = null;
////		FileOutputStream out = null;
//		FileReader in = null;
//		FileWriter out = null;
//		
//		
//		try {
////			in = new FileInputStream("input.txt");
////			out = new FileOutputStream("output.txt");
//			in = new FileReader("input.txt");
//			out = new FileWriter("output.txt");
//			
//			
//			int num;
//
//			while ((num = in.read()) != -1) {
//				out.write(num);
//			}
//		} finally {
//			if (in != null) {
//				in.close();
//			}
//			if (out != null) {
//				out.close();
//			}
//		}

//		Input Streams

//		InputStreamReader streamIn = null;
//		
//		try {
//			streamIn = new InputStreamReader(System.in);
//			System.out.println("Enter Q to quit");
//			
//			char Q;
//			do {
//			Q = (char) streamIn.read();
//			System.out.println(Q);
//			} while(Q!='Q');
//		}finally {
//			if(streamIn != null) {
//				streamIn.close();
//			}
//		}

//		Character Streams
//		Standard Streams
//		Reading and Writing to Files

//		String path = "newfile.csv";
//
//		try {
//			File file = new File(path);
//			Scanner input = new Scanner(file);
//			ArrayList<Course> data = new ArrayList<>();
//
//			while (input.hasNextLine()) {
//				String[] line = input.nextLine().split(",");
//				data.add(new Course(line[0],line[1],line[2]));
//			}
//			
//			for(Course c : data) {
//				System.out.format("%-15s | %-35s | %-25s\n",
//						c.getCode(), c.getName(), c.getInstructor());
//			}
//
////			String inputLine = input.nextLine();
//		} catch (FileNotFoundException e) {
//			System.out.println("No file here");
//			e.printStackTrace();
//
//		}
//
////		System.out.println(file.isDirectory());
////		
////		File [] FileWithPath = file.listFiles();

// 		Buffered Reader		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("What is your name? ");
			String name = reader.readLine();

			System.out.println("What is your job? ");
			String job = reader.readLine();

			System.out.format("Name: %s, Job:  %s", name, job);
			reader.close();

		} catch (IOException ioe) {
			System.out.println("IO in bufferedReader in main");
			ioe.printStackTrace();
		}
	}

}
