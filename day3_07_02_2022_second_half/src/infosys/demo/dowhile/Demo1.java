package infosys.demo.dowhile;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		  // reply is a string initialised with empty 
		  // string which ""
      Scanner scan=new Scanner(System.in);
		 String reply="yes";
		while(reply.equals("yes"))
		{
			System.out.println("Do you want to cont?");
			reply=scan.next();
			System.out.println("Let us continue!!!");
		}
		
		 System.out.println("Out of the loop");

	}

}
