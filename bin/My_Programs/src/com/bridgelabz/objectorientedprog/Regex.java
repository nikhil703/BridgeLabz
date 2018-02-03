package com.bridgelabz.objectorientedprog;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.utility.Utility;

/**
 * @purpose : This program is used for DeekofCards to initialize deck of cards having suit ("Clubs", 
 * 			  "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", 
 * 			  "Jack", "Queen", "King", "Ace"). 
 * @author  : Nikhil Vaidya.
 * @version : 1.0
 * @date    : 31/01/2017
 */
public class Regex {

	Utility utility = new Utility();
	String message="Hii <<Name>>, We have your full name as <<Full Name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
	private String firstName;
	private String lastName;
	private String mobileNumber="0";
	private String date;

	public static void main( String args[] ) {

		Regex regex =new Regex();

		regex.setFirstName();

		regex.setLastName();	

		regex.setMobileNumber();

		regex.setDate();

		String regixs=regex.RegexReplace();

		System.out.println(regixs);

	}
	public void setFirstName() 
	{
		System.out.println("Enter The First Name :");
		firstName= Utility.getString();
	}

	public void setLastName()
	{
		System.out.println("Enter The Last Name :");
		lastName = Utility.getString();
	}

	public void setMobNumber(){
		System.out.println("Enter The Mobile Number :");
		mobileNumber = Utility.getString();
	}

	public void setMobileNumber() {

		while(!isTenDigit(mobileNumber)){	
			System.out.println("Enter The Mobile Number :");
			mobileNumber = Utility.getString();
		}
	}

	public boolean isTenDigit(String number) {
		if((number.length())==10&&number.contains("[a-zA-Z]+") == false){
			return true;
		}
		else{
			return false;
		}


	}
	public void setDate() 
	{
		System.out.println("Enter The Date (dd/mm/yyyy) :");
		date=Utility.getString();
		Pattern pattern=Pattern.compile("^[0-3]?[0-9]/[0-3]?[0-9]/([0-9]{4})$");
		Matcher matcher=pattern.matcher(date);

		if(!matcher.matches())
		{	
			setDate();
		}	
	}

	public String RegexReplace()
	{
		String firstname="<<Name>>";
		String fullName="<<Full Name>>";
		String mobileno="xxxxxxxxxx" ;
		String Date="01/01/2016";

		Pattern pattern = Pattern.compile(firstname);
		Matcher matcher = pattern.matcher(message);
		message=matcher.replaceAll(firstName); 


		pattern=Pattern.compile(fullName);
		matcher = pattern.matcher(message);
		message=matcher.replaceAll(firstName+" "+lastName);


		pattern = Pattern.compile(mobileno);
		matcher =pattern.matcher(message);
		message=matcher.replaceAll(mobileNumber);	



		pattern =Pattern.compile(Date);
		matcher =pattern.matcher(message);
		message=matcher.replaceAll(date);
		return message;
	}
}