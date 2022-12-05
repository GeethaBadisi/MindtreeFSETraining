package com.learning.assignment7;

import java.util.Scanner;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaluculateNumber caluculateNumber = new CaluculateNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = scanner.nextInt();
		boolean isOddresult;
		PerformOperation performOperation;
		//performOperation = caluculateNumber.isOdd();
		//isOddresult = caluculateNumber.validate(performOperation, number);
		//System.out.println("is Odd result:"+isOddresult);
		
		performOperation = caluculateNumber.isPrime();
		//isOddresult = caluculateNumber.validate(performOperation, number);
		System.out.println("is Prime result:"+caluculateNumber.validate(performOperation, number));
	}

}

