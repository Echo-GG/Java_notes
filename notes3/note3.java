import java.util.*;
public class note3{

	public static void main(String[] args){
		// Scanner reader = new Scanner (System.in);
		// System.out.println("输入待移位的int型整数:");
		// int x = reader.nextInt();
		// System.out.println("输入移位量:");
		// int n = reader.nextInt();
		// System.out.println("左移位的结果"+(x<<n));
		// System.out.println("右移位的结果:"+(x>>n));
		// ins and outs:
		// 输入待移位的int型整数:
		// -8
		// 输入移位量:
		// 1
		// 左移位的结果-16
		// 右移位的结果:-4

		// int a = 1;
		// int b = 2;
		// a = a ^ b;
		// b = a ^ b;
		// a = a ^ b;
		// System.out.println(a);
		// System.out.println(b);
		// 输出:
		// 2
		// 1

		// bitwise operators:
		// xor encryption and decryption:
		// char a[] = {'计','算','机','与','软','件','学','院'};
		// char secret = 'z';
		// for(int i=0;i<a.length;i++)
		// {
		// 	a[i] = (char)(a[i]^secret);
		// }
		// System.out.println("密文:\n");
		// for(int i=0;i<a.length;i++)
		// {
		// 	System.out.printf("%3c",a[i]);
		// }
		// for(int i=0;i<a.length;i++)
		// {
		// 	a[i] = (char)(a[i]^secret);
		// }
		// System.out.printf("\n原文:\n");
		// for(int i=0;i<a.length;i++)
		// {
		// 	System.out.printf("%3c",a[i]);	
		// }
		// note: a^b^b = a;
		// 	  a ^ 0 = a;
		// 	  a ^ 1 = ~a;
		// 	  a ^ a = 0;

		// instanceof 运算符:
		// 当左面的对象是右面的类创建的对象时，该运算的结果是true，否则是false
		// e.g. boolean f = rectangleOne instanceof Rect;//一个矩形是产自矩形类的,所以f的返回值应是true

		// Normal expression:(一般表达式)
		// int x = 1,y = -2,n = 10;
		// int z = x+y+(--n)*(x>y&&x>0?(x+1):y);
		// System.out.println(z);
		// 输出: 17

		// Scanner reader = new Scanner (System.in);
		// double a = 0,b = 0,c = 0;
		// System.out.print("输入边a:"); a = reader.nextDouble();
		// System.out.print("输入边b:"); b = reader.nextDouble();
		// System.out.print("输入边c:"); c = reader.nextDouble();
		// if(a+b>c && a+c>b && b+c>a)
		// {
		// 	if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b)
		// 	{
		// 		System.out.printf("%-8.3f%-8.3f%-8.3f构成是直角三角形",a,b,c);
		// 	}
		// 	else if(a*a<b*b+c*c && b*b<a*a+c*c && c*c<a*a+b*b)
		// 	{
		// 		System.out.printf("%-8.3f%-8.3f%-8.3f构成是锐角三角形",a,b,c);
		// 	}
		// 	else
		// 	{
		// 		System.out.printf("%-8.3f%-8.3f%-8.3f构成是钝角三角形",a,b,c);
		// 	}
		// }
		// else
		// {
		// 	System.out.printf("%f,%f,%f不能构成三角形",a,b,c);
		// }

		// Scanner reader = new Scanner (System.in);
		// System.out.println("输入一个月份:");
		// int n = reader.nextInt();
		// switch(n)
		// {
		// 	case 1:
		// 	case 2:
		// 	case 3:
		// 		System.out.printf("%d月属于第一季度",n);
		// 		break;
		// 	case 4:
		// 	case 5:
		// 	case 6:
		// 		System.out.printf("%d月属于第二季度",n);
		// 		break;
		// 	case 7:
		// 	case 8:
		// 	case 9:
		// 		System.out.printf("%d月属于第三季度",n);
		// 		break;
		// 	case 10:
		// 	case 11:
		// 	case 12:
		// 		System.out.printf("%d月属于第四季度",n);
		// 		break;
		// 	default:
		// 		System.out.printf("%d不代表月份",n);
		// }

		// int seasonCode = 2;
		// String seasonName = switch(seasonCode)
		// {
			// case 0->"Spring";
			// case 1->"Summer";
			// case 2->"Fall";
			// case 3->"Winter";
			// default -> "???"; //使用整数或String操作数的switch表达式必须有一个default,
			//因为不论操作数值是什么,这个表达式都必须生成一个值。
		// };
		// note:这种写法不适用于C/C++
		// System.out.println(seasonName);

		// double sum = 0, item = 1;
		// int i = 1;
		// while(i<=1000)
		// {
		// 	sum+=item;
		// 	i++;
		// 	item = item*(1.0/i);
		// }
		// sum++;
		// System.out.println("e="+sum);
		// sum = 0;
		// i = 1;
		// item = 1;
		// do
		// {
		// 	sum = sum + item;
		// 	i++;
		// 	item = item*(1.0/i);
		// }while(i<=1000);
		// sum++;
		// System.out.println("e="+sum);
		// note:分别用while和do-while循环计算常数e的近似值：e=1+1+1/2!+1/3!+… 
		// 输出:
			// e=2.7182818284590455
			// e=2.7182818284590455

		// int sum,i,j;
		// for(i = 1;i<=1000;i++)
		// {
		// 	for(j=1,sum=0;j<=i/2;j++)
		// 	{
		// 		if(i%j==0)
		// 		{
		// 			sum+=j;
		// 		}
		// 		if(sum==i)
		// 		{
		// 			System.out.printf("%8d是一个完数%n",i);
		// 		}
		// 	}
		// }

		// int [] a = {1,2,3};
		// for(int i:a)
		// {
		// 	System.out.println(i);
		// }
		// note:
		// for (variable : collection) statement
		// collection必须是一个数组或者是一个实现了Iterable接口的类对象
		// 输出:
			// 1
			// 2
			// 3

		// int sum = 0,i = 0,max = 8888, number = 7;
		// while(true)
		// {
		// 	i++;
		// 	sum+=i;
		// 	if(sum>=max)
		// 	{
		// 		break;
		// 	}
		// }
		// System.out.println("1+2+..n<"+max+"的最大整数n是:"+(i-1));
		// for(i = 1,max = 200,sum = 0;i<=max;i++)
		// {
		// 	if(i%number!=0)
		// 	{
		// 		continue;
		// 	}
		// 	sum = sum+i;
		// }
		// System.out.println(max+"内能被"+number+"整除的数字之和:"+sum);
		// 输出:
		// 1+2+..n<8888的最大整数n是:132
		// 200内能被7整除的数字之和:2842

		//折半法查找一个整数是否在一个排序的int类型数组中
		int n,start,end,middle;
		int a[] = {-2,1,4,5,8,12,17,23,45,56,90,100};
		start = 0;
		end = a.length;
		middle = (start+end)/2;
		int count = 0;
		Scanner reader = new Scanner (System.in);
		System.out.print("请输入一个整数:");
		n = reader.nextInt();
		while(n!=a[middle])
		{
			if(n>a[middle])
				start = middle;
			else if(n<a[middle])
				end = middle;
			
			middle = (start+end)/2;
			count++;
			if(count>a.length/2)
				break;
		}
		if(count>a.length/2)
			System.out.println(n+"不在数组中");
		else
			System.out.println(n+"是数组中的第"+middle+"个元素");
		System.out.println("查找了"+count+"次");
		// ins and outs:
		// 请输入一个整数:100
		// 100是数组中的第11个元素
		// 查找了3次
	}
}