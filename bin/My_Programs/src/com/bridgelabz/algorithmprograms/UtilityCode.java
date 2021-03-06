package com.bridgelabz.algorithmprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;

/**
 * @purpose : This program is search and sort the array.
 * @author : Nikhil Vaidya
 * @version: 1.0
 * @date : 16/01/2018
 *
 */
public class UtilityCode {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {
		
	
		Utility utility = new Utility();
		int choice, j=0;
		long arr[] = new long[6]; 
		do
		{
		    System.out.println("Enter Your Choice.....");
            System.out.println("1. Binary Search for String");
            System.out.println("2. Binary Search for Integer");
            System.out.println("3. Insertion Sort for Integer");
            System.out.println("4. Insertion Sort for String");
            System.out.println("5. Bubble Sort for Interger");
            System.out.println("6. Bubble Sort for String");
            System.out.println("0: Exit");
        	
            choice = Utility.getInt();
            
            
            switch(choice)
            {
            case 1:
            	System.out.println("*****Binary Search for String******");
            	System.out.println();
            	System.out.println("Enter size of string array");
            	int size = Utility.getInt();
            	
            	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        		String [] words = new String[size];
        		System.out.print("Enter "+size+" words ");
        		for(int i=0; i<size; i++) 
        		{
        			words[i] = br.readLine();
        		}
        		long startTime = Utility.start();
            	utility.binarySearchForString(size, words);
            	long endTime = utility.stop();
            	arr[j++] = endTime - startTime;
            	
            case 2:
            	System.out.println();
            	System.out.println("**********Binary Search for Integer********");
            	System.out.println();
            	
            	 System.out.println("Enter number of elements:");
        	     int number = Utility.getInt();      
        	     int[] array = new int[number];

        	      System.out.println("Enter " + number + " integers");
        	     
        	      for (int i = 0; i < number; i++)
        	      {
        	          array[i] = Utility.getInt();
        	      }
        	      long startTime1 = Utility.start();
        	      
            	Utility.binarySearchInteger(number, array);
            	long stopTime1 = utility.stop();
            	arr[j++] = stopTime1 - startTime1;
            	
            case 3:
            	System.out.println("*****Insertion Sort For Integer******");
            	System.out.println();
        		System.out.println("Enter the size of array");
        		int size3 = Utility.getInt();
        		long startTime2 = utility.start();
        		int[] array3 = new int[size3];
        		System.out.println("Enter the"+size3+" element in array");

        		for(int i=0; i<size3; i++)
        		{

        			array3[i] = Utility.getInt();
        		}
        		
            	utility.insertionSort(array3);
            	long endTime2 =  utility.stop();
            	arr[j++] = endTime2 - startTime2; 
            	
            case 4:
            	System.out.println("******Insertion Sort For String******");
            	System.out.println();
        		System.out.println("Enter size of string array ");
        		
        		int size1 = Utility.getInt();
        		long startTime3 = utility.start();
        		String array1[] = new String[size1];

        		System.out.println("Enter "+size1+" character");

        		for(int i=0; i<size1; i++)
        		{
        			array1[i] = Utility.getString();
        		}
        		
        		Utility.insertionSort(array1);
            	arr[2] = utility.stop();
            	long endTime3 =  utility.stop();
            	arr[j++] = endTime3 - startTime3; 
            	
            case 5:
            	System.out.println("******Bubble Sort For Integer******");
            	System.out.println();
        		System.out.println(" Enter the size of array");
        		int size2 = Utility.getInt();
        		long startTime4 = utility.start();
        		int[] array2 = new int[size2];
        		System.out.println("Enter "+size2+" elements");

        		for(int i=0; i<size2; i++)
        		{
        			array2[i] = Utility.getInt();
        		}
        		
            	utility.bubbleSortForInt(size2,array2);
            	long endTime4 = utility.stop();
            	arr[j++] = endTime4 - startTime4;
            	break;
            	
            case 6:
            	System.out.println("*****Bubble sort for string******");
            	System.out.println();
        		System.out.println("Enter size of Array");
        		int size4 = Utility.getInt();
        		long startTime5 = utility.start();
        		String[] array4 = new String[size4];
        		
        		System.out.println("Enter "+size4+" words");
        		for(int i=0; i<size4; i++)
        		{
        			array4[i] = Utility.getString();
        		}
        		System.out.println("Before sort String");
        		for(String i : array4)
        		{	
        			System.out.print(i+" ");	
        		}
        		
            	utility.bubbleSort(array4);
            	long endTime5 = utility.stop();
            	arr[j++] = endTime5 - startTime5;
            	break;
            }
    		
		}while(choice!=0);
		System.out.println();
		System.out.println("Before sort Sort");
		
		for(long i : arr)
		{
			System.out.println(i);
		}
		System.out.println();
		System.out.println("After Sort");
		for(long i : arr)
		{
			System.out.println(i);
		}
		
		
		
		}
	
	}