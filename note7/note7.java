import java.util.Date;
import java.text.SimpleDateFormat;

public class note7{
	public static void main(String[] args){
		// 1. Date();
		Date currentTime = new Date();
		System.out.println("Current time: "+ currentTime);

		// 2. SimpleDateFormat(str)
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy--MM--dd");
		System.out.println("Current time: "+sdf1.format(currentTime));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy--MM--dd HH:mm:ss(a)(EE)");
		System.out.println("current time: "+sdf2.format(currentTime));

		// 3.Date(long)
		long time = -1000L;
		Date date = new Date(time);
		System.out.println(time+"ms: "+sdf2.format(date));
		time = 1000L;
		date = new Date(time);
		System.out.println(time+"ms: "+sdf2.format(date)); 
	}
}