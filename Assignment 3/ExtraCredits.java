package assignment3;

import java.util.Scanner;

public class ExtraCredits {

	public static void main(String[] args) {
		// Input a string:
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a sentence:");
		String inputString = in.nextLine();
		// Lower the case of input string:
		inputString = inputString.toLowerCase();
		// Drop the leading or trailing spaces:
		inputString = inputString.trim();
		// Drop the extra space:
		inputString = inputString.replaceAll(" {2,}", " ");
		// Split the string and put them into the assist array:
		String[] arrayHelper = inputString.split(" ");
		// Initialization of the output:
		String output = new String("");
		// Reverse the assist array:
		for (int i=0; i<(arrayHelper.length/2); i++) {
			String temp = arrayHelper[i];
			arrayHelper[i] = arrayHelper[arrayHelper.length-i-1];
			arrayHelper[arrayHelper.length-i-1] = temp;
		}
		// Link the output string:
		for (int i=0; i<arrayHelper.length; i++) {
			output = output + arrayHelper[i] + " ";
		}
		// Drop the final extra space:
		output = output.trim();
		// Output:
		System.out.println("The reverse of the input sentence is:");
		System.out.println(output);

	}

}
