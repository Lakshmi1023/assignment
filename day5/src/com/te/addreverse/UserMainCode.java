package com.te.addreverse;

public class UserMainCode {
public static int addAndReverse (int a[],int num) {
	int sum=0;
	int last=0;
	int rev=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]>num) {
			sum=sum+a[i];
		}
		while(sum>0) {
			last=sum%10;
			rev=rev*10+last;
			sum=sum/10;
		}
		
	}
	return rev;
}
}
