import java.util.Date;
import java.text.SimpleDateFormat;
public class note7_1{
	public static void main(String[] args){
		Date currentTime = new Date();
		System.out.println("Current time: "+currentTime);

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy--MM--dd ");
		System.out.println("Current time: "+sdf1.format(currentTime));

		SimpleDateFormat sdf2 = new SimpleDateFormat("yy--MM--dd HH:mm:ss(a)(EE)");
		System.out.println("Current time: "+sdf2.format(currentTime));

		long time = -1000L;
		Date date = new Date(time);
		System.out.println(time+"ms: "+sdf2.format(date));

		time = 1000L;
		date = new Date(time);
		System.out.println(time+"ms: "+sdf2.format(date));
	} 
}

// note:
// y, yy：2位数字年份，如14
// yyyy：4位数字年份，如2014
// M, MM：2位数字月份，如08
// MMM：汉字月份，如八月
// d, dd：2位数字日期，如09, 22
// a：上午或下午
// H, HH：2位数字小时（00-23）
// h, hh：2位数字小时（am/pm，01-12）
// m, mm：2位数字分
// s, ss：2位数字秒
// E, EE：星期 
