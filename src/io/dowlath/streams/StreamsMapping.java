package io.dowlath.streams;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

/**
 * @Author Dowlath
 * @create 5/28/2020 12:31 AM
 */
public class StreamsMapping {

    public static void main(String[] args) {
        List<String> namesList = StudentDataBase.getAllStudents().stream()
                .collect(mapping(Student::getName,toList()));
        System.out.println("nameList ... :"+ namesList);

        Set<String> namesSet = StudentDataBase.getAllStudents().stream()
                .collect(mapping(Student::getName,toSet()));

        System.out.println("nameSet ... :"+ namesSet);
    }
}
