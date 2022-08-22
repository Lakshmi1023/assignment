package com.te.addreverse;

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
	System.out.println("enter the number");
	int num=scanner.nextInt();
	int res=UserMainCode.addAndReverse(a, num);
	System.out.println(res);
	
	

	
}
}
