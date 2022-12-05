package com.learning.assignment7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ArrayListDemoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Sivasankar", 10000));
		employees.add(new Employee(102, "SuryaPrakash", 30000));
		employees.add(new Employee(103, "Sagar", 40000));
		employees.add(new Employee(104, "Vamshi", 20000));
		employees.add(new Employee(105, "Geetha", 50000));
		employees.add(new Employee(106, "Vaani", 60000));

		// using for loop
		for (int i = 0; i < employees.size(); i++) {
			Employee emp = employees.get(i);
			System.out.println("Emp Id: " + emp.getEmpId() + " Emp Name: " + emp.getEmpName() + " Emp Salary : "
					+ emp.getSalary());
		}

		// using for loop- enhanced
		for (Employee employee : employees) {
			System.out.println("For loop-enhanced result");
			System.out.println("Emp Id: " + employee.getEmpId() + " Emp Name: " + employee.getEmpName()
					+ " Emp Salary : " + employee.getSalary());
		}

		// forEach Loop
		System.out.println("ForEach loop result");
		employees.forEach(emp -> System.out.println(
				"Emp Id: " + emp.getEmpId() + " Emp Name: " + emp.getEmpName() + " Emp Salary : " + emp.getSalary()));
		
		//Stream Api result
		System.out.println("StreamAPi result");
		employees.stream().forEach(emp -> System.out.println(
				"Emp Id: " + emp.getEmpId() + " Emp Name: " + emp.getEmpName() + " Emp Salary : " + emp.getSalary()));
		
		//Sorting the emp names
        Collections.sort(employees);
        System.out.println("Sorting result");
		employees.forEach(System.out::println);
		
		//Iteratore Result
		 System.out.println("Iterator result");
		Iterator<Employee> iterator =employees.iterator();
		while(iterator.hasNext()) {
			Employee emp = iterator.next();
			System.out.println(
					+ emp.getEmpId()+" " +  emp.getEmpName()+" " + emp.getSalary());
		}
		
		//Iteratore Result
		 System.out.println("Iterator result");
		ListIterator<Employee> listIterator =employees.listIterator();
		 System.out.println("ListIterator forwording result");
		while(listIterator.hasNext()) {
			Employee emp = listIterator.next();
			System.out.println(
					+ emp.getEmpId()+" " +  emp.getEmpName()+" " + emp.getSalary());
		}
		 System.out.println("ListIterator Riverse order result");
		while(listIterator.hasPrevious()) {
			Employee emp = listIterator.previous();
			System.out.println(
					+ emp.getEmpId()+" " +  emp.getEmpName()+" " + emp.getSalary());
		}
		
		//Stream Map method
		System.out.println("Upper case Names");
		employees.stream().map(emp -> emp.getEmpName().toUpperCase()).collect(Collectors.toList())
				.forEach(System.out::println );
		//Stream avarage Salary	
		
	 double avgSalary = employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
	 System.out.println("Average salary :"+avgSalary);
	 
	 //Stream sort method
	 System.out.println("Stream sort method");
	 employees.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
	}

}
