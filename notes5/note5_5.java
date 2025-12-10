
interface Show{
	void show();
}

class A3 implements Show{
	public void show(){
		System.out.println("I Love This Game");
	}
}

class B3 implements Show{
	public void show(){
		System.out.println("I Love NBA");
	}
}


class C3{
	public void f(Show s){
		s.show();
	}
}

public class note5_5{
	public static void main(String[] args){
		C3 c = new C3();
		c.f(new A3());
		c.f(new B3());
	}
}
