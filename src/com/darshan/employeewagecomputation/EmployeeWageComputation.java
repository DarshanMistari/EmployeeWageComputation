package com.darshan.employeewagecomputation;

import java.util.Random;
public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		int attendance;
		int dailyWage;
		int employee_type;
		final int WAGE_PER_HR = 20;
		final int PART_TIME_HR = 4;
		final int FULL_TIME_HR = 8;
		
		System.out.println("Welcome to Employee Wage Computation Program.");
		
		Random random = new Random();
		attendance = random.nextInt(9)%2;
		
		System.out.println(attendance);
		if(attendance == 0)
		{
			System.out.println("Employee is Absent");
		}
		else
		{
			System.out.println("Employee is Present");
			employee_type= random.nextInt(9)%2;
			if(employee_type == 0)
			{
				System.out.println("Employee Part Time");
				dailyWage = WAGE_PER_HR * PART_TIME_HR;
			}
			else
			{
				System.out.println("Employee is Full Time");
			dailyWage = WAGE_PER_HR * FULL_TIME_HR;
			}
			System.out.println("Employee Wage :"+ dailyWage);
		}
	}

}
