package org.javatask;

public class Employee2 extends Company1 {
	
	public void employeeId2() {
		System.out.println("Employee id is: 20");
		
	}		
		public static void main(String[] args) {
			
			Employee2 employee2= new Employee2();
			employee2.employeeId2();		
			
		}
		@Override
		void companyId1() {
			System.out.println("Company Id 1 is : 1");
		}
		
	}
