import java.util.regex.*;
public class note6_7{
	public static void main(String[] args){
		Pattern p;
		Matcher m;
		p = Pattern.compile("\\d+");
		m = p.matcher("2008年08月08日");
		while(m.find()){
			String str = m.group();
			System.out.print("From "+m.start()+" To "+m.end()+": ");
			System.out.println(str);
		}

		p = Pattern.compile("\\D+");
		m = p.matcher("2008年08月08日");
		while(m.find()){
			String str = m.group();
			System.out.print("From "+m.start()+" To "+m.end()+": ");
			System.out.println(str);
		}
		// 输出:
		// From 0 To 4: 2008
		// From 5 To 7: 08
		// From 8 To 10: 08
		// From 4 To 5: 年
		// From 7 To 8: 月
		// From 10 To 11: 日
	}
}
