package infosys.demo.switchdemo;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int choice;
		System.out.println("Enter your choice");
		choice=scanner.nextInt();
		if(choice==1)
		{
			System.out.println("One");
		}
		else if(choice==2)
		{
			System.out.println("Two");
		}
		else if(choice==3)
		{
			System.out.println("Three");
		}
		else
		{
			System.out.println("The value should be either one two or three");
		}
		

	}

}
