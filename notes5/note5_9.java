// note:
// 泛型接口
// 可以使用“interface 名称<泛型列表>”声明一个接口，这样声明的接口称作泛型接口
// Java泛型的主要目的是可以建立具有类型安全的数据结构，如链表（LinkedList）、散列映射（HashMap）等数据结构。

interface Computer<E,F>{
	void makeChorus(E x,F y);
}

class Chorus<E,F> implements Computer<E,F>{
	public void makeChorus(E x,F y){
		x.toString();
		y.toString();
	}
}


// 不以接口的形式来实现：
// class Chorus<E,F>{
// 	void makeChorus(E person,F instrument){
// 		person.toString();
// 		instrument.toString();
// 	}
// }

class Singer{
	public String toString(){
		System.out.println("好一朵美丽的茉莉花");
		return "";
	}
}

class MusicalInstrument{
	public String toString(){
		System.out.println("|3 35 6116|5 56 5-|");
		return "";
	}
}

class Cone<E>{
	double height;
	E bottom;
	public Cone(E b){
		bottom = b;
	}
	public void computeVolume(){
		String s = bottom.toString();
		double area = Double.parseDouble(s);
		System.out.println("Volume: "+1.0/3.0*area*height);
	}
}

class Circle{
	double area,radius;
	Circle(double r){
		radius = r;
	}
	public String toString(){
		area = radius*radius*Math.PI;
		return "" + area;
	}
}

class Rectangle{
	double sideA,sideB,area;
	Rectangle(double a,double b){
		sideA = a;
		sideB = b;
	}
	public String toString(){
		area = sideA*sideB;
		return "" + area;
	}
}




public class note5_9{
	public static void main(String[] args){
		Chorus<Singer,MusicalInstrument> model =  new Chorus<Singer,MusicalInstrument>();
		Singer singer = new Singer();
		MusicalInstrument piano = new MusicalInstrument();
		model.makeChorus(singer,piano);
	
		Circle circle = new Circle(1);
		Cone<Circle> coneCircle = new Cone<Circle>(circle);
		coneCircle.height = 1;
		coneCircle.computeVolume();

		Rectangle rect = new Rectangle(1,1);
		Cone<Rectangle> coneRectangle = new Cone<Rectangle>(rect);
		coneRectangle.height = 1;
		coneRectangle.computeVolume();

	}
}


// note:
// Java中的泛型类和C++的类模板有很大的不同，在上述例子中，
// 泛型类中的泛型数据person和instrument只能调用Object类中的方法，因此Singer和MusicalInstrument两个类都重写了Object类的toString()方法。


// Generics(泛型类):
// Generics is the capability to parameterize types. 
// With it you can define a class or a method with generic types that can be replaced with concrete types by the compiler.
// The key benefit of generics is to enable errors to be detected at compile time rather than at runtime.
// A generic class or method permits you to specify allowable types of objects that the class or method can work with. 
// If you attempt to use the class or method with an incompatible object, the compiler can detect the error.
