package infosys.demo.scannerdemo;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		int employeeId;
		String firstName;
		String lastName;
		float basic;
		Scanner scan=new Scanner(System.in);
        System.out.println("Ente the id");
        employeeId=scan.nextInt();
        System.out.println("Enter the firstName");
        firstName=scan.next();
        System.out.println("Enter the lastName");
        lastName=scan.next();
        System.out.println("Enter the basic");
        basic=scan.nextFloat();
        System.out.println("Entered details are:");
        System.out.println("ID: "+employeeId);
        System.out.println("FIRSTNAME: "+firstName);
        System.out.println("LASTNAME: "+lastName);
        System.out.println("BASIC: "+basic);
	}

}
