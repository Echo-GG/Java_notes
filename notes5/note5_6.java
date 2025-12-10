interface Geometry2{
	public abstract double getArea();
}

class Circle2 implements Geometry2{
	double r;
	Circle2(double r){
		this.r = r;
	}
	public double getArea(){
		return 3.14*r*r;
	}
}

class Ladder2 implements Geometry2{
	double a,b,h;
	Ladder2(double a,double b,double h){
		this.a = a;
		this.b = b;
		this.h = h;
	}
	public double getArea(){
		return (1/2.0)*(a+b)*h;
	}
}

class Pillar2{
	Geometry2 bottom;
	double height;
	Pillar2(Geometry2 bottom,double height){
		this.bottom = bottom;
		this.height = height;
	}

	void changeBottom(Geometry2 bottom){
		this.bottom = bottom;
	}

	double getVolume(){
		return bottom.getArea()*height;
	}
}

public class note5_6{
	public static void main(String[] args){
		Pillar2 pillar;
		Geometry2 geometry;
		geometry = new Ladder2(1,1,1);
		System.out.println("Ladder area: "+geometry.getArea());

		pillar = new Pillar2 (geometry,1);
		System.out.println("Pillar volume: "+pillar.getVolume());

		geometry = new Circle2(1);
		System.out.println("Circle area: "+geometry.getArea());

		pillar.changeBottom(geometry);
		System.out.println("Pillar volume: "+pillar.getVolume());

	}
}