package com.darshan.employeewagecomputation;

import java.util.Random;
public class EmployeeWageComputation {
		
		int attendance;
		int dailyWage=0;
		int employee_type;
		int total_wage = 0;
		int total_workig_hr = 0;
		int total_working_day = 1;
		int wage_per_hr;
		final int PART_TIME_HR = 4;
		final int FULL_TIME_HR = 8;
		int monthly_working_day;
		int working_hr_month;
		
		public EmployeeWageComputation(int wage_per_hr,int monthly_working_day,int working_hr_month)
		{
			this.wage_per_hr = wage_per_hr;
			this.monthly_working_day = monthly_working_day;
			this.working_hr_month = working_hr_month;
		}
		
		public void employeewagecal()
		{
		System.out.println("Welcome to Employee Wage Computation Program.");

		while(total_workig_hr <= working_hr_month && total_working_day <= monthly_working_day)
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
					dailyWage = wage_per_hr * PART_TIME_HR;
					total_workig_hr += PART_TIME_HR;
					break;
				case 1:
					System.out.println("Employee is Full Time");
				     dailyWage = wage_per_hr * FULL_TIME_HR;
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
			EmployeeWageComputation employeewagecomputation = new EmployeeWageComputation(20,18,50);
			employeewagecomputation.employeewagecal();
			
			EmployeeWageComputation employeewagecomputation2= new EmployeeWageComputation(20,10,50);
			employeewagecomputation2.employeewagecal();
		}
}
