import java.util.*;
public class note7_3{
	public static void main(String[] args){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());

		String day_of_week = String.valueOf(calendar.get(Calendar.DAY_OF_WEEK)-1);
		System.out.println(day_of_week);

		calendar.set(1931,8,18);
		long timeOne = calendar.getTimeInMillis();

		calendar.set(1945,7,15);
		long timeTwo = calendar.getTimeInMillis();

		long days = (timeTwo - timeOne)/(1000*60*60*24);
		System.out.println("1945年8月15日和1931年9月18日相隔: "+ days + "天");
	}
}

// note: 常用类似的时间差来计算一段代码的运行时间。