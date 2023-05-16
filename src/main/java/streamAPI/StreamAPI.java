package streamAPI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String a[])
	{
		//WAYS TO CREATE LIST
		
		//IMMUTABLE ie, their values can't be changed/ nor added any new
		List<Integer> list1 = List.of(2,3,4,5,6,9);
		List<Integer> list2 = Arrays.asList(45,98,453,56,2,67);
		
		//Mutable
		List<Integer> list3=new ArrayList<>();
		list3.add(3);
		list3.add(5);
		list3.add(54);
		list3.add(99);
	
		//Q) We have to select the even no. from the list
		//Using list1 for our operation now
		
		//Converting Java list to stream
		Stream<Integer> stream = list1.stream();
	
		//now performing operation on the stream
		//here i->i%2==0 is a predicate that is it is a boolean function
		//so we filters out and then collect the filter data
		List<Integer> collect = stream.filter(i->i%2==0).collect(Collectors.toList());
		//System.out.println(collect);
		
		//Q) find the no. from list2 >50
		List<Integer> collect2 = list2.stream().filter(i->i>50).collect(Collectors.toList());
		//System.out.println(collect2);
		
		List <Data> data= new ArrayList<Data>();
		Data d= new Data(5,"name","ud");
		Data r= new Data(6,"pam", "jp");
		data.add(d);
		data.add(r);
		
		String x= data.get(1).getCity();
		System.out.println(x);
	}
}
