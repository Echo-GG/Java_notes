import java.util.*;
public class note7_15{
	public static void main(String[] args){
		// 1. 创建 TreeMap (Student 为键, Integer 为值)
		TreeMap<Student,Integer>map = new TreeMap<>();

		// 2. 添加学生和成绩
		map.put(new Student("Cindy",21),95);
		map.put(new Student("Alice",20),90);
		map.put(new Student("Bob",22),85);
		map.put(new Student("David",21),88);

		// 3. 遍历输出(按姓名排序)
		System.out.println("按姓名排序的学生成绩表: ");
		for(Map.Entry<Student,Integer>entry: map.entrySet()){
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}

		// 4. TreeMap 特有操作
		System.out.println("\n姓名排序最靠前的学生: "+map.firstKey());
		System.out.println("姓名排序最靠后的学生: "+map.lastKey());
	}
}


// note:
// TreeMap类实现了Map接口。TreeMap提供了按排序顺序存储"关键字/值"对的有效手段。

// 应该注意的是，不像散列映射（HashMap），树映射（TreeMap）保证它的元素按照关键字升序排列。
// 下面是TreeMap构造方法：
// TreeMap<K,V>()
// TreeMap<K,V>(Comparator<K> comp)

// 第一种形式构造的树映射，按关键字的大小顺序来排序树映射中的"键/值"对，
// 键的大小顺序是按其字符串表示的字典顺序。
// 第二种形式构造的树映射，键的大小顺序按comp接口规定的大小顺序来排序树映射中的"键/值"对。

// 常用方法与HashMap类似
