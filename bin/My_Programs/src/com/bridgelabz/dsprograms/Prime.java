package com.bridgelabz.dsprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * @purpose: This program is used to generate prime number between 0-1000.
 * @author Nikhil Vaidya.
 * @version: 1.0
 * @date: 17/01/2018
 */

public class Prime {

	public static void main(String[] args) {

		String arr1[][] = new String[10][];
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int number  = scanner.nextInt();
		String [] strArray=utility.checkPrime(number);
		int first = 1;
		int temp = 100;
	//	arr1[] = 
		for(int i=0; i<10; i++){
			
			for(int j=first; j<temp; j++){
				
				arr1[i][j] = strArray[j]; 
				System.out.println(arr1[i][j]+"/t");
			}		
		}
		scanner.close();
	}
	

}
