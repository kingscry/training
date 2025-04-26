package reflectionAPI;

public class Employee {
	@Deprecated
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Deprecated
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Deprecated
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Deprecated
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	int id;
 int age;
double salary;
	 String name;
	Employee(int id,int age,double salary,String name){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", salary=" + salary + ", name=" + name + "]";
	}
	

}
