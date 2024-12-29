package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Akriti {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
				new Employee("Akriti",25000,25),
				new Employee("Praveen",29000,29),
				new Employee("Chotu",2000,2),
				new Employee("Rabbit",27000,27));
		
		//Find all employees who are older than 20 years of age.
		empList.stream().filter(e->e.getAge()>20).forEach(System.out::println);
		
		//Create a list of all employee names from the list of employees.
		empList.stream().map(e->e.getName()).collect(Collectors.toList()).forEach(System.out::println);;
		
		//flatMap
		String emp1[] = {"Project1","Project2"};
		String emp2[] = {"Project2","Project3"};
		String emp3[] = {"Project4","Project3"};
		
		
		Arrays.stream(new String[][] {emp1,emp2,emp3}).flatMap(Arrays::stream).distinct().forEach(System.out::println);
	
		//Print the details of all employees before applying any filtering operations.
		empList.stream().peek(em->System.out.println("Processing emplist" +em)).filter(emp->emp.getAge()>2).forEach(System.out::println);
	
		//Skip the first 3 employees in the list and process the rest.
		empList.stream().skip(1).forEach(System.out::println);
		
		empList.stream().sorted((o1,o2)->o1.getAge()-o2.getAge()).forEach(System.out::println);
		//empList.stream().sorted().forEach(System.out::println);
		
		//Calculate the total salary of all employees using the reduce() method.
		Integer sum = empList.stream().map(emp->emp.getSalary()).reduce(0,Integer::sum);
		System.out.println("SUM is "+sum);
		
		
		//Check if there is any employee whose age is greater than 28.
		Optional<Employee> age28=empList.stream().filter(emp->emp.getAge()>28).findAny();
		if(age28.isPresent())
		System.out.println("Employee whose age is more than 28 "+age28);
		
		//Check if all employees earn more than 1000 in salary.
		boolean salaryflag = empList.stream().allMatch(emp->emp.getSalary()>1000);
		System.out.println("If salary is greater than 1000 or not?"+salaryflag);
		
		//Check if no employee has a salary less than 500.
		boolean salaryLess = empList.stream().noneMatch(emp->emp.getSalary()<500);
		System.out.println("Noone should not have salary less than 500 or not?"+salaryLess);
		
		//Find the employee with the lowest salary and the one with the highest salary.
		Optional<Employee> max = empList.stream().max((o1,o2)->o1.getSalary()-o2.getSalary());
		Optional<Employee> min = empList.stream().min((o1,o2)->o1.getSalary()-o2.getSalary());
		System.out.println("Max Salary "+max+" Min Salary "+min );
		
		
		//Concatenate two streams of employees and print the combined result.
		List<Employee> empList2 = Arrays.asList(
				new Employee("Varnik",28000,24),
				new Employee("Aruna",24000,50),
				new Employee("Mani",29000,25),
				new Employee("Tirash",30000,55));
		
		Stream<Employee> employees = Stream.concat(empList.stream(), empList2.stream());
		employees.forEach(System.out::println);
		

		//Filter employees whose age is greater than 25, map them to their names, and then sort them by name in alphabetical order.
		empList.stream().filter(emp->emp.getAge()>25).map(Employee::getName).sorted().collect(Collectors.toList())
		.forEach(System.out::println);
		
		//reverse order sorting
		empList.stream().filter(emp->emp.getAge()>25).map(Employee::getName).sorted(Comparator.reverseOrder()).
		map(str->str.charAt(0)).collect(Collectors.toList())
		.forEach(System.out::println);
		
		//Given a stream of employees, each having a list of departments they are associated with, flatten the list to show all unique departments across all employees.
		List<EmployeeDep> empDep= Arrays.asList(
				new EmployeeDep("123",Arrays.asList("Accounts","HR")),
				new EmployeeDep("1234",Arrays.asList("Management","HR")),
				new EmployeeDep("456",Arrays.asList("IT","Finance")));
		empDep.stream().flatMap(emp->emp.getDepartment().stream()).distinct().collect(Collectors.toList()).forEach(
				System.out::println);

		//Find the names of all employees whose salary is greater than 15000, older than 25, sorted by age in ascending order, and then print them.
		empList.stream().filter(emp->(emp.getSalary()>15000 && emp.getAge()>25)).sorted((o1,o2)->o1.getAge()-o2.getAge()).
		forEach(System.out::println);
		
		//Find the employee with the highest salary using reduce(), and print their details.
		Optional<Employee> employee=empList.stream().reduce((o1,o2)->o1.getSalary()>o2.getSalary()?o1:o2);
		if(employee.isPresent())
			System.out.println("Employee with highest salary "+employee);
		
		//Check if there is any employee who has a department starting with "A" (using filter() and map()).
		empList.stream().filter(emp->emp.getName().startsWith("A")).map(Employee::getName).forEach(
				System.out::println);;
		
		//Group employees by their age group (e.g., < 25, 25-30, >30) and count how many employees fall into each category.
				

	}
}
