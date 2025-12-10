abstract class Student{
	abstract void speak();
}

class Teacher{
	void look(Student stu){
		stu.speak();
	}
}


interface Show{
	public void show();
}

class A{
	void f(Show s){
		s.show();
	}
}


public class Anonymous_class{
	public static void main(String[] args){
		Teacher zhang = new Teacher();
		zhang.look(
			new Student(){
				void speak(){
					System.out.println("This is a method in an anonymous class.");
				}
			}
		);
		A a = new A();
		a.f(
			new Show(){
				public void show(){
					System.out.println("这是实现了接口的匿名类");
				}
			});
	}
}
// note:
// 匿名类可以继承类的方法也可以重写类的方法。

// 我们使用匿名类时，必然是在某个类中直接用匿名类创建对象，因此匿名类一定是内部类
// 匿名类可以访问外嵌类中的成员变量和方法
// 匿名类不可以声明静态成员变量和静态方法

// 匿名类的主要用途就是向方法的参数传值。


// 和接口有关的匿名类
// 假设Computable是一个接口，那么，Java允许直接用接口名和一个类体创建一个匿名对象，此类体被认为是实现了Computable接口的类去掉类声明后的类体，称作匿名类。

// 如果某个方法的参数是接口类型，那么我们可以使用接口名和类体组合创建一个匿名对象传递给方法的参数，类体必须要实现接口中的全部方法。
