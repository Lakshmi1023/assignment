package com.te.calculatemedian;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=scanner.nextInt();
		int a[]=new int[size];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=scanner.nextInt();
		}
		int given=UserMainCode.calculateMedian(a);
		System.out.println(given);
	}
	
}
