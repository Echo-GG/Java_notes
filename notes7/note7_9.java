import java.util.*;
public class note7_9{
	public static void main(String[] args){
		LinkedList<Student> mylist = new LinkedList<Student>();
		Student stu1 = new Student("S1",78);
		Student stu2 = new Student("S2",98);
		mylist.add(stu1);
		mylist.add(stu2);

		int number = mylist.size();
		for(int i=0;i<number;i++){
			Student temp = mylist.get(i);
			System.out.printf("%s:%d\n",temp.name,temp.score);
		}


		Iterator<Student> iter = mylist.iterator();
		while(iter.hasNext()){
			Student temp = iter.next();
			System.out.printf("%s:%d\n",temp.name,temp.score);
		}
	}
}
class Student{
	String name;
	int score;
	Student(String name,int score){
		this.name = name;
		this.score = score;
	}
}

// note:
// LinkedList<E>泛型类的一些常用方法：

// public boolean add(E element)：向链表末尾添加一个新的节点，
// 该节点中的数据是参数element指定的对象。

// public void add(int index, E element)：向链表的指定位置添加一个新的节点，
// 该节点中的数据是参数element指定的对象。

// public void addFirst(E element)：向链表的头添加新节点，
// 该节点中的数据是参数element指定的对象。

// public E removeFirst()：删除第一个节点，并返回这个节点中的对象。

// public E removeLast()：删除最后一个节点，并返回这个节点中的对象。

// public E get(int index)：得到链表中指定位置处节点中的对象。

// public E getFirst()：得到链表中第一个节点中的对象。

// public E getLast()：得到链表中最后一个节点中的对象。

// public int indexOf(E element)：返回含有数据element的节点在链表中首次出现的位置，
// 如果链表中无此节点则返回-1。

// public int lastIndexOf(E element)：返回含有数据element的节点在链表中最后出现的位置，
// 如果链表中无此节点则返回-1。

// public E set(int index, E element)：将当前链表index位置节点中的对象替换为参数element
// 指定的对象,并返回被替换的对象。

// public int size()：返回链表的长度，即节点的个数。

// public boolean contains(Object element)：判断链表节点中是否有节点包含对象element。

// public Object clone()：得到当前链表的一个克隆链表，
// 该克隆链表中节点数据的改变不会影响到当前链表中节点的数据，反之亦然。
