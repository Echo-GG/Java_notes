import java.util.*;
public class note7_8{
	public static void main(String[] args){
		// 创建一个存储 Student 对象的 LinkedList
		LinkedList<Student> students = new LinkedList<>();

		// 1. 添加学生对象
		students.add(new Student("Alice",20));
		students.add(new Student("Bob",22));
		students.addFirst(new Student("Tom",19)); // 在链表头添加
		students.addLast(new Student("Cindy",21)); // 在链表尾添加

		// 2. 打印链表内容
		System.out.println("初始链表内容: ");
		for(Student s: students){
			System.out.println(s);
		}

		// 3. 访问特定位置的学生
		System.out.println("\n第一个学生: "+students.getFirst());
		System.out.println("最后一个学生: "+students.getLast());

		// 4. 删除学生
		students.removeFirst(); // 删除第一个
		students.removeLast(); // 删除最后一个

		// 5. 链表大小
		System.out.println("\n链表长度: "+students.size());

		// 打印删除后的链表内容
		System.out.println("\n删除后的链表内容:");
		for(Student s: students){
			System.out.println(s);
		}

		// 输出:
		// 初始链表内容:
		// Student(name='Tom', age=19)
		// Student(name='Alice', age=20)
		// Student(name='Bob', age=22)
		// Student(name='Cindy', age=21)

		// 第一个学生: Student(name='Tom', age=19)
		// 最后一个学生: Student(name='Cindy', age=21)

		// 链表长度: 2

		// 删除后的链表内容:
		// Student(name='Alice', age=20)
		// Student(name='Bob', age=22)
	}
}
class Student{
	private String name;
	private int age;

	// 构造方法
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	// 重写 toString() 方便输出
	@Override
	public String toString(){
		return "Student(name='"+name+"', age="+age+")";
	}
	// 这一步的重写是必须的,否则输出为:(调用默认的 toString() 方法输出字符串的结果)
	// 初始链表内容:	
	// Student@a09ee92
	// Student@30f39991
	// Student@452b3a41
	// Student@4a574795

	// 第一个学生: Student@a09ee92
	// 最后一个学生: Student@4a574795

	// 链表长度: 2

	// 删除后的链表内容:
	// Student@30f39991
	// Student@452b3a41
}