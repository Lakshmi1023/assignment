package com.te.largeSpan;

public class UserMainCode {
public static int getLargestSpan(int a[]) {
	int first=0;
	int second=0;
	int length1=a.length;
	int length2=a.length;
	for (int i = 0; i < length1; i++) {
		for (int j = 0; j < length2; j++) {
			if(a[i]==a[j]) {
				first=i;
				second=j;
				length1=i;
			}
		}
	}
	int result=(second-first)+1;
	return result;
}
}
