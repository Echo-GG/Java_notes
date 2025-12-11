import java.util.Calendar;

public class note7_2{
	public static void main(String[] args){
		// 1. 获取一个 Calendar 实例,默认是当前时间
		Calendar cal = Calendar.getInstance();
		long t1 = cal.getTimeInMillis();

		// 2. 取出get() 注意: 1 表示星期日, 2 表示星期一, 以此类推
		System.out.println("当前时间: "+cal.get(Calendar.YEAR)+"年"
			+(cal.get(Calendar.MONTH)+1)+"月"+cal.get(Calendar.DAY_OF_MONTH)+"日 "
			+("(本周第"+cal.get(Calendar.DAY_OF_WEEK)+"天) ")+ // 认为Sunday是一周的第一天
			cal.get(Calendar.HOUR_OF_DAY)+"时"
			+cal.get(Calendar.MINUTE)+"分"
			+cal.get(Calendar.SECOND)+"秒");
		long t2 = cal.getTimeInMillis();
		System.out.println("时间数差值: "+(t2-t1)+"ms");

		// 3. 使用 set() 设置一个指定的日期和时间
		cal.set(Calendar.YEAR,2025);
		cal.set(Calendar.MONTH,Calendar.DECEMBER); // 注意:月份从0开始,0代表一月
		cal.set(Calendar.DAY_OF_MONTH,25);
		cal.set(Calendar.HOUR_OF_DAY,10);
		cal.set(Calendar.MINUTE,30);
		cal.set(Calendar.SECOND,0);
		System.out.println("设置后的时间 "+cal.get(Calendar.YEAR)+"年"
			+ (cal.get(Calendar.MONTH)+1)+"月"+cal.get(Calendar.DAY_OF_MONTH)
			+ "日"+cal.get(Calendar.MINUTE)+"分"+cal.get(Calendar.SECOND)+"秒");

	}
}

