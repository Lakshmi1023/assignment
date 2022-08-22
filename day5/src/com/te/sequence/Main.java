package com.te.sequence;

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
		boolean result=UserMainCode.searchSequence(a);
		if(result)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
