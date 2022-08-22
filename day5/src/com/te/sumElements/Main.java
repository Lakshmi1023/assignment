package com.te.sumElements;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size");
		int size=scanner.nextInt();
		int a[]=new int [size];
		for (int i = 0; i < args.length; i++) {
			a[i]=scanner.nextInt();
		}
		int res=UserMainCode.sumElements(a);
		
	}
}
