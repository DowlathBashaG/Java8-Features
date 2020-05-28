package io.dowlath.streams;

import io.dowlath.data.StudentDataBase;

/**
 * @Author Dowlath
 * @create 5/27/2020 10:03 PM
 */

/*
     anyMatch() , allMatch(), noneMatch()

     All these functions takes in a predicate as an input are returns a Boolean as an output.

     anyMatch : returns true if any one of the element matches the predicate, otherwise false.

     allMatch : returns true if all the element matches the predicate, otherwise false.

     noneMatch : just opposite to allMatch() , returns true if non of the element in the stream
                 matches the predicate, otherwise false.

 */

public class Stream_AnyMatch_AllMatch_NoneMatch {

    public static boolean allMatch(){
       return StudentDataBase.getAllStudents().stream()
                  .allMatch(student -> student.getGpa() >= 3.5); // 3.9 it return false,
                                                                // but if you give 3.5 will return true
    }

    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa() >= 3.9); // 3.9 it return true,
                                                              // but if you give 4.1  will return false
    }

    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa() >= 4.0); // 4.1 it return true,4.0 returns false

    }
    public static void main(String[] args) {
        System.out.println( "Result of allMatch ... : "+ allMatch());
        System.out.println( "Result of anyMatch ... : "+ anyMatch());
        System.out.println( "Result of noneMatch ... : "+ noneMatch());
    }
}
