package io.dowlath.streams;

import io.dowlath.data.Employee;
import io.dowlath.data.EmployeeDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Author Dowlath
 * @create 5/27/2020 1:05 PM
 */
public class StreamExample_EmpList_To_EmpMap {

    static private Consumer<Employee> employeeName = employee -> System.out.print(employee.getEmpName()+"  ");
    static private Consumer<Employee> employeeDestingnationName = employee -> System.out.println(employee.getDestingnation());

    static private Predicate<Employee> employeeSalaryLesserThan20k = employee -> employee.getSalary() <= 20000.00;
    static private Predicate<Employee> employeeSalaryGreaterThan5k = employee -> employee.getSalary() >= 5000.00;

    private static void printNameAndDestinations(){
        System.out.println("Using Consumer Employee Name and Destingations");
        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();
        employeeList.forEach(employeeName.andThen(employeeDestingnationName));
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Map<String, String> empListToMap =
        EmployeeDataBase.getAllEmployees().stream()
                .collect(Collectors.toMap(Employee::getEmpName,Employee::getDestingnation));
        System.out.println(empListToMap);
        System.out.println("\n");
        printNameAndDestinations();

        Map<String,String> employeeListBasedonSalary =
        EmployeeDataBase.getAllEmployees().stream()
                 .filter(employeeSalaryLesserThan20k)
                 .filter(employeeSalaryGreaterThan5k)
                 .collect(Collectors.toMap(Employee::getEmpName,Employee::getDestingnation));
        System.out.println("Employee List based on salary");
        System.out.println(employeeListBasedonSalary);
    }
}
