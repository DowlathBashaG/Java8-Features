package io.dowlath.streams;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

/**
 * @Author Dowlath
 * @create 5/28/2020 10:36 AM
 */
public class StreamsGroupingBy {

    private static void groupStudentsByGender(){
        Map<String, List<Student>> map = StudentDataBase.getAllStudents().stream()
                 .collect(groupingBy(Student::getGender));
        System.out.println(map);

    }
    private static void customizedGroupBy(){
        Map<String, List<Student>> map = StudentDataBase.getAllStudents().stream() // Stream<Student>
                .collect(groupingBy( student -> student.getGpa() >= 3.8 ? "OUT-STANDING" : "AVERAGE"));
        System.out.println(map);

    }
    private static void groupingLevel_1(){
        Map<Integer, Map<String,List<Student>>> map = StudentDataBase.getAllStudents().stream() // Stream<Student>
                .collect(groupingBy(Student::getGradeLevel,groupingBy(student -> student.getGpa() >= 3.8 ? "OUT-STANDING" : "AVERAGE")));
        System.out.println(map);
    }
    private static void groupingLevel_2(){
        Map<Integer, Integer> map = StudentDataBase.getAllStudents().stream() // Stream<Student>
                .collect(groupingBy(Student::getGradeLevel,summingInt(Student::getNoteBooks)));
        System.out.println(map);
    }

    private static void threeArgumentGroupingLevel(){
        LinkedHashMap<String, Set<Student>>studentLinkedHashMap = StudentDataBase.getAllStudents().stream() // Stream<Student>
                           .collect(groupingBy(Student::getName,LinkedHashMap::new,toSet()));

        System.out.println(studentLinkedHashMap);
    }

    private static void calculateTopGpa(){
        Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentMapOptional);

        Map<Integer, Student> studentMapOptional_removed_optional_object = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),
                                Optional::get)));
        System.out.println(studentMapOptional_removed_optional_object);
    }

    private static void calculateLeastGpa(){
        Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,minBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentMapOptional);

        Map<Integer, Student> studentMapOptional_removed_optional_object = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa)),
                                Optional::get)));
        System.out.println(studentMapOptional_removed_optional_object);
    }

    public static void main(String[] args) {
       //groupStudentsByGender();
       // customizedGroupBy();
      //  groupingLevel_1();
      //  groupingLevel_2();
       // threeArgumentGroupingLevel();
      //  calculateTopGpa();
        calculateLeastGpa();
    }
}
