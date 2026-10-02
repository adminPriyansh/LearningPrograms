import model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class SecondHighestSalaryFromListOfEmp {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 50000, "HR"),
                new Employee(2, "Bob", 70000, "IT"),
                new Employee(3, "Charlie", 60000, "IT"),
                new Employee(4, "David", 70000, "HR"),
                new Employee(5, "Eve", 80000, "Finance"),
                new Employee(6, "Frank", 75000, "Finance")
        );

                double salary = employees.stream().map(Employee::getSalary).distinct().
                        sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(salary);

        //second highest salary in each department
        Map<String,Double> secondHighEachDepartment = employees.stream().
                collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getSalary,
                                Collectors.collectingAndThen(Collectors.toList(),
                salaries->salaries.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().get()))));

        secondHighEachDepartment.forEach((string, aDouble) -> System.out.println("department" + string+ "salary"+ aDouble));



    }
}
