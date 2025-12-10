public class note5_8{
	public static void main(String[] args){
		int n = 0,m = 0,t = 0;
		try{
			t = 3;
			m = Integer.parseInt("2");
			n = Integer.parseInt("1s");// Exception
			System.out.println("我没有机会输出");
		}
		catch(Exception e){
			System.out.println("Exception");
			n = 1;
		}
		System.out.println("n="+n+",m="+m+",t="+t);


		A a = new A();
		try{
			a.f(28);
			a.f(-8);
		}
		catch(MyException e){
			System.out.println(e.getMessage());
		}
	}
}

class MyException extends Exception{
	String message;
	MyException(int n){
		message = n+": not a positive number";
	}
	public String getMessage(){
		return message;
	}
}

class A{
	public void f(int n) throws MyException{
		if(n<0){
			MyException ex = new MyException(n);
			throw(ex);
		}
		double number  = Math.sqrt(n);
		System.out.println("square root of "+n+": "+number);
	}

}

// note:自定义异常类:

// 我们也可以继承Exception类，定义自己的异常类，然后规定哪些方法产生这样的异常。

// 一个方法在声明时可以使用throws关键字声明抛出所要产生的若干个异常，并在该方法的方法体中具体给出产生异常的操作，即用相应的异常类创建对象，这将导致该方法结束执行并抛出所创建的异常对象。
