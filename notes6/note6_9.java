import java.util.regex.*;
import java.util.Scanner;
public class note6_9{
	public static void main(String[] args){
		String str = "Please login :http://www.cctv.cn Watch TV";
		String regex = "(http://|www)[.]?\\w+[.]{1}\\w+[.]{1}\\p{Alpha}+";

		String newStr = str.replaceAll(regex,"");
		System.out.println(str);
		System.out.println(newStr);
		// \\p{Alpha}表示字母字符

		// 输出:
		// Please login :http://www.cctv.cn Watch TV
		// Please login : Watch TV

		Scanner reader = new Scanner(System.in);
		String str_ = reader.nextLine();
		// 空格字符、数字和符号(!"#$%&'()*+，-。/:;<=>?@[\]^_`{|}~)组成的正则表达式
		String regex_ = "[\\s\\d\\p{Punct}]+";
		// \\p{Punct}表示标点符号 !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
		String [] words = str_.split(regex_);
		for(int i=0;i<words.length;i++){
			int m = i+1;
			System.out.println("Word"+m+":"+words[i]);
		}
		// ins and outs:
		// hello java @szu
		// Word1:hello
		// Word2:java
		// Word3:szu
	}
}