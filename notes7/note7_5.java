
public class note7_5{
	public static void main(String[] args){
		// 常量
		System.out.println("PI = "+Math.PI);
		System.out.println("E = "+Math.E);

		// 取绝对值
		System.out.println("abs(-5) = "+Math.abs(-5));

		// 取最大最小值
		System.out.println("max(10, 20) = "+Math.max(10,20));
		System.out.println("min(10, 20) = "+Math.min(10,20));

		// 生成 0~1 的随机数
		System.out.println("random() = "+Math.random());

		// 乘方与平方根
		System.out.println("pow(2, 3) = "+Math.pow(2,3));
		System.out.println("sqrt(16) = "+Math.sqrt(16));

		// 三角函数
		System.out.println("sin(n/2) = "+Math.sin(Math.PI/2));

		// 向上、向下、四舍五入
		System.out.println("ceil(3,2) = "+Math.ceil(3.2)); // 输出: 4.0
		System.out.println("floor(3.8) = "+Math.floor(3.8)); // 输出: 3.0
		System.out.println("round(3.5) = "+Math.round(3.5)); // 输出: 4
	}
}