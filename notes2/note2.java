import java.math.BigDecimal;
import java.util.*;
public class note1
// public class LearnigJava
{
	public static void main(String[] args)
	{
		// long creditCardNumber = 234_4545_4519_3415L;
		// System.out.println(creditCardNumber);
		
		// System.out.println(Byte.SIZE);
		// System.out.println(Short.SIZE);
		// System.out.println(Character.SIZE);
		// System.out.println(Integer.SIZE);
		// System.out.println(Long.SIZE);
		// 输出:
		// 8
		// 16
		// 16
		// 32
		// 64

		// char c = 'α';
		// System.out.println("字母"+c+"在unicode表中的顺序位置:"+(int)c);
		// System.out.println("字母表: ");
		// for(int i=(int)c;i<c+25;i++)
		// {
		// 	System.out.println(" "+(char)i);
		// }

		// 精度损失
		// int a = 123456789;
		// float f = a;
		//a float value has 7 to 8 number of significant digits.(有效数字)
		// System.out.println(f);//1.2345679E8

		// float a = 2.0;
		// float b = 1.1;
		// System.out.println(a-b);
		//error:
		//从double转换到float可能会有损失
		
		// System.out.println(2.0-1.1);//0.8999999999999999
		// BigDecimal bd = new BigDecimal(1.1);
		// System.out.println(bd.toString());
		// 输出: 1.100000000000000088817841970012523233890533447265625
		// BigDecimal a = new BigDecimal("2.0");
		// BigDecimal b = new BigDecimal("1.1");
		// System.out.println(a.subtract(b));
		// 输出: 0.9

		// int x = (int)34.89;
		// System.out.println("x="+x);

		// byte a = 120;
		// short b = 130;
		// int c = 2200;
		// long d = 8000;
		// float f;
		// double g = 0.1234567812345678;
		// a = (byte)b;//b位运算取反加1
		// c = (int)d;
		// f = (float)g;
		// System.out.println("a="+a);
		// System.out.println("c="+c);
		// System.out.println("f="+f);
		// System.out.println("g="+g);
		// 输出:
		// a=-126
		// c=8000
		// f=0.12345678
		// g=0.1234567812345678

		// char c = 'A';
		// float f = 123.456789f;
		// double d = 123456.12345678;
		// long x = 5678;
		// System.out.printf("%c \n%10.3f\n%f,%12d\n%d",c,f,d,x,x=x+2);	
		// 输出:
		// 	A
	 	//     123.457
		// 	123456.123457,        5678
		// 	5680

		// Scanner reader = new Scanner (System.in);
		// double sum = 0;
		// int m = 0;
		// while(reader.hasNextDouble())
		// {
		// 	double x = reader.nextDouble();
		// 	m = m+1;
		// 	sum = sum+x;
			// sum += x;// 这种写法依然适用
		// }
		// System.out.printf("%d个数的和为%f\n",m,sum);
		// System.out.printf("%d个数的平均值是%f\n",m,sum/m);
		//ins and outs:
		// 1
		// 2
		// 3
		// 4
		// 5
		// end
		// 5个数的和为15.000000
		// 5个数的平均值是3.000000
		//notes: 用户在键盘依次输入若干个数字，每输入一个数字都需要按回车键确认，最后在键盘输入一个非数字字符结束整个输入操作过程。程序将计算出这些数的和及平均值。 

		// int arrayInt1 [] = new int[10];
		// int []arrayInt2 = new int[10];// preferred
		// int arrayInt3[][] = new int [10][10];
		// int [][]arrayInt4 = new int [10][10];// preferred

		// float [] arrayFloat = {21.3f,23.89f,2.0f,23f,778.98f};
		// System.out.println(arrayFloat[0]);
		// System.out.println(arrayFloat[1]);
		// System.out.println(arrayFloat[2]);
		// System.out.println(arrayFloat[3]);
		// System.out.println(arrayFloat[4]);

		// int [] a = {1,2,3};
		// int [] b = {10,11};
		// System.out.println("数组a的引用是:"+a);
		// System.out.println("数组b的引用是:"+b);
		// System.out.printf("b[0]=%-3db[1]=%-3d\n",b[0],b[1]);

		// b = a;
		// System.out.println("数组a的引用是:"+a);
		// System.out.println("数组b的引用是:"+b);
		// b[1] = 888;
		// b[2] = 999;
		// System.out.printf("a[0]=%-5da[1]=%-5da[2]=%-5d\n",a[0],a[1],a[2]);
		// System.out.printf("b[0]=%-5db[1]=%-5db[2]=%-5d\n",b[0],b[1],b[2]);

		// a = b;
		// System.out.println("数组a的引用是:"+a);
		// System.out.println("数组b的引用是:"+b);
		// a[1] = 888;
		// System.out.printf("a[0]=%-5da[1]=%-5d\n",a[0],a[1]);
		// System.out.printf("b[0]=%-5db[1]=%-5d\n",b[0],b[1]);
		// note:直接使用赋值运算符，将一个数组直接"="另一个数组时，内存空间会自动重新分配

		// arraycopy 方法
		// char [] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
		// char [] copyTo = new char[7];

		// System.arraycopy(copyFrom,2,copyTo,0,7);
		// System.out.println(new String (copyTo));
		// 输出: caffein
		// note: public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

	}
}

