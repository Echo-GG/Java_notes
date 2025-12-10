class A{
	private double x;
	public void setX(double x){
		this.x = x;
	}
	public double getX(){
		return x;
	}
}

class B{
	private A a;
	B(A a){
		this.a = a;
	}

	public void setAx(double x){
		a.setX(x);
	}
}

public class MainClass{
	public static void main(String[] args){
		A a = new A();
		a.setX(1);
		System.out.println(a.getX());;

		B b = new B(a);
		b.setAx(2);
		System.out.println(a.getX());
	}
}