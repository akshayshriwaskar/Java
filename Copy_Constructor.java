package myproject;
class E{
	int a; String b; //instance var
	E(){
		a=10; b="Akshayshriwaskar";
		System.out.println(a+" "+b);
	}
	E(E ref){
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	}
}

class Copy_Constructor{
	public static void main(String args[]) {
 E obj=new E();
 E obj1=new E(obj);
	}
}
