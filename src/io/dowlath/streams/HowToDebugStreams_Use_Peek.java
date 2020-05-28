package io.dowlath.streams;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Author Dowlath
 * @create 5/27/2020 1:54 PM
 */

/*
       Use peek method , debug the streams.

       peek accepts consumer.

       it wont return anything.

 */
public class HowToDebugStreams_Use_Peek {
    static Predicate<Student> studentPredicateGradeLevel = student -> student.getGradeLevel() >=3;
    static Predicate<Student> studentPredicateGpaLevel = student -> student.getGpa() >=3.9;
    public static void main(String[] args) {

        Map<String, List<String>> listMap = StudentDataBase.getAllStudents().stream()
                .peek(student -> System.out.println("1st Filter ... :" +student))
                .filter(studentPredicateGradeLevel)  // Stream<Student>
                .peek(student -> System.out.println("2nd Filter ... :"+student))
                .filter(studentPredicateGpaLevel)   // Stream<Student?
                .peek(student -> System.out.println("3rd Filter ... :"+student))
                .collect(Collectors.toMap(Student::getName,Student::getActivities)); // Desiered output.

        System.out.println(listMap);
    }
}
