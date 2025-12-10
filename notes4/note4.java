class Circle{
	double radius;
	Circle(){

	}
	Circle(double r){
		radius = r;
	}
	double computeArea(){
		return 3.14*radius*radius;
	}
	void setRadius(double newRadius){
		radius = newRadius;
	}
	double getRadius(){
		return radius;
	}
	double getArea(){
		double area = 3.14*radius*radius;
		return area;
	}

}

class Cone{
	Circle bottom;
	double height;
	Cone(Circle c,double h){
		bottom = c;
		height = h;
	}
	double computeVolume(){
		double volume;
		volume = bottom.computeArea()*height/3.0;
		return volume;
	}
	void setBottomRadius(double r){
		bottom.setRadius(r);
	}
	double getBottomRadius(){
		return bottom.getRadius();
	}

}

class Vehicle{
	int speed;
	float weight,height;

	void changeSpeed(int newSpeed){
		speed = newSpeed;
	}

	float getWeight(){
	return weight;
}

	float getHeight(){
		return height;
	}

}

class Student{
	String name;
	int age;
	boolean isMale;
	public void introduce(){
		System.out.print("我是"+name+",性别:");
		if(isMale)
			System.out.print("男");
		else
			System.out.print("女");
		System.out.println(",今年"+age+"岁。");
	}
}

class Rect{
	double sideA,sideB;
	Rect(double a,double b){
		sideA = a;
		sideB = b;
	}
	double computeArea(){
		return sideA*sideB;
	}
	double computeGirth(){
		return (sideA+sideB)*2;
	}
}

class Ladder{
	double above,bottom,height;//实例变量
	Ladder(){

	}
	Ladder(double a,double b,double h){
		above = a;
		bottom = b;
		height = h;
	}
	public void setAbove(double a){
		above = a;
	}
	public void setBottom(double b){
		bottom = b;
	}
	public void setHeight(double h){
		height = h;
	}
	double computeArea(){
		return (above+bottom)*height/2.0;
	}
}

class A{
	float x;
	static int y;//静态变量
}

class Jerry{
	int leg;
	Jerry(int n){
		leg = n;
	}
	void setLeg(int n){
		leg = n;
	}
	int getLeg(){
		return leg;
	}
}

class Tom{
	final int MAX = 1000;
	final static int MIN = 20;
	void f(int x,double y){
		x = x+1;
		y = y+1;
		System.out.printf("f: %d,%3.2f\n",x,y);
	}
	void ff(Jerry jerry){
		jerry.setLeg(12);
		System.out.println("ff: "+jerry.getLeg());
	}
}

class B{
	float a,b;
	void sum(float x,float y){
		a = max(x,y);
		b = min(x,y);
		//实例方法
	}
	static float getMaxSqrt(float x,float y){
		float c;
		c = max(x,y)*max(x,y);
		return c;
		//静态方法
	}
	static float max(float x,float y){
		return x>y?x:y;
		//静态方法
	}
	float min (float x,float y){
		return x<y?x:y;
		//实例方法
	}
	// note:
	// 实例方法可以操作实例变量、静态变量
	// 静态方法只能操作静态变量，不能操作实例变量

	// 实例方法必须通过对象来调用
	// 静态方法可以通过类名调用，也可以通过对象来调用。
	// 注：通过类名调用静态方法是一个好的编程习惯。

	// 无论静态方法或实例方法，当被调用执行时，方法中的局部变量才被分配内存空间,
	// 方法调用完毕，相应的局部变量即刻释放所占的内存
}

class Computer{
	double x,y;
	static double max(double a,double b){
		return a>b?a:b;
	}
}


class People{
	double getArea(double x,int y){
		return x*y;
	}
	int getArea(int x,double y){
		return (int)(x*y);
	}
	double getArea(float x,float y,float z){
		return (x*x+y*y+z*z)*2.0;
	}
}
public class note4{
	public static void main(String[] args){
		Circle circle;
		circle = new Circle();
		circle.radius = 1;
		double area = circle.getArea();
		System.out.println(area);

		Student s = new Student();
		s.name = "Alice";
		s.age = 20;
		s.isMale = false;
		s.introduce();

		double area1 = 0,area2 = 0;
		Ladder ladderOne,ladderTwo;
		ladderOne = new Ladder();
		ladderTwo = new Ladder(10,88,20);
		ladderOne.setAbove(16);
		ladderOne.setBottom(26);
		ladderOne.setHeight(100);
		ladderTwo.setAbove(300);
		ladderTwo.setBottom(500);
		area1 = ladderOne.computeArea();
		area2 = ladderTwo.computeArea();
		System.out.println(area1);
		System.out.println(area2);

		// String[] s = new String[10];
		// System.out.println(s[0].length());
		// note:没有实体的对象称作空对象。空对象不能使用，即不能让一个空对象去调用方法产生行为。
		// 假如程序中使用了空对象，程序在运行时会出现异常，即NullPointerException。
		// 由于对象是动态地分配实体，所以Java编译器对空对象不做检查。因此，在编写程序时要避免使用空对象。 

		System.out.println(Tom.MIN);
		Tom cat = new Tom();
		System.out.println(cat.MAX);
		// note:
		// 在实际开发中,常量通常是不同对象间共享的静态变量,因此会同时用final和static来修饰(此时,则建议用类名来访问)

		double max = Computer.max(12,45);
		System.out.println(max);

		// note:
		// 当方法被调用时，如果方法有参数，参数必须要实例化，即参数变量必须有具体的值。

		// 在Java中，方法的所有参数都是“传值”的(pass by value),
		// 也就是说，方法中参数变量的值是调用者指定的值的拷贝。方法如果改变参数的值，不会影响向参数“传值”的变量的值。


		int x = 10;
		double y = 12.58;
		Tom cat_ = new Tom();
		cat_.f(x,y);
		System.out.printf("main: %d,%3.2f\n",x,y);

		Tom tom = new Tom();
		Jerry jerry = new Jerry(2);
		System.out.println("before: "+jerry.getLeg());
		tom.ff(jerry);
		System.out.println("after: "+jerry.getLeg());

		Circle circle_ = new Circle(1);
		Cone cone_ = new Cone(circle_,1);
		System.out.println("radius: "+cone_.getBottomRadius());
		System.out.println("volume: "+cone_.computeVolume());
		cone_.setBottomRadius(10);
		System.out.println("radius: "+cone_.getBottomRadius());
		System.out.println("volume: "+cone_.computeVolume());
	
		People zhang = new People();
		System.out.println("Area: "+zhang.getArea(10,8.0));
		System.out.println("Area: "+zhang.getArea(10.0,8));


		// note:
		// this是Java的一个关键字,
		// 可以出现在实例方法(instance method)和构造方法(constructor)中,但不可以出现在静态方法(static method)中;
		// this关键字可以出现在类的构造方法中，代表使用该构造方法所创建的对象。


	}
}

