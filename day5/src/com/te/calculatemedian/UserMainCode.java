package com.te.calculatemedian;

import java.util.Arrays;

public class UserMainCode {
public static int calculateMedian(int arr[]) {
	Arrays.sort(arr);
	int median=0;
	int res=0;
    double num=0.0;
	int length=arr.length-1;
	if(length%2==0) {
		median=arr[length/2];
		res=median;
	}
	else {
		double d1=(double)arr[length/2];
		double d2=(double)arr[(length/2)+1];
		median=(int)(0.1+Math.round((d1+d2)/2));
		res=median;
	}
	return res;
}
}












