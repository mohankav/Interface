package org.partialAbstraction;


public class B extends A{
	
	@Override
	public void employeeName() {
		System.out.println("Employee name is Kaaviyan");
	}

	@Override
	public void employeeId() {
		System.out.println("Employee Id is 1245");
	}
	
	
	// non abstract method 
	@Override
	public void employeeAddress(String Location) {
		super.employeeAddress(Location);
	}
	
	public static void main(String[] args) {
		
		
		B c = new B();
		
		c.employeeName();
		c.employeeId();
		c.employeeAddress("Tamil Nadu");
	}

}
