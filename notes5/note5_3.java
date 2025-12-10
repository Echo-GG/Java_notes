interface Computable{
	final int MAX = 100;
	int f(int x);
	public abstract int g(int x,int y);
}

class A2 implements Computable{
	public int f(int x){
		return x*x;
	}
	public int g(int x,int y){
		return x+y;
	}
}

class B2 implements Computable{
	public int f(int x){
		return x*x*x;
	}
	public int g(int x,int y){
		return x*y;
	}
}

public class note5_3{
	public static void main(String[] args){
		A2 a = new A2();
		B2 b = new B2();
		System.out.println(a.MAX);
		System.out.println(a.f(5)+" "+a.g(1,2));
		System.out.println(b.MAX);
		System.out.println(b.f(5)+" "+b.g(1,2));
	}
}