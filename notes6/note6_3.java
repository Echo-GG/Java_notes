import java.lang.String;
import java.util.Date;
import java.util.Scanner;
public class note6_3{
	public static void main(String[] args){
		Date date = new Date();
		Student stu = new Student("Tom",89);
		TV tv = new TV("Samsung",8776);
		System.out.println(date.toString());
		System.out.println(stu.toString());
		System.out.println(tv.toString());

		// a simple xor encryption using .toCharArray();
		Scanner reader = new Scanner(System.in);
		String s = reader.nextLine();
		char[] a = s.toCharArray(); // 将字符串s中的各个字符存储在char[] a这一字符数组中.
		for(int i=0;i<a.length;i++){ // a.length = 10
			a[i] = (char)(a[i]^'w');
		}
		String secret = new String (a);
		System.out.println(secret);

		for(int i=0;i<a.length;i++){
			a[i] = (char)(a[i]^'w');
		}
		String code = new String(a);
		System.out.println(code);

		byte[] d = "ShenzhenUniversity".getBytes();
		System.out.println(d.length);
		String s__ = new String (d,8,10);
		System.out.println(s__);
	}
}

class TV{
	String name;
	double price;
	TV(String name,double price){
		this.name = name;
		this.price = price;
	}
}

class Student{
	String name;
	double score;
	Student(String name,double score){
		this.name = name;
		this.score = score;
	}

	//重写toString()方法
	public String toString(){
		return name +": "+ score;
	}
}


//notes:
// String类提供了将字符串存放到数组中的方法
// public void getChars(int start, int end, char[] c, int offset )  
// 字符串调用该方法将当前字符串中的一部分字符复制到参数c指定的数组中，将字符串中从位置start到end-1位置上的字符复制到数组c中，
// 并从数组c的offset处开始存放这些字符。需要注意的是，必须保证数组c能容纳要被复制的字符。

// public char[] toCharArray() 
// 字符串对象调用该方法可以初始化一个字符数组，该数组的长度与字符串的长度相等，并将字符串对象的全部字符复制到该数组中。

// 字符串与字节数组:
// String(byte[])：用指定的字节数组构造一个字符串对象。

// String(byte[], int offset, int length)：用指定的字节数组的一部分，即从数组起始位置offset开始取length个字节构造一个字符串对象。

// public byte[] getBytes()：使用平台默认的字符编码，将当前字符串转化为一个字节数组。
