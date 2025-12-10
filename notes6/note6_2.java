import java.lang.String;
public class note6_2{
	public static void main(String[] args){
		// 1. length()
		String s1 = "Hello Java";
		System.out.println("length(): "+s1.length());// 输出:10

		// 2. equals() 和 compareTo()
		String s2 = "Hello Java";
		String s3 = "Hi Java";

		System.out.println("equals(): "+s1.equals(s2));// true(内容相同)
		System.out.println("compareTo(): "+s1.compareTo(s3));// 负数 ("Hello Java"<"Hi Java")

		// 3. startsWith(),endsWith(),indexOf(),substring()
		System.out.println(s1.startsWith("Hello"));// true
		System.out.println(s1.endsWith("va"));// true
		System.out.println(s1.indexOf("llo"));// 输出: 2
		System.out.println(s1.substring(6,10));// 输出:"Java"

		// 4. replaceAll()
		String sentence = "I like Java and Java is powerful.";
		String replaced = sentence.replaceAll("Java","Python");
		System.out.println("replaceAll(): "+replaced);
		// 输出:I like Python and Python is powerful.
		
		// 5. trim()
		String messy = "  Hello World!  ";
		System.out.println("Before trim(): ["+messy+"]"); // 输出:Before trim(): [  Hello World!  ];
		System.out.println("After trim(): ["+messy.trim()+"]");// 输出:After trim(): [Hello World!];



		System.out.println(Double.parseDouble("99.99"));

		// 直接实现进制转换
		System.out.println(Integer.toBinaryString(64)); // or toString(64,2);
		System.out.println(Integer.toOctalString(64)); // or toString(64,8);
		System.out.println(Integer.toHexString(64)); // or toString(64,16);

	}
}

// note:
// 字符串与基本数据的相互转化
// java.lang包中的Integer类调用其静态方法
// public static int parseInt(String s)
// 可以将“数字”格式的字符串，如“12387”，转化为int型数据。

// 在Byte、Short、Long、Float和Double类中也有类似的静态方法：
// public static byte parseByte(String s)
// public static short parseShort(String s)
// public static long parseLong(String s)
// public static float parseFloat(String s)
// public static double parseDouble(String s)

// 所有的类都默认是java.lang包中Object类的子类或间接子类。Object类有一个public方法toString()，一个对象通过调用该方法可以获得该对象的字符串表示。
