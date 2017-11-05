package com.numbers.assignment;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// create the instance of a new application
		App newApp = new App();
		// read the number to be converted
		int intNumber = newApp.readNumber();
		// Call the ConvertNumbersToWords function
		System.out.println(
				"Converted output of input integer " + intNumber + " to words - " + newApp.convertNumberApp(intNumber));
	}

	private int readNumber() {

		System.out.println("Enter a Number you want to covert to Words ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int strNumber = scanner.nextInt();
		return strNumber;
	}

	private String convertNumberApp(int intNumber) {
		ConvertNumbersToWords objNumbertoWords = new ConvertNumbersToWords();
		return objNumbertoWords.convert(intNumber);
	}
}
