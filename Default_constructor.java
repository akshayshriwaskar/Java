package myproject;

class C{
	int a; String b; boolean c;
	C()
	{
		a=100;b="akshay";c=false;
	}
	void disp()
	{
		System.out.print(a+" "+b+" "+c);
	}
}
class Default_constructor{
	public static void main(String[] args) {
		C ref=new C();
		ref.disp();
		
	}

}

