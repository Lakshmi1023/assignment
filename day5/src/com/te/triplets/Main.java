package com.te.triplets;

import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size");
		int size=scanner.nextInt();
		int arr[]=new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
			
		}
		boolean res1=UserMainCode.checkTriplets(arr);
			if(res1)
					System.out.println("true");
		 		else
		 			System.out.println("false");
		
		
		
	}
}