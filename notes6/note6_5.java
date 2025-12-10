import java.util.StringTokenizer;
import java.util.*;

public class note6_5{
	public static void main(String[] args){
		StringBuffer str = new StringBuffer("0123456789");
		str.setCharAt(0,'a');
		str.setCharAt(1,'b');
		System.out.println(str);

		str.insert(2,"**");
		System.out.println(str);

		str.delete(6,8); // 左闭右开,delete掉str[6](4),str[7](5);
		System.out.println(str);

		// 输出:
		// ab23456789
		// ab**23456789
	    // ab**236789

		String str_ = "Java is powerful and simple";

		// 创建字符串分析器,默认以空格为分隔符
		StringTokenizer st = new StringTokenizer(str_);
		System.out.println("单词总数: "+st.countTokens()); 

		// 用 while 循环逐个获取单词
		while(st.hasMoreTokens()){ // 如果还有未取出的单词
			String word = st.nextToken(); // 取出下一个单词
			System.out.println("获取到: "+word);
			System.out.println("剩余单词数: "+st.countTokens());
		}

		// 输出:
		// 单词总数: 5
		// 获取到: Java
		// 剩余单词数: 4
		// 获取到: is
		// 剩余单词数: 3
		// 获取到: powerful
		// 剩余单词数: 2
		// 获取到: and
		// 剩余单词数: 1
		// 获取到: simple
		// 剩余单词数: 0


		String[] mess = {"integer part","decimal part"};
		Scanner reader = new Scanner(System.in);
		double x = reader.nextDouble();
		String s__ = String.valueOf(x);
		StringTokenizer st_ = new StringTokenizer(s__,".");
		for(int i=0;st_.hasMoreTokens();i++){
			String str__ = st_.nextToken();
			System.out.println(mess[i]+":"+str__);
		}

		// ins and outs:
		// 99.9999
		// integer part:99
		// decimal part:9999

		String cost  = "TV cost 877 dollar, Computer cost 2398";
		Scanner scanner = new Scanner (cost);
		double sum = 0;
		while(scanner.hasNext()){
			try{
				double price = scanner.nextDouble();
				sum = sum + price;
				System.out.println(price);
			}
			catch(InputMismatchException exp){
				String t = scanner.next();
			}
			System.out.println("Sum: "+sum);
		}


		String cost_ ="市话费: 176.89元，长途费: 187.98元，网络费: 928.66元";
		Scanner scanner_ = new Scanner (cost_);
		scanner.useDelimiter("[^0123456789.]+");
		while(scanner_.hasNext()){
			try{
				double price = scanner_.nextDouble();
				System.out.println(price);
			}
			catch(InputMismatchException exp){
				String t = scanner_.next();
				System.out.println(t);
			}
		}

	}
}

// note: Comparison between StringBuffer and StringBuilder

// StringBuffer与StringBuilderd
// 二者的功能几乎完全相同

// StringBuffer是线程安全的，StringBuilder不是线程安全的
// 线程安全是指多个线程操作同一个对象不会出现问题，即允许采用多线程的方式添加或删除字符。

// 如果所有字符串编辑操作都在单个线程中执行（这种情况很普遍），建议优先采用StringBuilder，因为效率高（而线程同步需要时间开销）

// 如果需要多线程同步，则建议使用StringBuffer


// StringTokenizer:

// 当我们需要分析一个字符串并将字符串分解成可被独立使用的单词时，可以使用java.util包中的StringTokenizer类，该类有两个常用的构造方法：
// StringTokenizer(String s)：为字符串s构造一个分析器。使用默认的分隔符集合，
// 即空格符（多个空格被看做一个空格）、换行符’\n’、回车符’\r’、tab符’\t’、进纸符’\f’

// StringTokenizer(String s, String delim)：为字符串s构造一个分析器，参数delim中的字符被作为分隔符

// 我们把一个StringTokenizer对象称作一个字符串分析器，字符串分析器封装了语言符号和对其进行操作的方法。

// 字符串分析器可以使用nextToken()方法逐个获取字符串分析器中的语言符号（单词），
// 每当获取到一个语言符号，字符串分析器中的负责计数的变量的值就自动减一，该计数变量的初始值等于字符串中的单词数目，
// 字符串分析器调用countTokens()方法可以得到计数变量的值。

// 字符串分析器通常用while循环来逐个获取语言符号，为了控制循环，我们可以使用StringTokenizer类中的hasMoreTokens()方法，
// 只要计数的变量的值大于0，该方法就返回true，否则返回false。


// Scanner:
// Scanner类不仅可以创建出用于读取用户从键盘输入的数据的对象，而且还可以创建出用于解析字符串的对象。

// 1. 使用默认分隔标记解析字符串
// 以“空白”作为分隔符
// 2. 使用正则表达式作为分隔标记解析字符串
// Scanner对象可以调用useDelimiter()方法将一个正则表达式作为分隔标记，即和正则表达式匹配的字符串都是分隔标记。
