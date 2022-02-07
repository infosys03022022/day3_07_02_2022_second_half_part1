package infosys.demo.switchdemo;

import java.util.Scanner;
// byte,short,int,char
// String
// It wont work for float or double
public class Demo2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int choice;
		System.out.println("Enter your choice");
		choice=scanner.nextInt();
		/*
		 * if(choice==1) { System.out.println("One"); } else if(choice==2) {
		 * System.out.println("Two"); } else if(choice==3) {
		 * System.out.println("Three"); } else {
		 * System.out.println("The value should be either one two or three"); }
		 */
        switch(choice)
        {
        case 1 : System.out.println("One");
                 break;
        case 2 : System.out.println("Two");
                 break;
        case 3 : System.out.println("Three");
                 break;
        default : System.out.println("The value should be either One Two or Three");         
        }
	}

}
