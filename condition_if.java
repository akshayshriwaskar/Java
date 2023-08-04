package myproject;
import java.util.Scanner;
public class condition_if {

	public static void main(String[] args) {
		int pwd;
		System.out.print("Enter Password:- "); 
		Scanner obj=new Scanner (System.in);//Runtime value given from user
		pwd=obj.nextInt();
		if(pwd==2731) {
			System.out.println("My Name:- Akshay");
			System.out.println("My Age:- 26");
			System.out.println("My Contact:- 123");
			System.out.println("My Address:- Pune");
		}
		else
		{
			System.out.print("Sorry! Wrong Password.");
		}

	}

}
