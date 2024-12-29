package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllStreamOperations {

	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
	            new Employee("John", 1000, 20),
	            new Employee("Alice", 1200, 25),
	            new Employee("Bob", 1500, 30),
	            new Employee("Emma", 1800, 28),
	            new Employee("David", 2000, 35),
	            new Employee("John", 1000, 20)  // Duplicate to test distinct()
	        );

	        // 1. filter: Employees who are older than 25
	        List<Employee> filtered = empList.stream()
	            .filter(e -> e.getAge() > 25)
	            .collect(Collectors.toList());
	        System.out.println("Filtered Employees (age > 25):");
	        filtered.forEach(System.out::println);

	        // 2. map: Get the names of all employees
	        List<String> names = empList.stream()
	            .map(Employee::getName)
	            .collect(Collectors.toList());
	        System.out.println("\nEmployee Names:");
	        names.forEach(System.out::println);

	        // 3. peek: Peek at elements (useful for debugging)
	        System.out.println("\nPeek at Employees (before filtering):");
	        empList.stream()
	            .peek(e -> System.out.println("Processing: " + e))
	            .filter(e -> e.getAge() > 25)
	            .forEach(System.out::println);

	        // 4. skip: Skip the first 2 employees
	        List<Employee> skipped = empList.stream()
	            .skip(2)
	            .collect(Collectors.toList());
	        System.out.println("\nSkipped first 2 Employees:");
	        skipped.forEach(System.out::println);

	        // 5. flatMap: Flatten nested streams (can be used for collections inside employees)
	        // Example: Let's say we have a list of employees and each employee has a list of projects.
	        
	        // 6. limit: Limit to the first 3 employees
	        List<Employee> limited = empList.stream()
	            .limit(3)
	            .collect(Collectors.toList());
	        System.out.println("\nLimited to first 3 Employees:");
	        limited.forEach(System.out::println);

	        // 7. distinct: Remove duplicate employees based on equals() and hashCode()
	        List<Employee> distinctEmployees = empList.stream()
	            .distinct()
	            .collect(Collectors.toList());
	        System.out.println("\nDistinct Employees (no duplicates):");
	        distinctEmployees.forEach(System.out::println);

	        // 8. collect: Collect employees with salary greater than 1500 into a list
	        List<Employee> highSalaryEmployees = empList.stream()
	            .filter(e -> e.getSalary() > 1500)
	            .collect(Collectors.toList());
	        System.out.println("\nEmployees with salary > 1500:");
	        highSalaryEmployees.forEach(System.out::println);

	        // 9. count: Count the number of employees older than 25
	        long count = empList.stream()
	            .filter(e -> e.getAge() > 25)
	            .count();
	        System.out.println("\nNumber of employees older than 25: " + count);

	        // 10. sorted: Sort employees by age (ascending)
	        List<Employee> sortedByAge = empList.stream()
	            .sorted(Comparator.comparing(Employee::getAge))
	            .collect(Collectors.toList());
	        System.out.println("\nEmployees sorted by age (ascending):");
	        sortedByAge.forEach(System.out::println);

	        // 11. min/max: Find the youngest and oldest employees
	        Optional<Employee> youngest = empList.stream()
	            .min(Comparator.comparing(Employee::getAge));
	        Optional<Employee> oldest = empList.stream()
	            .max(Comparator.comparing(Employee::getAge));
	        System.out.println("\nYoungest Employee: " + youngest.get());
	        System.out.println("Oldest Employee: " + oldest.get());

	        // 12. forEach: Print all employee details
	        System.out.println("\nEmployee details:");
	        empList.stream()
	            .forEach(System.out::println);

	        // 13. toArray: Convert the stream to an array
	        Employee[] empArray = empList.stream()
	            .toArray(Employee[]::new);
	        System.out.println("\nEmployee Array:");
	        Arrays.stream(empArray).forEach(System.out::println);

	        // 14. anyMatch, allMatch, noneMatch: Check if any, all, or none of the employees have salary > 1500
	        boolean anyMatch = empList.stream().anyMatch(e -> e.getSalary() > 1500);
	        boolean allMatch = empList.stream().allMatch(e -> e.getSalary() > 1000);
	        boolean noneMatch = empList.stream().noneMatch(e -> e.getSalary() < 800);

	        System.out.println("\nAny employee with salary > 1500: " + anyMatch);
	        System.out.println("All employees have salary > 1000: " + allMatch);
	        System.out.println("No employee has salary < 800: " + noneMatch);

	        // 15. reduce: Sum all salaries
	        int totalSalary = empList.stream()
	            .map(Employee::getSalary)
	            .reduce(0, Integer::sum); // Initial value = 0, accumulator = Integer::sum
	        System.out.println("\nTotal Salary of all Employees: " + totalSalary);
	        
	       // int sumOfEvenNumbers = Arrays.stream(numbers).reduce(0, (sum, n) -> n % 2 == 0 ? sum + n : sum);

	        // 16. of: Create a stream from specific elements
	        Stream<Employee> specificEmployees = Stream.of(
	            new Employee("Eve", 1600, 40),
	            new Employee("Frank", 1900, 45)
	        );
	        System.out.println("\nSpecific Employees from Stream.of:");
	        specificEmployees.forEach(System.out::println);


	        // Find first employee older than 30
	        empList.stream()
	            .filter(e -> e.getAge() > 30)
	            .findFirst()
	            .ifPresent(System.out::println);
	        
	     // Collect employees into a set (unique names)
	        Set<String> uniqueNames = empList.stream()
	            .map(Employee::getName)
	            .collect(Collectors.toSet());
	        System.out.println("Unique Employee Names: " + uniqueNames);
	}

}
