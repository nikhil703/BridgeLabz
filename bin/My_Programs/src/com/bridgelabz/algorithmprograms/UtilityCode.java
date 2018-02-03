package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class UtilityCode {

	public static void main(String[] args) {
		
	
		Utility utility = new Utility();
		int choice, j=0;
		long arr[] = new long[6]; 
		do
		{
		    System.out.println("Enter Your Choice.....");
            System.out.println("1. Binary Search for String");
            System.out.println("2. Insertion Sort for Integer");
            System.out.println("3. Insertion Sort for String");
            System.out.println("4. Bubble Sort for Interger");
            System.out.println("5. Bubble Sort for String");
            System.out.println("0: Exit");
        	
            choice = Utility.getInt();
            
            
            switch(choice)
            {
            case 1:
            	System.out.println("*****Binary Search for String******");
            	System.out.println();
        		System.out.println("Enter array size of array");
        		int size = Utility.getInt();
        		String array[] = new String[size];
        		System.out.println("Enter " + size + " character ");
        		for (int i = 0; i < size; i++) {

        			array[i] = Utility.getString();
        		}
        		int length = array.length;
        		System.out.println("Enter word to search");
        		String word = Utility.getString();
        		Utility.binarySearch(word, array, length);
        		
            	arr[j++] = utility.stop();
            	
            	
            case 2:
            	System.out.println("*****Insertion Sort For Integer******");
            	System.out.println();
        		System.out.println("Enter the size of array");
        		int size3 = Utility.getInt();
        		long startTime = utility.start();
        		int[] array3 = new int[size3];
        		System.out.println("Enter the"+size3+" element in array");

        		for(int i=0; i<size3; i++){

        			array3[i] = Utility.getInt();
        		}
        		
            	utility.insertionSort(array3);
            	long endTime =  utility.stop();
            	arr[j++] = endTime - startTime; 
            	
            case 3:
            	System.out.println("******Insertion Sort For String******");
            	System.out.println();
        		System.out.println("Enter size of string array ");
        		
        		int size1 = Utility.getInt();
        		long startTime1 = utility.start();
        		String array1[] = new String[size1];

        		System.out.println("Enter "+size1+" character");

        		for(int i=0; i<size1; i++)
        		{
        			array1[i] = Utility.getString();
        		}
        		
        		Utility.insertionSort(array1);
            	arr[2] = utility.stop();
            	long endTime1 =  utility.stop();
            	arr[j++] = endTime1 - startTime1; 
            	
            case 4:
            	System.out.println("******Bubble Sort For Integer******");
            	System.out.println();
        		System.out.println(" Enter the size of array");
        		int size2 = Utility.getInt();
        		long startTime2 = utility.start();
        		int[] array2 = new int[size2];
        		System.out.println("Enter "+size2+" elements");

        		for(int i=0; i<size2; i++)
        		{
        			array2[i] = Utility.getInt();
        		}
        		
            	utility.bubbleSortForInt(size2,array2);
            	long endTime2 = utility.stop();
            	arr[j++] = endTime2 - startTime2;
            	break;
            	
            case 5:
            	System.out.println("*****Bubble sort for string******");
            	System.out.println();
        		System.out.println("Enter size of Array");
        		int size4 = Utility.getInt();
        		long startTime3 = utility.start();
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
            	long endTime3 = utility.stop();
            	arr[j++] = endTime3 - startTime3;
            	break;
            }
    		
		}while(choice!=0);
		
		for(long i : arr){
			System.out.println("The array is: "+i);
		}
		
		
		
		}
	
	}