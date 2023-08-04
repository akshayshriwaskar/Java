package myproject;

class F{
	int a=10;
}
class SuperClass extends F{
	int a=20;
	void show()
	{
		System.out.println(a);
		System.out.println(super.a);
		
	}
}
	public static void main(String[] args) {
		SuperClass r=new SuperClass();
		r.show();
	}

}
