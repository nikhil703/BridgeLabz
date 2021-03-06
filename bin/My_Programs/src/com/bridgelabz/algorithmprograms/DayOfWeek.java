package com.bridgelabz.algorithmprograms;

import java.util.Scanner;
import com.bridgelabz.utility.Utility;

/**
 * @purpose: This program is used to calculate current day.
 * @author Nikhil Vaidya.
 * @version: 1.0
 * @date: 16/01/2018
 */
class DayOfWeek {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
		Utility utility = new Utility();
		System.out.println("Enter the date");
		int day= scanner.nextInt();
		System.out.println("Enter the month");
		int month=scanner.nextInt();
		System.out.println("Enter the year");
		int year=scanner.nextInt();
		utility.dayOfWeek(month, year, day);
		scanner.close();
	}
}