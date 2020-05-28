package io.dowlath.streams;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Author Dowlath
 * @create 5/27/2020 10:44 AM
 */
public class StreamsExample_List_To_Map {
    static Predicate<Student> studentPredicateGradeLevel = student -> student.getGradeLevel() >=3;
    static Predicate<Student> studentPredicateGpaLevel = student -> student.getGpa() >=3.9;
    public static void main(String[] args) {

       Map<String, List<String>> listMap = StudentDataBase.getAllStudents().stream()
                .filter(studentPredicateGradeLevel)  // Stream<Student>
                .filter(studentPredicateGpaLevel)   // Stream<Student?
                .collect(Collectors.toMap(Student::getName,Student::getActivities)); // Desiered output.

       System.out.println(listMap);
    }
}
