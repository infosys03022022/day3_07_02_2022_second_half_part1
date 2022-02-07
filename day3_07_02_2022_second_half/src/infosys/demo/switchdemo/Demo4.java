package infosys.demo.switchdemo;

import java.util.Scanner;
// byte,short,int,char 
// String
// It wont work for long,float or double
public class Demo4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String choice;
		System.out.println("Enter your choice");
		choice=scanner.next();
		/*
		 * if(choice==1) { System.out.println("One"); } else if(choice==2) {
		 * System.out.println("Two"); } else if(choice==3) {
		 * System.out.println("Three"); } else {
		 * System.out.println("The value should be either one two or three"); }
		 */
        switch(choice)
        {
        case "yes" : System.out.println("One");
                 break;
        case "no" : System.out.println("Two");
                 break;
        default : System.out.println("The value should be either Yes or No");         
        }
	}

}
