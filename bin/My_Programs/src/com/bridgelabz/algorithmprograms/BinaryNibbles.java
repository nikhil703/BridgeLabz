package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

class BinaryNibbles {

	public static void main(String[] args) {

		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = scanner.nextInt();
		utility.binaryNibbles(number);
		scanner.close();
		
		

	}

}
