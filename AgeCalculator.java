package com.mindtree.FSE;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
/*
 * Age Calculator were calculate the user age 
 * for today
 */
	public static void main(String args[])
	
	{
		Scanner userIp= new Scanner(System.in);
		System.out.println("Welcome to LTI-Mindtre Age Calculator!\n");
		System.out.print("Enter your DOB as yyyy-MM-DD :");
		LocalDate enddate= LocalDate.parse(userIp.next());
		LocalDate startDate = LocalDate.now();
		System.out.println("Date  :"+enddate);
		 Period period = Period.between(startDate, enddate);
		 System.out.println("Your are  :"+period);
	}
	
	 
	
}
