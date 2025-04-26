package map;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapDemo2 {
	public static void main(String[] args) {
		TreeMap<String,List<String>> map=new TreeMap();	
		List l1=Arrays.asList("Hyd","Delhi","Kolkata");
		List l2=Arrays.asList("Hyd","Delhi","J&K","Kolkata");
		List l3=Arrays.asList("Hyd","Pune","Delhi","Kolkata");
		map.put("SBI", l1);
		map.put("ICICI", l2);
		map.put("HDFC", l3);
		System.out.println(map);
		
		
		Set<Entry<String,List<String>>> e=map.entrySet() ;
		}

}
