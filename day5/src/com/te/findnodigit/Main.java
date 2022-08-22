package com.te.findnodigit;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a number");
	double n=scanner.nextDouble();
	String str=UserMainCode.findNoDigits(n);
	System.out.println(str);
}
}
