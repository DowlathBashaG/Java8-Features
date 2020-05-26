package io.dowlath.functionalinterfaces;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @Author Dowlath
 * @create 5/27/2020 12:52 AM
 */
public class PredicateConsumerExample {

    private static Predicate<Student> p1 = s -> s.getGradeLevel() >=3;
    private static Predicate<Student> p2 = s -> s.getGpa() >= 3.9;

    BiConsumer<String, List<String>> biConsumer = (name,activities) -> System.out.println(name+ " "+ activities);

    Consumer<Student> studentConsumer = (student ->{
        if(p1.and(p2).test(student)){
            biConsumer.accept(student.getName(),student.getActivities());
        }
    });

    private void printNameAndActivities(List<Student> students){
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
    List<Student> studentList = StudentDataBase.getAllStudents();
    new PredicateConsumerExample().printNameAndActivities(studentList);
    }
}
