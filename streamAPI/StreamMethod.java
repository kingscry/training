package streamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMethod {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,4,6,9,6,7,5,3);
//		System.out.println(list);//[2,4,6,9,6,7,5,3]
//		Stream s=list.stream();//[2,4,6,9,6,7,5,3]
//		Stream s2= s.distinct();//[2,4,6,9,7,5,3]
//		s2.forEach(n->System.out.print(n+" "));
		list.stream().distinct().forEach(n->System.out.println(n));
		System.out.println("\n"+list);
		
		Integer x=null;
		Optional<Integer> o=Optional.of(x);
		System.out.print(x);
		
		
		//min
		Optional<Integer> optional=list.stream().distinct().min((o1,o2)->o1-o2);
		if(optional.isPresent()) {
			System.out.println(optional.get());	
		}
		//max
		Integer i=list.stream().max((o1,o2)->o1-o2).get();
		System.out.println(i);
		
		System.out.println("------------------------------------------------------------");
		
		//sorted
		list.stream().sorted().forEach(n->System.out.println(n+" "));
		System.out.println();
		
		//sorted Comparator
		list.stream().sorted((o1,o2)->o1-o2).forEach(n->System.out.println(n+" "));
		//map(function)
		System.out.println();
		list.stream().distinct().sorted().map(n->n*n).forEach(n-> System.out.println(n+" "));
		
		//filterPrediction
		System.out.println();
		list.stream();
		
		//toList
		System.out.println();
		List<Integer> li=list.stream().distinct().filter(n->n%2==0).toList();
		System.out.println(li);
		
		
		Stream s=Stream.of(1,4,7,"Demo",6,7,89.6);
		s.forEach(n->System.out.println(n));
		System.out.println("------------------------------------------------------");
		//findFirst()
		Optional<Integer> op=list.stream().findFirst();
		System.out.println(op.get());
		
		//findAny
		System.out.println(list.stream().findAny().get());
		
		//count
		System.out.println(); 
		}

}
