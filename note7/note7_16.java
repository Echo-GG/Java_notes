import java.util.*;
public class note7_16{
	public static void main(String[] args){
		Student s1 = new Student(65,177,"Zhang"),
		s2 = new Student(85,168,"Li");
		TreeMap<MyKey,Student> treemap = new TreeMap<MyKey,Student>();
		treemap.put(new MyKey(s1.weight),s1);
		treemap.put(new MyKey(s2.weight),s2);
		Collection<Student> collection = treemap.values();
		Iterator<Student> iter = collection.iterator();
		while(iter.hasNext()){
			Student te = iter.next();
			System.out.printf("%s,%d(kg)\n",te.name,te.weight);
		}
	}
}


class Student{
	String name = null;
	int height, weight;
	Student(int w,int h,String name){
		weight = w;
		height = h;
		this.name = name;
	}
}

class MyKey implements Comparable{
	int number = 0;
	MyKey(int number){
		this.number = number;
	}

	public int compareTo(Object o){
		MyKey mykey  = (MyKey)o;
		if(this.number == mykey.number)
			return 1;
		else
			return (this.number - mykey.number);
	}
}
