package io.dowlath.streams;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @Author Dowlath
 * @create 5/27/2020 6:06 PM
 */
public class StreamsComparatorExample {

    private static List<Student> printStudentsSortByName(){
        return StudentDataBase.getAllStudents().stream()
                 .sorted(Comparator.comparing(Student::getName))
                 .collect(toList());
    }
    private static List<Student> printSortByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());
    }

    private static List<Student> printSortByGpaDesc(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println("Print sorts by students name ... :");
        printStudentsSortByName().forEach(System.out::println);

        System.out.println("\nPrint sorts by students GPA name ... :");
        printSortByGpa().forEach(System.out::println);

        System.out.println("\nPrint sorts by students GPA name reverse order... :");
        printSortByGpaDesc().forEach(System.out::println);
    }

}
