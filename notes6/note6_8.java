import java.util.regex.*;
public class note6_8{
	public static void main(String[] args){
		Pattern p;
		Matcher m;
		String s1 = "likeKFChateMDlike123jkjhate999like888";
		p = Pattern.compile("like\\w{3}|hate\\w{2}");
		m = p.matcher(s1);
		while(m.find()){
			String str = m.group();
			System.out.print("From "+m.start()+" To "+m.end()+": ");
			System.out.println(str);
		}
	}
}