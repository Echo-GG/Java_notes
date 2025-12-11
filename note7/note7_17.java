import java.util.*;
public class note7_17{
	public static void main(String[] args){
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(new Integer(1));
		stack.push(new Integer(1));
		int k = 1;
		while(k<=5){
			Integer F1 = stack.pop();
			int f1 = F1.intValue();
			Integer F2 = stack.pop();
			int f2 = F2.intValue();
			Integer temp = new Integer(f1+f2);
			System.out.println(temp.toString());
			stack.push(temp);
			stack.push(F2);
			k++;
		}
	}
}

// note:
// 常用方法：
// public E push(E item)：压栈
// public E pop()：弹栈
// public boolean empty()：判断栈是否还有数据
// public E peek()：获取栈顶端的数据，但不删除该数据
// public int search(Object data)：获取数据在栈中的位置，最顶端的位置是１，
// 向下依次增加，如果栈不含此数据，则返回-1

// 栈是很灵活的数据结构，使用栈可以节省内存的开销。
// 比如，递归是一种很消耗内存的算法，我们可以借助栈消除大部分递归，达到和递归算法同样的目的。
// 斐波那契整数序列（Fibonacci sequence）是我们熟悉的一个递归序列，
// 它的第n项是前两项的和，第一项和第二项都是１。


// Short conclusion for this part of Data Structure(DS):
// Queue
// Stack
// List
// ArrayList
// LinkedList
// Set
// HashSet
// LinkedHashSet 根据insertion order
// TreeSet 排序的Set
// Map
// HashMap
// LinkedHashMap 根据insertion order
// TreeMap 排序的Map
