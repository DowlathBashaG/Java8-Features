package io.dowlath.streams;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

/**
 * @Author Dowlath
 * @create 5/28/2020 12:23 AM
 */
public class StreamJoining {

    private static String joining_1(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                //.collect(Collectors.joining());
                  .collect(joining());
    }

    // pass delimiter
    private static String joining_2(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining("-"));
    }

    // accepts prefix and suffix
    private static String joining_3(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining("-","(",")"));
    }



    public static void main(String[] args) {
        System.out.println("Joinging_1 : "+ joining_1());
        System.out.println("Joinging_2 : "+ joining_2());
        System.out.println("Joinging_3 : "+ joining_3());
    }
}
