package com.bridgelabz.dsprograms;

import com.bridgelabz.utility.Utility;


/**
 * @purpose: This program is used to display the calendar.
 * @author: Nikhil Vaidya
 * @version: 1.0
 * @since 10/01/2018
 */

public class Calendar {
	

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter month");
		int month = Utility.getInt();
		System.out.println("Enter year");
		int year = Utility.getInt();
		
		Utility.calender(year, month);
		

		

	}
}
