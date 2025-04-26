package fileHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserailizeEmployee{
	public static void main(String[] args) throws Exception{
		String path = "C:\\\\Dell\\\\serializeEmployee.txt"; 
		File file=new File(path);
		
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Employee employee=(Employee)ois.readObject();
		System.out.println(employee);
	}
}
