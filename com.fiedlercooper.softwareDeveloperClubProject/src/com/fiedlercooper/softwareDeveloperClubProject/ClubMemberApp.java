package com.fiedlercooper.softwareDeveloperClubProject;

import java.util.Scanner;

public class ClubMemberApp {

	public static void main(String[] args) {
		SoftwareDevelopmentClub sdc = new SoftwareDevelopmentClub();

		Scanner choice = new Scanner(System.in);
		boolean running = true;

		sdc.sDCRead();

		while (running) {
			System.out.println("\nSelect from the following menu:\r\n" + "1: Display Members\r\n" + "2: Remove Member\r\n"
					+ "3: Add Member\r\n" + "4: Quit");
			int selection = choice.nextInt();

			switch (selection) {
			case 1 -> sdc.displayMembers();
			case 2 -> sdc.removeMember();
			case 3 -> sdc.addMember();
			case 4 -> running = false;
			}

		}
		choice.close();
		sdc.writeFile();
		System.out.println("Application Closed Successfully");
	}
}