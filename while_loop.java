package myproject;
import java.util.Scanner;
public class while_loop {

	public static void main(String[] args) {
		int num;
		System.out.print("Enter any Number");
		Scanner s=new Scanner (System.in);
		num=s.nextInt();
		while(num>=0) {
			if(num%2==0){
				System.out.print("Even Number");
				break;
			}
			else
			{
				System.out.print("Odd Number");				
				break;
			}
		}
	}

}
