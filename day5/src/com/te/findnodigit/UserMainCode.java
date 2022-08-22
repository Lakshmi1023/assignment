package com.te.findnodigit;

public class UserMainCode {
public static String findNoDigits(double num) {
	String str=Double.toString(num);
	int n=str.indexOf(".");
	String str1=str.substring(0,n);
	String str2=str.substring(n+1);
	int mod=Integer.parseInt(str2);
	
	for (int i = 0; i < str2.length(); i++) {
		int rem=mod%10;
		
		if(rem==0) 
			mod=mod/10;
		str2=Integer.toString(mod);
	}
	int length1=str1.length();
	int length2=str2.length();
	
	String res1=Integer.toString(length1);
	String res2=":";
	String res3=Integer.toString(length2);
	String result=res1+res2+res3;
	return result;
}
}
