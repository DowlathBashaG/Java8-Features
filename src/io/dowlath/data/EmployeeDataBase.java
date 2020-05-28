package io.dowlath.data;

import java.util.Arrays;
import java.util.List;

/**
 * @Author Dowlath
 * @create 5/27/2020 12:58 PM
 */
public class EmployeeDataBase {

    public static List<Employee> getAllEmployees(){
        Employee employee1 = new Employee("Dowlath","Tech Lead",1000.00);
        Employee employee2 = new Employee("Basha","Analyst",5000.00);
        Employee employee3 = new Employee("Arsh","Manager",10000.00);
        Employee employee4 = new Employee("Ariz","TechSepcialist",4000.00);
        Employee employee5 = new Employee("Naveeda","Director",20000.00);

        List<Employee> employeeList = Arrays.asList(employee1,employee2,employee3,employee4,employee5);
        return employeeList;
    }
}
