import java.util.*;
public class note7_10{
	public static void main(String[] args){
		// 创建一个 HashSet 存储学生对象
		HashSet<Student> students = new HashSet<Student>();

		// 添加学生
		students.add(new Student("Alice",20));
		students.add(new Student("Bob",22));
		students.add(new Student("Alice",20));
		
		// 判断是否包含某个学生
		System.out.println("\n是否包含 Alice,20? "+
			students.contains(new Student("Alice",20)));

		// 遍历输出
		System.out.println("学生集合内容: ");
		for(Student s: students){
			System.out.println(s);
		}

		// 遍历输出 Iterator
		System.out.println("学生集合内容(Iterator): ");
		Iterator<Student> it = students.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		System.out.println("集合大小: "+students.size());

	
	}
}

class Student{
	String name;
	int age;
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString(){
		return "Student(name='"+name+"', age="+age+")";
	}
	
	// 重写 equals() 和 hashCode() 方法

	// @Override
	// public boolean equals(Object o){
	// 	return o instanceof Student s && age == s.age && Objects.equals(name,s.name);
	// }


	// @Override
	// public int hashCode(){
	// 	return Objects.hash(name,age);
	// }


	// 使用默认的 equals() 和 hashCode() 方法的运行结果如下:

	// 是否包含 Alice,20? false
	// 学生集合内容:
	// Student(name='Alice', age=20)
	// Student(name='Bob', age=22)
	// Student(name='Alice', age=20)
	// 学生集合内容(Iterator):
	// Student(name='Alice', age=20)
	// Student(name='Bob', age=22)
	// Student(name='Alice', age=20)
	// 集合大小: 3


	// 重写 equals() 和 hashCode() 方法之后的运行结果如下:

	// 是否包含 Alice,20? true
	// 学生集合内容:
	// Student(name='Alice', age=20)
	// Student(name='Bob', age=22)
	// 学生集合内容(Iterator):
	// Student(name='Alice', age=20)
	// Student(name='Bob', age=22)
	// 集合大小: 2
}	