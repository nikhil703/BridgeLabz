package com.bridgelabz.functionalProgram;

import java.util.Scanner;

public class PrimeFactor {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = in.nextInt();
		int i =2;
		while(num > 1){
			if(num % i== 0){
			
			System.out.println(+i+" ");
		}else{
		i++;
	}
		
		}

		}

}