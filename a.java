//addition of two num
import java.util.Scanner;
public class A{
public static void main(String[] args){
int a,b,c;
System.out.print("Enter any Two numbers: ");
Scanner s= new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=a+b;
System.out.println("Sum of two numbers: "+c);
}
}