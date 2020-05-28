package io.dowlath.streams;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Author Dowlath
 * @create 5/27/2020 7:54 PM
 */
public class StreamsReducedExample {
    public static int performMultiplication(List<Integer> integerList){
        // 1
        // 3
        // 5
        // 7
        // a = 1, b = 1 ( from stream )  => result is 1
        // a = 1, b = 3 ( from stream )  => result is 3
        // a = 3, b = 5 ( from stream )  => result is 15
        // a = 15, b = 7 ( from stream )  => result is 105
       return integerList.stream().reduce(1,(a,b) -> a*b);

    }

    public static Optional<Integer> performMultiplicationWithIdentity(List<Integer> integerList){

        return integerList.stream().reduce((a,b) -> a*b);

    }

    /*
        This is famous patern mapReduce pattern.
     */
    private static int noOfBooks(){
        int noOfBooks = StudentDataBase.getAllStudents().stream()
                        .filter(student -> student.getGradeLevel() >= 2)
                        .filter(student -> student.getGender().equals("female"))
                        .map(Student::getNoteBooks)
                        .reduce(0,Integer::sum);
        return noOfBooks;

    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,7);
        System.out.println(performMultiplication(list));
        Optional<Integer>  result = performMultiplicationWithIdentity(list);
        System.out.println(result.isPresent());
        System.out.println(result.get());
        System.out.println("NoofBooks.... : "+ noOfBooks());

    }
}
