package myproject;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		int a,b,c,ch;
		System.out.print("Enter any Two Numbers:- ");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.print("Choose your choice:-\n \n1.Add\n2.Sub\n3.Multi\n4.Divi\n5.Modulus");
		ch=s.nextInt();
		
		switch(ch)
		{
		case 1: c=a+b;
			System.out.print("\nAddition of Two Numbers:- "+c);
			break;
		
		
		case 2: c=a-b;
			System.out.print("\nSubstraction of Two Numbers:- "+c);
			break;
		
		
		case 3: c=a*b;
			System.out.print("\nMultiplication of Two Numbers:- "+c);
			break;
		
		
		case 4: c=a/b;
			System.out.print("\nDivision of Two Numbers:- "+c);
			break;
		
		
		case 5: c=a%b;
			System.out.print("\nAddition of Two Numbers:- "+c);
			break;
		
		default:

			System.out.print("\nInvalid Choice ....");
		}
	}

}
