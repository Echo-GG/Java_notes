class Employee{
	private double salary = 1800;
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return salary;
	}
}
public class Employee_2{
	public static void main(String[] args){
		Employee zhang = new Employee();
		Employee wang = new Employee();
		zhang.setSalary(100);
		System.out.println("zhang's salary: "+zhang.getSalary());
		wang.setSalary(3888);
		// wang.salary = 88888;//ERROR!!!
		System.out.println("wang's salary: "+wang.getSalary());
	}
}

// note:
// 不用private, public, protected修饰的成员变量和方法被称为友好成员变量和友好方法。
