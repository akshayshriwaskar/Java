package myproject;
import java.util.Scanner;
public class nested_ifelse {
	public static void main(String[] args) {
		int num1,num2, num3;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		num1=obj.nextInt();
		num2=obj.nextInt();
		num3=obj.nextInt();

		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("Maximum Number: "+num1);
			}
			else
			{
				System.out.println("Maximum Number: "+num3);
			}
		}
		else {
			if(num2>num3) 
			{
					System.out.println("Maximum Number: "+num2);	
			}
			else
				{
					System.out.println("Maximum Number: "+num3);
				}
		}
}
}
