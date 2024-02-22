package com.darshan.employeewagecomputation;

import java.util.Random;
public class EmployeeWageComputation {
		
		int attendance;
		int dailyWage=0;
		int employee_type;
		int total_wage = 0;
		int total_workig_hr = 0;
		int total_working_day = 1;
		final int WAGE_PER_HR = 20;
		final int PART_TIME_HR = 4;
		final int FULL_TIME_HR = 8;
		final int MONTHLY_WORKING_DAY = 20;
		
		public void employeewagecal()
		{
		System.out.println("Welcome to Employee Wage Computation Program.");

		while(total_workig_hr <= 100 && total_working_day <= MONTHLY_WORKING_DAY)
		{
			Random random = new Random();
			attendance = random.nextInt(9)%2;
			
			System.out.println("Day :" + total_working_day);
			switch(attendance) {
			case 0:
				System.out.println("Employee is Absent");
				break;
			case 1:
				System.out.println("Employee is Present");
				employee_type= random.nextInt(9)%2;
				
				switch(employee_type)
				{
				case 0:
					System.out.println("Employee Part Time");
					dailyWage = WAGE_PER_HR * PART_TIME_HR;
					total_workig_hr += PART_TIME_HR;
					break;
				case 1:
					System.out.println("Employee is Full Time");
				     dailyWage = WAGE_PER_HR * FULL_TIME_HR;
					 total_workig_hr += FULL_TIME_HR;
				     break;
				}
				total_wage += dailyWage;
				System.out.println("Employee Wage :"+ dailyWage);
				break;
			}
			System.out.println("Total working Hr :"+total_workig_hr);
			System.out.println("----------------------");
			total_working_day++;
		}
		
		System.out.println("Total Monthly Wage :"+ total_wage);
	}
		public static void main(String[] args)
		{
			EmployeeWageComputation employeewagecomputation = new EmployeeWageComputation();
			
			employeewagecomputation.employeewagecal();
		}
}
