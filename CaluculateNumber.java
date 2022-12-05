package com.learning.assignment7;

public class CaluculateNumber {
	
	public boolean validate(PerformOperation op,int num) {
		return op.check(num);
	}
	
	PerformOperation isOdd() {
		
		return (x)->((x%2)==0);
		
	}
PerformOperation isPrime() {
		
		return (int x) -> {
				if(x==0 || x==1) {
					return false;
	
				}else {
					for(int i=2;i <Math.sqrt(x);i++) {
					if(x % i ==0) {
						return true;
					}
				}
				return false;
			}
		};
		
	}



}	