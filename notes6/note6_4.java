import java.lang.String;
// notes:
// String类创建的字符串对象是不可修改的（不能修改、删除或替换字符串中的某个字符），即String对象一旦创建，那么实体是不可以再发生变化的。
// StringBuffer类：能创建可修改的字符串序列，也就是说，该类的对象的实体的内存空间可以自动改变大小，便于存放一个可变的字符串。

public class note6_4{
	public static void main(String[] args){
		
		StringBuffer str = new StringBuffer("Hello Java "); // 末尾的空格被忽略了
		System.out.println("length: "+str.length()+", capacity: "+str.capacity());
		// 输出: length: 10, capacity: 26

		str.append("Java"); // 在字符串末尾追加内容
		System.out.println("append 后: "+str);// append 后: Hello Java Java 

		char ch = str.charAt(1); // 获取指定位置的字符(下标从 0 开始)
		System.out.println("charAt(1): "+ch);// 输出:charAt(1): e

		str.setCharAt(0,'h'); // 修改指定位置的字符
		System.out.println("setCharAt 后: "+str); // 输出:setCharAt 后: hello Java Java 

		str.insert(5,","); // 在指定位置插入字符串
		System.out.println("insert 后: "+str); // 输出:insert 后:hello, Java Java 

		str.reverse(); // 将整个字符串的内容反转
		System.out.println("reverse 后: "+str); // 输出:reverse 后: avaJ avaJ ,olleh

		str.delete(0,5); // 删除从下标 0 到 4 的字符(左闭右开)
		System.out.println("delete 后: "+str); // 输出:delete 后: avaJ ,olleh 

		str.replace(0,2,"Hi"); // 将指定范围内的内容替换为新字符串
		System.out.println("replace 后: "+str); // replace 后: HiaJ ,olleh

	}
}

// StringBuffer类的构造方法
// StringBuffer()：分配给该对象的实体的初始容量（capacity）可以容纳16个字符，
// 当该对象的实体存放的字符序列的长度大于16时，实体的容量自动增加，以便存放所增加的字符。

// StringBuffer(int size)：指定分配给该对象的实体的初始容量为参数size指定的字符个数，
// 当该对象的实体存放的字符序列的长度大于size个字符时，实体的容量自动增加，以便存放所增加的字符。

// StringBuffer(String s)：指定分配给该对象的实体的初始容量为参数字符串s的长度额外再加16个字符。

// StringBuffer对象可以通过
// length()方法获取实体中存放的字符序列的长度（length）
// capacity()方法获取当前实体的实际容量（capacity）


// append方法：可以将其它Java类型数据转化为字符串后，再追加到StringBuffer对象中。

// char charAt(int index)：得到参数index指定的位置上的单个字符。当前对象实体中的字符串序列的第一个位置为0，
// 第二个位置为1，依次类推。index的值必须是非负的，并且小于当前对象实体中字符串序列的长度。

// void setCharAt(int index, char ch)：将当前StringBuffer对象实体中的字符串位置index处的字符用参数ch指定的字符替换。
// index的值必须是非负的，并且小于当前对象实体中字符串序列的长度。

// StringBuffer insert(int index, String str)：将一个字符串插入另一个字符串中，并返回当前对象的引用。

// public StringBuffer reverse()：将该对象实体中的字符串翻转，并返回当前对象的引用。

// StringBuffer delete(int startIndex, int endIndex)：从当前StringBuffer对象实体的字符串中删除一个子字符串，
// 并返回当前对象的引用。这里startIndex指定了需删除的第一个字符的下标，而endIndex指定了需删除的最后一个字符的前一个字符的下标。
// 因此要删除的子字符串从startIndex到endIndex-1。

// StringBuffer replace(int startIndex, int endIndex, String str)：将当前StringBuffer对象实体中的字符串的一个子字符串用参数str指定的字符串替换。
// 被替换的子字符串由下标startIndex和endIndex指定，即从startIndex到endIndex-1的字符串被替换。该方法返回当前StringBuffer对象的引用。

