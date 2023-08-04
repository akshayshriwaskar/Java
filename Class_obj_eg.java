package myproject;

public class Class_obj_eg {
		//Person
		int age=21;
		int weight=56;
		String color="light";
	 
		void eat() {
			System.out.println("I'm Eating..");
		}

		void sleep() {
			System.out.println("I'm Eating..");
		}
public static void main(String[] args) {	 
	
	Class_obj_eg P=new Class_obj_eg();
	System.out.println(P.age);
	System.out.println(P.weight);
	System.out.println(P.color);
	P.eat();
	P.sleep();
	}
}
