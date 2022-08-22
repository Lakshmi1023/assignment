package com.te.sumElements;

public class UserMainCode {
	public static int sumElements(int a[]) {
		int sum=0;
		int result=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				a[j]=0;
				
			}
			for (int i1 = 0; i1 < a.length; i1++) {
				if(a[i1]%2==0&&a[i1]!=0)
					sum=sum+a[i1];
				
			}
			if(sum==0)
				result=-1;
			else
				result=sum;
			
		}return result;
	}
	}


