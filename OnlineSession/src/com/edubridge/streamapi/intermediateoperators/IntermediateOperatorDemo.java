package com.edubridge.streamapi.intermediateoperators;
import java.util.*;
import java.util.stream.Collectors;
public class IntermediateOperatorDemo 
{
	public static void main(String[] args) 
	{
		//1. .map()
		List<Integer>obj = Arrays.asList(3,5,6,8,9);
		// "::" is used/referred for reference object
		System.out.println("Map Operator");
		obj.stream().map(x -> x*3).forEach(System.out::println);
		List<String>obj1 = Arrays.asList("ajay","amar","arjun","anand");
		obj1.stream().map(n -> n.toLowerCase()).forEach(System.out::println);
		//Without usingforEach method/function
		List<String>uppername = new ArrayList<>();
		for(String s :obj1)
		{
		uppername.add(s.toUpperCase());
		}
		List<String>collect = obj1.stream()
				.map(str -> str.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(collect);
		
		//2. .filter()
		List<String>obj2 = Arrays.asList("3","5","8","9","6");
		System.out.println("Filter Operator");
		System.out.println("Original numbers : "+obj2);
		List<Integer> even = obj2.stream()
							.map(s -> Integer.valueOf(s))
							.filter(num -> num % 2 == 0)
							.collect(Collectors.toList());
		System.out.println("Processed List, only Even Numbers : "+even);
		
		//3.  .sorted()
		List<String>list = Arrays.asList("A","B","C","d","h","9","1");
		System.out.println("Sorted Operator");
		List<String>sortedList = list.stream()
								.sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		//To print sorted list in descending order 
		System.out.println("Printing in descending Order using sorted");
		List<String>sortedList1 = list.stream()
								.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList1);
		
		//4. distinct()
		List<Integer>obj3 = Arrays.asList(3,5,6,8,9,3,6,8,9,5,8,6,4,2,3,7,5,6,21,4,6,5);
		System.out.println("Distinct Operator");
		obj.stream().distinct().forEach(System.out::println);
		
		//distinct().limit()
		System.out.println("Using Limit....");
		obj.stream().distinct().limit(3).forEach(System.out::println);
		
		//distinct().skip()
		System.out.println("Using Skip....");
		obj.stream().distinct().skip(2).forEach(System.out::println);
	}
}
