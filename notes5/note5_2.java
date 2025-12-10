class A{
	double n;
	int m;
	void f(){
		System.out.printf("f(): n=%f,m=%d\n",n,m);
	}
	void g(){
		System.out.printf("n=%f,m=%d\n",n,m);
	}
}
class B extends A{
	int n = 12;
	void g(){
		System.out.printf("g(): n=%d,m=%d\n",n,m);
	}
	void h(){
		System.out.printf("h(): n=%d,m=%d\n",n,m);
	}
}

class Animal{
	void cry(){

	}
}

class Dog extends Animal{
	void cry(){
		System.out.println("Wang!...");
	}
}

class Cat extends Animal{
	void cry(){
		System.out.println("miao~~");
	}
}

public class note5_2{
	public static void main(String[] args){
		//upcasting(上转型)
		A a;
		a = new B();
		a.n = 0.618;
		a.m = 200;
		a.f();
		a.g();


		//downcasting(下转型)
		B b = (B)a;
		b.n = 555;
		b.h();

		Animal animal;
		animal = new Dog();
		animal.cry();
		animal = new Cat();
		animal.cry();
	}

}