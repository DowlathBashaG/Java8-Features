package io.dowlath.streams;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @Author Dowlath
 * @create 5/27/2020 5:42 PM
 */
/*
     flatMap ... converts (transforms) one type to another as like map() method.

     Used in the context of stream , where each element in the stream represents multiple elements.

     Example :
              Each stream element represent multiple elements.

              1. Stream<List>
              2. Stream<Arrays>

     a. distinct  -> unique
     b. count     -> returns long
     c. sorted  -> orders.(alphabetical order)

 */
public class StreamFlatMap_Distinct_Count_Sorted {

    private static List<String> printListofStudentActivities(){
        List<String>  studentActivities = StudentDataBase.getAllStudents()  // Stream<Student>
                       .stream().map(Student::getActivities)   // Stream<List<String>>
                       .flatMap(List::stream) // Stream<String>
                       .distinct()
                       .sorted()
                       .collect(toList());
        return studentActivities;
    }

    private static long printNoofStudentActivities(){
      long studentNoOfActivities = StudentDataBase.getAllStudents()  // Stream<Student>
                .stream().map(Student::getActivities)   // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .count();
        return studentNoOfActivities;
    }

    public static void main(String[] args) {
        System.out.println("printStudentActivitiesUsingFlatMap ... : "+ printListofStudentActivities());
        System.out.println("printStudentNoOfActivitiesUsingFlatMap ... : "+ printNoofStudentActivities());
    }
}

