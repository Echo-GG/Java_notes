public class note5{
	public static void main(String[] args){
		Son son = new Son();
		son.changeMoney(5000);
		System.out.println("son.money: "+son.money);
		System.out.printf("son.add(a,b): %d\n",son.add(1,2));
	
		B b = new B();
		b.g();
		b.f();
		b.g();


		D d = new D();
		d.y = 200;
		d.g(); //调用子类新增的方法
		d.f(); //调用子类继承的方法

		//成员变量隐藏和方法重写
		F f_ = new F();
		System.out.println(f_.f(10,10));
		System.out.println(f_.f((byte)10,10));

		B_ b1 = new B_(10);
		b1.f();
		B_ b2 = new B_();
		b2.f();

		B__ b__ =  new B__();
		b__.m = 3;
		System.out.println(b__.g());
		System.out.println(b__.f());
		System.out.println(b__.g());
	}
}

class Father{
	int money = 1000;
	int add(int x,int y){
		return x+y;
	}
}

class Son extends Father{
	public void changeMoney(int x){
		money = x;
	}
}

class A{
	private int x = 10;
	protected int y = 20;
	void f(){
		y = y+x;
		System.out.println(y);
	}
}

class B extends A{
	void g(){
		y = y+1;
		System.out.println(y);
	}
}

class C{
	public double y = 11.456789;
	public void f(){
		y = y+1;
		System.out.printf("y (double), y=%f\n",y);
	}
}

class D extends C{
	int y = 0;
	public void g(){
		y = y+100;
		System.out.printf("y (int), y=%d\n",y);
	}
}

// note:成员变量的隐藏
// 子类可以隐藏继承的成员变量，当在子类中定义和父类中同名的成员变量时，子类就隐藏了继承的成员变量。
class E{
	public int f(int x,int y){
		return x+y;
	}
}

class F extends E{
	public int f(byte x,int y){
		return x*y;
	}
}

class A_{
	int x;
	A_(){
		x = 100;
	}
	A_(int x){
		this.x = x;
	}
}

class B_ extends A_{
	int z;
	B_(int x){
		super(x);
		z = 30;
	}
	B_(){
		super();//可以省略
		z = 300;
	}
	public void f(){
		System.out.printf("x=%d,z=%d\n",x,z);
	}
}

class A__{
	int m = 0;
	long f(){
		return m;
	}
}

class B__ extends A__{
	int m = 1;
	long f(){
		super.m = 10;
		return super.f()+m;
	}
	long g(){
		return super.f()/2;
	}
}