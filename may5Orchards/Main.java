package com.may5Orchards;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {									//Main Method
	
public static void main(String[] args) {
	
		List<Employee> emp=new ArrayList<>();   //ArrayList
		
		Scanner sc=new Scanner(System.in);
		String name;
		int id;
		double salary; 
		
		for(int i=0;i<3;i++) {					//Taking Employee info from user
			
			System.out.println("Enter id :");
			id=sc.nextInt();
			
			System.out.println("Enter Name :");
			name=sc.next();
		
			System.out.println("Enter Salary :");
			salary=sc.nextDouble();
			
			emp.add(new Employee(id,name,salary));
		}
		
		System.out.println("Employee Details");   //Printing Employee Details
		for(Employee e:emp) {
			System.out.println("Employee ID: "+  e.getId()+"\tEmployee Name "+e.getName()+"\tEmployee Salary: "+e.getSalary());
			}
		
		System.out.println();
		
		System.out.println("Employee who's salary is above 40000"); 		//Printing Employee Details whose salary is more than 400000
		for(Employee e1:emp) {
				if(e1.getSalary()>40000) {
					System.out.println(e1.getName());
			}}
		
		System.out.println();
		
				System.out.println("update in salary Whose id is 101 :");    //Updating Salary of Employee Details whose ID is 101
	for(Employee e2:emp) {
				if(e2.getId()==101) {
//					salary=e2.getSalary()+10000;
					e2.setSalary(e2.getSalary()+10000);
					System.out.println(e2.getSalary());
			}
				}
		
	}
}
