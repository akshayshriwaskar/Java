package myproject;

class D{
	int x,y; //instance var
	D(int a, int b) //Parameterized Constructor
	{
		x=a;y=b;
	}
	D(int a, String b) //Parameterized Constructor
	{
		System.out.println(a+" "+b);
	}
	void show()
	{
		System.out.println(x+" "+y);
	}
}

class Prameterized_Constructor{
	public static void main(String[] args)  {
  D obj1=new D(100,200);
  D obj2=new D(100,"akshay");
  obj1.show();
	}
}