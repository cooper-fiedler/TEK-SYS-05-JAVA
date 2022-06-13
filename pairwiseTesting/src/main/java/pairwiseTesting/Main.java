package pairwiseTesting;

import java.util.Arrays;

import io.github.pavelicii.allpairs4j.AllPairs;
import io.github.pavelicii.allpairs4j.Parameter;

public class Main {

	public static void main(String[] args) {
		AllPairs allPairs = new AllPairs.AllPairsBuilder()
		        .withParameters(Arrays.asList(
		                new Parameter("27.5", "29"),
		                new Parameter("Downhill", "Enduro", "All Mountain", "Cross Country"),
		                new Parameter("180mm", "160mm", "140mm", "120mm"),
		                new Parameter("Hard Tail", "Full Suspension"),
		                new Parameter("9 Speed", "10 Speed", "11 Speed", "12 Speed")))
		        .build();

		System.out.println(allPairs);

	}

}
