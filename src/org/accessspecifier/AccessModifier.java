package org.accessspecifier;

public class AccessModifier {
	
	public void customerId() {
		
		System.out.println("customer id is 1");
	}

	private void customerName() {
		
		System.out.println("customer name is raj");
	}
	
	public static void main(String[] args) {
		
		AccessModifier am = new AccessModifier();
		am.customerId();
		am.customerName();
	}

}
