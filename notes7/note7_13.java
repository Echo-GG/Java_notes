import java.util.*;
public class note7_13{
	public static void main(String[] args){
		// 1. 创建 HashMap, 键是学生姓名, 值是成绩
		HashMap<String,Integer>scores = new HashMap<>();
		// new之后的<>中的类型名其实可以省略

		// 2. 添加元素(put)
		scores.put("Alice",90);
		scores.put("Bob",85);
		scores.put("Cindy",95);
		scores.put("David",88);

		System.out.println("初始成绩表: "+scores);

		// 3. 访问元素(get)
		System.out.println("Alice 的成绩: "+scores.get("Alice"));

		// 4. 修改元素(put 会覆盖旧值)
		scores.put("Bob",89);
		System.out.println("修改 Bob 成绩后: "+scores);

		// 5. 删除元素(remove)
		scores.remove("David");
		// scores.remove(88); // Incorrect
		System.out.println("删除 David 后: "+scores);

		// 6. 判断键或值是否存在
		System.out.println("是否包含键 'Cindy'? "+scores.containsKey("Cindy"));
		System.out.println("是否包含值 90? "+scores.containsValue(90));

		// 7. 遍历方式 ① : 通过 entrySet() 获取键值对
		System.out.println("\n遍历方式 (entrySet): ");
		for(Map.Entry<String,Integer>entry: scores.entrySet()){
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}

		// 8. 遍历方式 ② : 只遍历键
		System.out.println("\n遍历方式(keySet): ");
		for(String name: scores.keySet()){
			System.out.println(name+"->"+scores.get(name));
		}

		// 9. 获取大小与清空
		System.out.println("\n当前学生数量: "+scores.size());
		scores.clear();
		System.out.println("清空后: "+scores);
	}
}
