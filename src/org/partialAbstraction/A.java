package org.partialAbstraction;

public abstract class A {
	
public  abstract void employeeName() ;
	
	public  abstract void employeeId() ;
	
	
	// non abstract method 
	public  void employeeAddress(String Location) {
		System.out.println("Employee address is "+Location);
	}

}
