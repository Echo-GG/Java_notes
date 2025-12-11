import java.text.NumberFormat;
public class note7_7{
	public static void main(String[] args){
		double a = Math.sqrt(10);
		System.out.println("Before: "+a);

		NumberFormat f = NumberFormat.getInstance();
		f.setMaximumFractionDigits(5);
		f.setMinimumIntegerDigits(3);

		String s = f.format(a);
		System.out.println("After: "+s);

		// 输出:
		// Before: 3.1622776601683795
		// After: 003.16228

		System.out.println("Before: "+a);
		MyNumberFormat myFormat = new MyNumberFormat();
		System.out.println("After: "+myFormat.format(a,5));
	}
}

class MyNumberFormat{
	// 重写format方法
	public String format(double a,int n){
		String str = String.valueOf(a);
		int index = str.indexOf(".");

		String temp = str.substring(index+1);
		int fractionLeng = temp.length();
		n = Math.min(fractionLeng,n);
		str = str.substring(0,index+n+1);

	 	// 小数点后最多保留n位

		return str;
	}
}

// notes:
// NumberFormat常用方法：
// public void setMaximumFractionDigits(int newValue)
// public void setMinimumFractionDigits(int newValue)
// public void setMaximumIntegerDigits(int newValue)
// public void setMinimumIntegerDigits(int newValue) 

// 对象f可调用public final String format(double number)方法来格式化数字number。
