package com.fiedlercooper.softwareDeveloperClubProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SoftwareDevelopmentClub {

	private ArrayList<ClubMember> memberList = new ArrayList<ClubMember>();

	public SoftwareDevelopmentClub() {

	}

	public void sDCRead() {

		Scanner input = null;

		try {
			input = new Scanner(new File("members.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String a = input.nextLine();
		while (input.hasNext()) {
			String newLine = input.nextLine();
			String[] newerLine = newLine.split("\\*");
			ClubMember newMember = new ClubMember(newerLine[0], newerLine[2], newerLine[4], newerLine[6]);
			memberList.add(newMember);

		}
		input.close();

	}

	public void addMember() {
		Scanner newMember = new Scanner(System.in);
		System.out.println("\nWhat is the member name?");
		String name = newMember.nextLine();
		System.out.println("What is the member's city?");
		String city = newMember.nextLine();
		System.out.println("What is the member's state?");
		String state = newMember.nextLine();
		System.out.println("What is the member's favorite programming language?");
		String fPL = newMember.nextLine();

		ClubMember newestMember = new ClubMember(name, city, state, fPL);

		memberList.add(newestMember);

	}

	public void removeMember() {
		
		Scanner memberSearch = new Scanner(System.in);
		System.out.println("\nWhat is the member name?");
		String name = memberSearch.nextLine();

		boolean found = false;
		int index = 0;
		for (ClubMember c : memberList) {
			if (c.getName().equalsIgnoreCase(name)) {
				index = memberList.indexOf(c);
				found = true;
			}

		}

		if (found) {
			memberList.remove(index);
			System.out.println("Club Member " + name + " successfully deleted.");
		} else {
			System.out.println(name + " not found!");
		}


	}

	public void displayMembers() {
		for (ClubMember c : memberList) {
			System.out.println(c.toString());
		}
	}
	
	public void writeFile() {
		FileWriter writer;
		try {
			writer = new FileWriter("output.txt");
		
			writer.write("NAME**CITY**STATE**FAVORITE PROGRAMMING LANGUAGE" + System.lineSeparator());
		for(ClubMember c: memberList) {
		  writer.write(c.getName() + "**" + c.getCity() + "**" + c.getState() + "**" + c.getFavProLang() + System.lineSeparator());
		}
		writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
}
}
