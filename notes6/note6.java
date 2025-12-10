import java.lang.String;
public class note6{
	//Run|Debug
	public static void main(String[] args){
		String s1 = new String ("we are students");// 使用构造方法创建，s1 此时是一个对象而不是一个常量.
		String s2 = "we are students";// 字面量方式创建
		System.out.println(s1==s2);// false (对象与常量不等同)
		System.out.println(s1.equals(s2));// true

		String s3 = "we are students";// 与 s1 内容相同
		System.out.println(s2==s3);// true
		
		String s4 = s1.intern();// 将s1的内容放入字符串常量池(将s1对象中的内容放入常量池中再与常量s2作比较)
		System.out.println(s4==s2);// true

		System.out.println(s1.compareTo(s2)); // 0
		System.out.println(s2.compareTo(s2)); // 0

		char[] a = {'b','o','y'};
		String s = new String(a);
		char[] a_ = {'s','t','b','u','s','n'};
		String s_ = new String (a_,2,3);
		System.out.println(s);// 输出:boy
		System.out.println(s_);// 输出:bus

		String s1_ = " abc123\t\n";
		String s2_ = s1_.trim();
		System.out.println(s1_.length());// 输出:9
		System.out.println(s2_.length());// 输出:6
	}
}

// note:
// String类的常用方法

// public int length()
// 获取字符串的长度（char的个数）

// public boolean equals(String s)
// 比较当前字符串对象的实体是否与参数指定的字符串s的实体相同

// public int compareTo(String s)
// 按字典序与参数s指定的字符串比较大小。如果当前字符串与s相同，该方法返回值0；如果当前字符串对象大于s，该方法返回正值；如果小于s，该方法返回负值。

// public boolean startsWith(String s)
// 判断当前字符串对象的前缀是否是参数指定的字符串s

// public boolean endsWith(String s) 
// 判断当前字符串对象的后缀是否是参数指定的字符串s

// public int indexOf(String s)
// 从当前字符串的头开始检索字符串s，并返回首次出现s的位置。如果没有检索到字符串s，该方法返回的值是-1。

// public String substring(int startPoint)
// 获得一个当前字符串的子串，该子串是从当前字符串的startPoint处截取到最后所得到的字符串。

// public String replaceAll(String s1, String s2)
// 获得一个新的字符串对象，该字符串对象是通过用参数s2指定的字符串替换原字符串中由s1指定的所有字符串而得到的新的字符串。

// public String trim()
// 获得一个新的字符串对象，该字符串对象是去掉前后空格后的字符串。
