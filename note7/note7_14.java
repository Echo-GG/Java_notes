import java.util.*;
public class note7_14{
	public static void main(String[] args){
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("a", 1);
		map.put("b", 2);
		Collection<Integer> collection = map.values();
		Iterator<Integer> iter = collection.iterator();
		while(iter.hasNext()){
			Integer temp = iter.next();
			System.out.println(temp.toString());
		}
	}
}

// note:

// HashMap<K,V>也是一个很实用的类，HashMap<K,V>对象采用散列表这种数据结构存储数据，
// 习惯上称HashMap<K,V>对象为散列映射对象。

// 散列映射用于存储键/值数据对，允许把任何数量的键/值数据对存储在一起。

// 键（Key）不可以发生逻辑冲突，即不要对两个数据项使用相同的键，
// 如果出现两个数据项使用相同的键，那么，先前散列映射中的键/值对将被替换。



// 散列映射在它需要更多的存储空间时会自动增大容量。 

// 例如，如果散列映射的装载因子是0.75，那么当散列映射的容量被使用了75%时，
// 它就把容量增加到原始容量的２倍。

// 对于数组和链表这两种数据结构，如果要查找它们存储的某个特定的元素却不知道它的位置，
// 就需要从头开始访问元素直到找到匹配的为止；如果数据结构中包含很多的元素，就会浪费时间。

// 最好使用散列映射来存储要查找的数据，使用散列映射可以减少检索的开销。

// 1.HashMap<K,V>对象
// HashMap<K,V>泛型类创建的对象称作散列映射，例如:
// // HashMap<String,Student> hashtable = new HashMap<String,Student>();
// 那么，hashtable就可以存储"键/值"对数据，
// 其中的键必须是一个String对象,键对应的值必须是Student对象。
// hashtable可以调用public V put(K key, V value)
// 将键/值对数据存放到散列映射中，该方法同时返回键所对应的值。


// 2.常用方法
// public void clear()：清空散列映射。
// public Object clone()：返回当前散列映射的一个克隆。
// public boolean containsKey(Object key)：如果散列映射有键/值对使用了参数指定的键，
// 方法返回true，否则返回false。
// public boolean containsValue(Object value)：如果散列映射有键/值对的值是参数指定的值，
// 方法返回true，否则返回false。 
// public V get(Object key)：返回散列映射中使用key做键的键/值对中的值。
// public boolean isEmpty()：如果散列映射不含任何键/值对，
// 方法返回true，否则返回false。
// public V remove(Object key)：删除散列映射中键为参数指定的键/值对，并返回键对应的值。
// public int size()：返回散列映射的大小，即键/值对的数目。 

// 3.遍历散列映射
// 如果想获得散列映射中所有键/值对中的值，首先使用
// public Collection<V> values()
// 该方法返回一个实现Collection<V>接口的类创建的对象的引用，
// 并要求将该对象的引用返回到Collection<V>接口变量中。
// values()方法返回的对象中存储了散列映射中所有"键/值"对中的"值"，
// '这样接口变量就可以调用类实现的方法，比如获取Iterator对象，然后输出所有的值。


// 4.HashMap<K,V>泛型类实现的接口

// HashMap<K,V>泛型类实现了泛型接口Map<K,V>，
// HashMap<K,V>类中的绝大部分方法都是Map<K,V>接口方法的实现。

// 编程时，可以使用接口回调技术，即把HashMap<K,V>对象的引用赋值给Map<K,V>接口变量，
// 那么接口就可以调用类实现的接口方法。 
