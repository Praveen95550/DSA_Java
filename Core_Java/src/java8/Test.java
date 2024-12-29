package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
	            new Employee("John", 1000, 20),
	            new Employee("Alice", 1200, 25),
	            new Employee("Bob", 1500, 30),
	            new Employee("Emma", 1800, 28),
	            new Employee("David", 2000, 35),
	            new Employee("John", 10000, 20)  // Duplicate to test distinct()
	        );

		List<String> s = Arrays.asList("Praveen","Chotu","Sweety","Mani");
		
		
		s.stream().map(s1 -> new StringBuilder(s1).reverse()).map( i -> i.charAt(0)).collect(Collectors.toList()).forEach(System.out::println);
		
		
		//empList.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList()).forEach(System.out::println);
		
	//List<Employee> s =	empList.stream().takeWhile(e -> e.getAge() >= 20).collect(Collectors.toList());
	//s.forEach(System.out::println);
	
	
	List<Employee> s1 =	empList.stream().dropWhile(e -> e.getAge() >= 20).collect(Collectors.toList());
	//s1.forEach(System.out::println);
	/*	List<Employee> s = empList.stream().distinct().collect(Collectors.toList());
		//s.forEach(System.out::println);
		
		List<Employee> s1 = empList.stream().collect(Collectors.groupingBy(Employee::getName))
				.values()
				.stream()
				.map(list -> list.get(0))
				.collect(Collectors.toList());
		s1.forEach(System.out::println);  */
	
	}
}
