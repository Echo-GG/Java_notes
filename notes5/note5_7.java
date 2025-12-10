class AA{
	int x = 10, y = 10;
	AA2 aa2;
	AA(){
		aa2 = new AA2();
	} 
	void f(){
		System.out.println("AA");
		aa2.speak();
	}

	class AA2{
		int z;
		void speak(){
			System.out.println("AA2");
		}
		void g(){
			z = x+y;
			System.out.println(z);
			f();
		}
	}
}

public class note5_7{
	public static void main(String[] args){
		AA aa = new AA();
		aa.f();
		aa.aa2.g();
	}
}
// 内部类

// note: 
// 类可以有两种重要成员：成员变量和方法
// 类还可以有一种成员：内部类

// Java支持在一个类中声明另一个类，这样的类称作内部类，而包含内部类的类称为内部类的外嵌类
// 外嵌类把内部类看作是自己的成员
// 外嵌类的成员变量在内部类中仍然有效，内部类中的方法可以调用外嵌类中的方法
// 外嵌类可以用内部类声明对象，作为外嵌类的成员
