package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> names= List.of("Pankaj", "Pranav","neeraj", "jalaj");
     names.stream().filter(e->e.startsWith("P")).forEach(e->System.out.println(e));
     
     //or
     
     List<String> collect = names.stream().filter(e->e.startsWith("n")).collect(Collectors.toList());
     System.out.println(collect);
     
     //use of MAP
     //used when we need to perform operation on every values of the object
     List<Integer> list2 = Arrays.asList(45,98,453,56,2,67);
     list2.stream().map(i->i*2).forEach(e->System.out.println(e));
     
	}

}
