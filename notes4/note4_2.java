import java.util.*;

class Tom{
	int leg;
	Tom(int n){
		this.cry();
		leg = n;
		this.cry();
	}
	void cry(){
		System.out.println(leg+"Legs");
	}

}

class A{
	int x;
	void f(){
		this.x = 100;
	}

}

class B{
	void f(){
		this.g();
	}
	void g(){
		System.out.println("ok");
	}
}

// note: 静态方法（static method）中不可以使用this
// 因为静态方法可以通过类名直接调用，这时可能还没有创建任何对象。 

class Triangle{
	float sideA,sideB,sideC,lengthSum;
	void setSide(float sideA,float sideB,float sideC){
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
}

public class note4_2{
	public static void main(String[] args){
		Tom cat = new Tom(4);
		Date date = new Date();
		System.out.printf("Local time: \n%s",date);
	}
}