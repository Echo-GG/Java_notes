import java.util.*;
public class note7_11{
	public static void main(String[] args){
		Student stu1 = new Student("S1",78);
		Student stu2 = new Student("S2",98);
		HashSet<Student> set = new HashSet<Student>();
		HashSet<Student> subset = new HashSet<Student>();
		set.add(stu1);
		set.add(stu2);
		subset.add(stu1);
		System.out.println("set contains subset:"+set.containsAll(subset));
		Object s[] = set.toArray();
		for(int i=0;i<s.length;i++){
			System.out.printf("%s:%d\n",((Student)s[i]).name,((Student)s[i]).score);
		}


		HashSet<Student> tempSet = (HashSet<Student>)set.clone();
		tempSet.removeAll(subset);
		Iterator<Student> iter = tempSet.iterator();
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
	// @Override 
	// public String toString(){
	// 	return "Student(name='"+name+"', score="+score+")";
	// }
}



// note:
// HashSet<E>泛型类在数据组织上类似数学上的集合，可以进行"交"、"并"、"差"等运算。
// 集合不允许有相同的元素，也就是说，如果b已经是集合中的元素，那么再执行set.add(b)操作是无效的。
// 集合对象的初始容量（capacity）是16个字节，装载因子（load factor）是0.75，
// 也就是说，如果集合添加的元素超过总容量的75%时，集合的容量将增加一倍。

// 常用方法
// public boolean add(E o)：向集合添加参数指定的元素。
// public void clear()：清空集合，使集合不含有任何元素。
// public boolean contains(Object o)：判断集合是否包含参数指定的数据。
// public boolean isEmpty()：判断集合是否为空。
// public boolean remove(Object o)：删除参数指定的元素。
// public int size()：返回集合中元素的个数。
// Object[] toArray()：将集合元素存放到数组中，并返回这个数组。
// boolean containsAll(HanshSet set)：判断当前集合是否包含参数指定的集合。
// public Object clone()：得到当前集合的一个克隆对象，该对象中元素的改变不会影响到当前集合中的元素，
// 反之亦然。 

// 集合的交、并与差
// 集合对象调用boolean addAll(HashSet set)方法可以和参数指定的集合求并运算，
// ]使得当前集合成为两个集合的并。

// 集合对象调用boolean retainAll(HashSet set)方法可以和参数指定的集合求交运算，
// 使得当前集合成为两个集合的交。

// 集合对象调用boolean removeAll(HashSet set)方法可以和参数指定的集合求差运算，
// 使得当前集合成为两个集合的差。

// 参数指定的集合和当前集合必须是同种类型的集合，否则上述方法返回false。 

// HashSet<E>泛型类实现的接口
// HashSet<E>泛型类实现了泛型接口Set<E>，而 Set<E>接口是Collection<E>接口的子接口。 

// HashSet<E>类中的绝大部分方法都是接口方法的实现。

// 编程时，可以使用接口回调技术，即把HashSet<E>对象的引用赋值给Collection<E>接口变量
// 或 Set<E>接口变量，那么接口就可以调用类实现的接口方法。
