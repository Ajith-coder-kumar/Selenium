package org.localvariables;

import org.accessspecifier.AccessModifier;

public class LocalVariables extends AccessModifier {

	public void empId() {
		System.out.println("as");
		
	}
	
	
	public static void main(String[] args) {
		LocalVariables 		emp 	= 	  new 		LocalVariables();
		//class name     //objrep		//keyword    //class name
		
		emp.empId();
	/*	LocalVariables em = new AccessModifier();
		AccessModifier am1 = new LocalVariables();
		AccessModifier.customerId();
	}*/

}
}