package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SequentialStream {
	
	// Intermediate operations - filter , map, peek, skip, flatMap, limit, distinct
	// Terminal operations     - collect, count, sorted, min, max, forEach, toArray, allMatch/anyMatch/noneMatch, of, reduce

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = Arrays.asList(
	            new Employee("John", 1000, 20),
	            new Employee("Emma", 1200, 25),
	            new Employee("Bob", 1500, 30),
	            new Employee("Emma", 1800, 28),
	            new Employee("David", 2000, 35)
	        );
		
		// count no of employees with similar name & age >24

		Map<Object, Long> map = empList.stream().filter(e -> e.getAge()> 24).collect(Collectors.groupingBy(e -> e.getName(),Collectors.counting()));
		System.out.println(map.toString());
		
	  // sort by age (int type), descending order then use .reversed()
		empList.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList()).forEach(System.out::println);;
		
	}



	
}
