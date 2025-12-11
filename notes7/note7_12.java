import java.util.*;
public class note7_12{
	public static void main(String[] args){
		
		Comparator<Student> stuComparator = new Comparator<Student>(){
			@Override
			public int compare(Student s1,Student s2){
				return s1.name.compareTo(s2.name);
			}
		};

		// 创建一个 TreeSet 存储学生对象

		TreeSet<Student> students = new TreeSet<Student>(stuComparator); // 有参构造

		// 添加学生
		students.add(new Student("Alice",20));
		students.add(new Student("Bob",22));
		students.add(new Student("David",21));

		// 遍历输出
		for(Student s: students){
			System.out.println(s);
		}


	}
}

class Student implements Comparable<Student>{
	String name;
	int age;

	// 构造方法
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student other){
		// return (this.age-other.age);
		return this.name.compareTo(other.name);
	}
	@Override 
	public String toString(){
		return "Student(name='"+name+"', age="+age+")";
	}
}

// notes:

// 泛型接口Set<E>
// 2个重要实现： HashSet<E>和TreeSet<E>
// 对象不重复（HashCode()不等；若相等看equals或==）
// TreeSet<E>
// 基于 TreeMap 实现
// 有序（按照元素的自然顺序或自定义比较器排序）
// 不允许重复元素
// 不允许 null 值（会抛出 NullPointerException）
// TreeSet<E>常用方法
// 增加、删除、查找 同HashSet
// 排序、范围方法
// public E first()：返回树集中的第一个对象（最小的对象）。
// public E last()：返回最后一个对象（最大的对象）。


// TreeSet<E>类的常用方法
// public boolean add(E o)：向树集添加对象，添加成功返回true，否则返回false。
// public void clear()：清空树集中的所有对象。
// public void contains(Object o)：如果包含对象o，方法返回true，否则返回false 。
// public E first()：返回树集中的第一个对象（最小的对象）。
// public E last()：返回最后一个对象（最大的对象）。
// public isEmpty()：判断是否是空树集，如果树集不含对象返回true 。
// public boolean remove(Object o)：删除树集中的对象o。
// public int size()：返回树集中对象的数目。

// 对象调用toString()方法就可以获得自己的字符串表示。

// 但很多对象不适合按照字符串排列大小。

// 我们在创建树集时可自己规定树集中的对象按着什么样的"大小"顺序排列。

// 树集中不容许出现大小相等的两个节点