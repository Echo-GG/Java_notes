import java.util.*;
public class note7_4{
	public static void main(String[] args){
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(1931,8,1);
		
		int day_of_week = calendar.get(Calendar.DAY_OF_WEEK)-1;
		
		String a[] = new String [day_of_week+30];
		
		for(int i=0;i<day_of_week;i++){
			a[i] = "";
		}

		for(int i=day_of_week,n=1;i<day_of_week+30;i++){
			a[i] = String.valueOf(n);
			n++;
		}

		for(int i=0;i<a.length;i++){
			if(i%7==0&&i!=0)
				System.out.printf("\n");
			System.out.printf("%5s",a[i]);
		}

	}
}