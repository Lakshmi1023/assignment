package com.te.removetens;

public class UserMainCode {
public static int[] removeTens(int a[]) {
	for (int i = 0; i < a.length; i++) {
		if(a[i]==10) {
			a[i]=0;
		}
		for (int i1= 0; i1 < a.length; i1++) {
			if(a[i1]==0) {
				for(int j=i1;j<a.length;j++) {
					if(a[j]!=0) {
						a[i1]=a[j];
						a[j]=0;
						i1++;
					}
				}
			}
		}
	}
	return a;
}
}
