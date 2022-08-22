package com.te.sequence;

public class UserMainCode {
public static boolean searchSequence(int []a) {
	boolean res=false;
	for (int i = 0; i < a.length; i++) {
		if(a[i]==1) 
			if(a[i+1]==2)
				if(a[i+2]==3)
					res=true;
		
	}
	return res;
}

 

}
