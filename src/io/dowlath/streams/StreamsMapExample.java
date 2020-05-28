package io.dowlath.streams;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author Dowlath
 * @create 5/27/2020 3:03 PM
 */
/*
      Map --> convert one type to another type.
 */
public class StreamsMapExample {

    // Return as list

    private static List<String> getNamesList(){
        List<String> studentList = StudentDataBase.getAllStudents().stream() // Stream<Student>
                                   .map(Student::getName)     // Stream<String>
                                   .map(String::toUpperCase) //  Stream<String> -> uppercase operation on each input
                                   .collect(Collectors.toList()); // List<String>
        return studentList;

    }

    // Return as Set

    private static Set<String> getNamesSet(){
        Set<String> studentSet = StudentDataBase.getAllStudents().stream() // Stream<Student>
                .map(Student::getName)     // Stream<String>
                .map(String::toUpperCase) //  Stream<String> -> uppercase operation on each input
                .collect(Collectors.toSet()); // Set<String>
        return studentSet;

    }

    public static void main(String[] args) {
        System.out.println(getNamesList());
        System.out.println(getNamesSet());
    }
}
