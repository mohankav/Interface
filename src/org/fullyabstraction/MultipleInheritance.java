package org.fullyabstraction;

public class  MultipleInheritance implements A ,B {

	@Override
	public void bikeName() {
		System.out.println("Bike Name is Plusar Rs 200");
	}

	@Override
	public void bikePrice() {
		System.out.println("Bike price is 150k");
	}

	@Override
	public void bikeModel() {
		System.out.println("bike Model is 2022");
	}

	@Override
	public void carPrice() {
		System.out.println("Car price is 5.75Lpa");
	}

	@Override
	public void carName() {
		System.out.println("Car name is Hyundau i10");
	}

	@Override
	public void carModel() {
		System.out.println("Car Model is 2020");
	}
	
	public static void main(String[] args) {
		
		MultipleInheritance m = new MultipleInheritance();
		
		m.bikeName();
		m.bikePrice();
		m.bikeModel();
		m.carName();
		m.carPrice();
		m.carModel();
	}
	

}
