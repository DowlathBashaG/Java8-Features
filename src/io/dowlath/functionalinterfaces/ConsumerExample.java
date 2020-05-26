package io.dowlath.functionalinterfaces;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

/**
 * @Author Dowlath
 * @create 5/26/2020 4:19 PM
 */

/* accepts one input -> Consumer(...) takes input but it wont return anything.
      functions :
                    1. accept( T t)
                    2. andThen

 */
public class ConsumerExample {
    private static Consumer<Student> student = student -> System.out.println(student);
    private static Consumer<Student> studentName = name -> System.out.print(name.getName());
    private static Consumer<Student> studentActivites = activities -> System.out.println(activities.getActivities());

    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("Dowlath Basha G");

        printStudents();
        printStudentNameAndActivities();
        printStudentNameAndActivitiesBasedOnCondition();

    }

    public static void printStudents(){
        System.out.println("\nprint Students list ....");
        List<Student>  studentList = StudentDataBase.getAllStudents();
        // foreach accept consumer implementtions.
        studentList.forEach(student);
        System.out.println("\n");
    }

    public static void printStudentNameAndActivities(){
        System.out.println("print Students Name and Activites ....");
        List<Student>  studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentName.andThen(studentActivites));  //This is consumer chaning (andThen)
        System.out.println("\n");
    }

    public static void printStudentNameAndActivitiesBasedOnCondition(){
        System.out.println("print Students Name and Activites based on condition....");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student ->{
            if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9){
                studentName.andThen(studentActivites).accept(student);
            }
        }));
    }
}
