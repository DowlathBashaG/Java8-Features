package io.dowlath.streams;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author Dowlath
 * @create 5/27/2020 7:28 PM
 */
/*
     Note : Add n noOf fileters.
 */
public class StreamsFilterExample {
    public static List<Student> filterStudents(){
        List<Student> studentList = StudentDataBase.getAllStudents().stream()
                                    .filter(student -> student.getGender().equals("female"))
                                    .filter(student -> student.getGpa() >= 3.8)
                                    .collect(Collectors.toList());
        return studentList;
    }
    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);
    }
}
