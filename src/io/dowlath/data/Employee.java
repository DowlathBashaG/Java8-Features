package io.dowlath.data;

/**
 * @Author Dowlath
 * @create 5/27/2020 12:56 PM
 */
public class Employee {
    private String empName;
    private String destingnation;
    private Double salary;

    public Employee() {
    }

    public Employee(String empName, String destingnation,Double salary) {
        this.empName = empName;
        this.destingnation = destingnation;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDestingnation() {
        return destingnation;
    }

    public void setDestingnation(String destingnation) {
        this.destingnation = destingnation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", destingnation='" + destingnation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
