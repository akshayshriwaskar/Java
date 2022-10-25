import java.util.Scanner;
public class condition_ifelse{
public static void main(String[] args){
int pwd;
System.out.print("Enter Password:=");
Scanner obj=new Scanner(System.in);
pwd=obj.nextInt();
if(pwd==2731)
{
System.out.print("Enter Password:=Akshay");
System.out.print("Enter Id:=1");
System.out.print("Enter Address:=Manchar");
}
else
	{
	System.out.print("Sorry! Wrong Password....!!!");
	}
}
}