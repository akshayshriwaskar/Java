package myproject;
class A{
 int a; String name; //instance var
/*
 A(){
	 a=0;name=null;
 	}
	*/
	void show()
	{
		System.out.print(a+" "+name);
	}
}
 class B{
	 public static void main(String[] args) {
	A ref=new A();
	 ref.show();
	 }
 }