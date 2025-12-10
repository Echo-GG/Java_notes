// import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// notes:
// 模式匹配就是检索和指定模式匹配的字符串。Java提供了专门用来进行模式匹配的类，这些类在java.util.regex包中。

// (1).建立模式对象
// 进行模式匹配的第一步就是使用Pattern类创建一个对象，称作模式对象。Pattern类调用静态方法compile(String pattern)来完成这一任务，
// 其中的参数pattern是一个正则表达式，称作模式对象使用的模式。

// 例如，我们使用正则表达式“A\\d”建立一个模式对象p
// Pattern p = Pattern.compile("A\\d");(代表0到9中的任何一个)
// 如果参数pattern指定的正则表达式有错，compile方法将抛出异常PatternSyntaxException。

// Pattern类也可以调用静态方法compile(String regex, int flags)返回一个Pattern对象，参数flags可以取下列有效值
// Pattern.CASE_INSENSITIVE 
// 表示模式匹配时将忽略大小写

// (2) 建立匹配对象
// 模式对象p调用matcher(CharSequence input)方法返回一个Matcher对象m（称作匹配对象），
// 参数input可以是任何一个实现了CharSequence接口的类创建的对象，我们前面学习的String类和StringBuffer类都实现了CharSequence接口。

// 一个Matcher对象m可以使用下列3个方法寻找参数input指定的字符序列中是否有和pattern匹配的子序列（pattern是创建模式对象p时使用的正则表达式）
// public boolean find() ：在input中寻找和pattern匹配的下一子序列
// public boolean matches()：判断input是否完全和pattern匹配
// public boolean lookingAt()：判断input的开始位置是否有和pattern匹配的子序列

// 下列几个方法也是Matcher对象m常用的方法
// public boolean find(int start)：
// 判断input从参数start指定位置开始是否有和pattern匹配的子序列，参数start取0时，该方法和lookingAt()的功能相同。

// public String replaceAll(String replacement)：
// Matcher对象m调用该方法可以返回一个字符串对象，该字符串是通过把input中与pattern匹配的子字符串全部替换为参数replacement指定的字符串得到的
// （input本身没有发生变化）。

// public String replaceFirst(String replacement)：
// Matcher对象m调用该方法可以返回一个字符串对象，该字符串是通过把input中第一个与pattern匹配的子字符串替换为参数replacement指定的字符串得到的
// （input本身没有发生变化）。


public class note6_6{
	public static void main(String[] args){
		String text = "Hello Java\nGoodbye JaVa"; // 含有换行符的多行文本
		Pattern pattern  = Pattern.compile("Java",Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(text);

		while(matcher.find()){
			System.out.println("匹配到: "+matcher.group());
		}

		// 输出:
		// 匹配到: Java
		// 匹配到: JaVa

		Pattern p;
		Matcher m;
		String input = "0A1A2A3A4A5A6A7A8A9";
		p = Pattern.compile("\\dA\\d");
		m = p.matcher(input);

		while(m.find()){
			String str = m.group(); // 返回匹配的字符串
			System.out.print("From "+m.start()+" To "+m.end()+": ");
			System.out.println(str);
		}

		// 输出:
		// From 0 To 3: 0A1
		// From 4 To 7: 2A3
		// From 8 To 11: 4A5
		// From 12 To 15: 6A7
		// From 16 To 19: 8A9

		Pattern p_;
		Matcher m_;
		String input_ = "0A1A2A3A4A5A6A7A8A9";
		p_ = Pattern.compile("\\dA\\d");
		m_ = p_.matcher(input_);

		String temp_ = m_.replaceAll("***");
		System.out.println(temp_);
		System.out.println(input_);
		// 输出: 
		// ***A***A***A***A***
		// 0A1A2A3A4A5A6A7A8A9

		Pattern p__;
		Matcher m__;
		String input__ = "9A00A3";
		p__ = Pattern.compile("\\dA\\d");
		m__ = p__.matcher(input__);

		if(!m__.matches()){
			System.out.println("Not exact match");
		}
		if(m__.lookingAt()){
			String str = m__.group();
			System.out.println(str);
		}
		// 输出:
		// Not exact match
		// 9A0
		
	}
}