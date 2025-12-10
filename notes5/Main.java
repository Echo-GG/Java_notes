
abstract class Geometry{
	public abstract double getArea();
}


class Circle extends Geometry{
	double r;
	Circle(double r){
		this.r = r;
	}
	public double getArea(){
		return 3.14*r*r;
	}
}

class Pillar{
	Geometry bottom;
	double height;
	Pillar(Geometry bottom,double height){
		this.bottom = bottom;
		this.height = height;
	}
	void changeBottom(Geometry bottom){
		this.bottom = bottom;
	}
	public double getVolume(){
		return bottom.getArea()*height;
	}
}

class Ladder extends Geometry{
	double a,b,h;
	Ladder(double a,double b,double h){
		this.a = a;
		this.b = b;
		this.h = h;
	}
	public double getArea(){
		return ((1/2.0)*(a+b)*h);
	}
}

public class Main{
	public static void main(String[] args){
		Pillar pillar;
		Geometry geometry;
		geometry = new Ladder (1,1,1);
		System.out.println("Ladder area: "+geometry.getArea());

		pillar = new Pillar(geometry,1);
		System.out.println("Pillar volume: "+pillar.getVolume());

		geometry = new Circle(1);
		System.out.println("Circle area: "+geometry.getArea());

		pillar.changeBottom(geometry);
		System.out.println("Pillar volume: "+pillar.getVolume());
	}
}