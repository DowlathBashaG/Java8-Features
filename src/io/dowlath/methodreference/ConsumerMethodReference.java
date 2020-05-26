package io.dowlath.methodreference;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.function.Consumer;

/**
 * @Author Dowlath
 * @create 5/27/2020 2:40 AM
 */
public class ConsumerMethodReference {

    private static Consumer<Student> students = student -> System.out.println(student);
    /*
         classname::methodName
     */
    private static Consumer<Student> studentsList = System.out::println;
    /*
        classname::instanceMethodName
    */
    private static Consumer<Student> listOfActivities = Student::printListOfActivities;


    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(students);
        System.out.println("\n");
        StudentDataBase.getAllStudents().forEach(studentsList);
        System.out.println("\n");
        StudentDataBase.getAllStudents().forEach(listOfActivities);
    }
}
