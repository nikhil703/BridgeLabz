package com.bridgelabz.objectorientedprog;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

public class StockAccout {

	public static void main(String[] args) throws IOException, ParseException {
		
	
		Utility utility = new Utility();
		int choice;
		do {
			System.out.println("Enter 1.create user");
			System.out.println("Enter 2.Buy");
			System.out.println("Enter 3.Sell");
			System.out.println("Enter 4.display");
			System.out.println("Enter 5.Exit");
			choice = Utility.getInt();
			String name, symbol;
			int amount;
			switch (choice) {
			case 1:
				System.out.println("Create User");
				Utility.createUser();
				break;

			case 2:
				Utility.Buy();
				break;

			case 3:
				Utility.sell();
				break;

			case 4:
				Utility.display();
				break;
			case 5:
				System.exit(0);
				break;

			}
		} while (choice <= 4);

	}
	}
