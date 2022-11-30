package com.mindtree.FSE;

import java.util.Scanner;

public class Exam {
	
	Questions q1 = new Questions("101", "1. Who invented Java Programming?",
			                      "1) Guido van Rossum","2) James Gosling","3) Dennis Ritchie",
			                       "4) Bjarne Stroustrup",		3);
	Questions q2 = new Questions("102", "2. Which component is used to compile, debug and execute the java programs?",
									"1) JRE", "2) JIT", "3) JDK", 	"4) JVM", 	3);
	Questions q3 = new Questions("103", "3. Which one of the following is not a Java feature?",
			                           "1) Object-oriented", "2) Use of pointers", 	"3) Portable",
			                       "4) Dynamic and Extensible", 	2);
	Questions q4 = new Questions("104", "4. Which of these cannot be used for a variable name in Java?",
			                       "1) identifier & keyword", 		"2) identifier",
			                       	"3) keyword", 			"4) none of the mentioned", 			3);
	Questions q5 = new Questions("105", "5. What is the extension of java code files?",
									"1) .js",	"2) .txt", 	"3) .class", 	"4) .java", 	4);
	Questions qs[] = {q1,q2,q3,q4,q5};
	
	public boolean showQuestion(int i,Scanner sc)
	{
		System.out.println(qs[i].getQuestion());
	
		System.out.println(qs[i].getOption1() + "             "+qs[i].getOption2());
		System.out.println(qs[i].getOption3() + "             "+qs[i].getOption4());
		int ans = sc.nextInt();
		if (ans == qs[i].getRightoption())
			return true;
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		
		Exam e = new Exam();
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Welcome to Exam Are you ready to Start the Exam ? (Y/N)");
		char start = sc.next().charAt(0);
		
		if(start=='Y' ||start=='y')
		{
			for(int i=0;i<e.qs.length;i++)
			{
				boolean rightopt =e.showQuestion(i,sc);
			
				if (rightopt)
				{
					System.out.println(" It is Right Answer..." );
					if(i==(e.qs.length-1))
						System.out.println(" Your Exam completed Successfully.");
					
				}
				else
				{ 
					boolean rightoption = false;
				while(!rightoption)
				{
					System.out.println(" it is a Wrong Answer");
					System.out.println(" do you want to try again? (Y/N)");
  				    char try1 = sc.next().charAt(0);
					if(try1 == 'y')
					{
						rightoption = e.showQuestion(i,sc);
					 if(rightoption)
						 System.out.println("It is Right Answer..");
					 
						
					}else
						rightoption= true;
				}
					
					
				}
				
			}
			
			
			
		}
		else
		{
			System.out.println("You are not ready to Start Exam ");
		}
		
	
	}

}
