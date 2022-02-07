package infosys.demo.switchdemo;

import java.util.Scanner;

public class Demo3If {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int marks;
		System.out.println("Enter studen't score");
		marks=scan.nextInt();
		if(marks>=70 && marks<=100) // with if we can specify range of values to compare which is not possible with switch
		 // switch works with fixed value and we cannot use a range of values for example
			// months in a year 1,2,3,4,5,6,7,8,9,10,11,12
			// Suppose we are creating a menu driven program where 
			 // 1) ADD NUMBERS 2) SUBTRACT 3) DIVISION 4) MULTIPLY
		{
			System.out.println("Excellant score");
		}
		else if(marks>=60 && marks<70)
		{
			System.out.println("Good score");
			
		}else 
		{
			System.out.println("Need to work hard");
		}
	}

}
