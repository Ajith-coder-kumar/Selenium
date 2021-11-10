package org.javatask;


public class Employee1 implements Customer1,Customer2,Customer3 {
	
	public void employeeId1() {
		System.out.println("Employee1 id is: 10");
		
	}

	public static void main(String[] args) {
		
		Employee1 employee1= new Employee1();
		employee1.employeeId1();		
		
	}

	@Override
	public void customerId3() {
		System.out.println("Customer Id 3 is: 3");
	}

	@Override
	public void customerId2() {
		System.out.println("Customer Id 2 is: 2");
	}

	@Override
	public void customerId1() {
		System.out.println("Customer Id 1 is: 1");
	}

}
