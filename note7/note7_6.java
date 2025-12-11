import java.math.*;
public class note7_6{
	public static void main(String[] args){
		BigInteger n1 = new BigInteger("987654321987654321987654321");
		BigInteger n2 = new BigInteger("123456789123456789123456789");
		System.out.println("add: "+n1.add(n2));
		System.out.println("subtract: "+n1.subtract(n2));
		System.out.println("multiply: "+n1.multiply(n2));
		System.out.println("divide: "+n1.divide(n2));
		BigInteger m = new BigInteger("77889988");
		BigInteger COUNT = new BigInteger("0");
		BigInteger ONE =  new BigInteger("1");
		BigInteger TWO = new BigInteger("2");
		for(BigInteger i = TWO;i.compareTo(m)<0;i = i.add(ONE)){
			if((n1.remainder(i).compareTo(BigInteger.ZERO))==0){
				COUNT = COUNT.add(ONE);
			}
		}
		System.out.println(COUNT);
	}
}

// note:
// BigInteger类
// 程序有时需要处理大整数，java.math包中的BigInteger类提供任意精度的整数运算。
// 可以使用如下构造方法创建一个十进制的BigInteger对象
// public BigInteger(String val)

// 参数val中如果含有非数字字符就会发生NumberFormatException异常

// BigInteger类的常用方法
// public BigInteger add(BigInteger val)：返回当前大整数对象与参数指定的大整数对象的和
// public BigInteger subtract(BigInteger val)：返回当前大整数对象与参数指定的大整数对象的差
// public BigInteger multiply(BigInteger val)：返回当前大整数对象与参数指定的大整数对象的积
// public BigInteger divide(BigInteger val)：返回当前大整数对象与参数指定的大整数对象的商
// public BigInteger remainder(BigInteger val)：返回当前大整数对象与参数指定的大整数对象的余

// public int compareTo(BigInteger val)：返回当前大整数对象与参数指定的大整数的比较结果，
// 返回值是1、-1或0，分别表示当前大整数对象大于、小于或等于参数指定的大整数
// public BigInteger abs()：返回当前大整数对象的绝对值
// public BigInteger pow(int exponent)：返回当前大整数对象的exponent次幂
// public String toString()：返回当前大整数对象十进制的字符串表示
// public String toString(int p)：返回当前大整数对象p进制的字符串表示
