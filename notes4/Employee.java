public class Employee{
	private double salary = 1800;
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return salary;
	}

	public static void main(String[] args){
		Employee zhang = new Employee();
		Employee wang = new Employee();
		zhang.setSalary(100);
		System.out.println("zhang's salary: "+zhang.getSalary());
		wang.salary = 3888;
		System.out.println("wang's salary: "+wang.getSalary());
	}
}	