package reflectionAPI;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class EmployeeDriver {
	public static void main(String[] args) throws Exception{
		Class<Employee> employeeClass = Employee.class;
		//fetching all the fiield names of a class
		Field[] fields = employeeClass.getDeclaredFields();
		
		for(Field field: fields) {
			System.out.println(field.getName());
		}
		//changing the value of a field of a particular objects
		Employee e = new Employee(1,25,35000.00,"Rohit");
		Field f = employeeClass.getDeclaredField("name");
		f.setAccessible(true);
		f.set(e,"Ram");
		System.out.println(f.get(e));
		System.out.println(f.get(employeeClass));
		f.setAccessible(false);
		System.out.println(employeeClass.getName());
		Method[] methods = employeeClass.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
		System.out.println("--------------------------------");
		for(Method method:methods) {
			if(method.isAnnotationPresent(Deprecated.class)) {
				System.out.println(method.getName());
			}
		}
				
	}

}
