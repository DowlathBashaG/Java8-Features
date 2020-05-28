package io.dowlath.streams;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.Optional;

/**
 * @Author Dowlath
 * @create 5/27/2020 10:16 PM
 */

/*
     findFirst() & findAny() : used to find an element in the stream

     both the functions returns the result of type Optional.

     findFirst() -> returns the first element in the stream.
     findAny() -> returns the first encountered element in the stream.


 */
public class Stream_FindFirst_FindAny {

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                 .filter(Student -> Student.getGpa() >= 3.9)
                 .findAny();
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(Student -> Student.getGpa() >= 3.9) // 4.1 not found
                .findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> studentOptionalFindAny = findAnyStudent();
        if(studentOptionalFindAny.isPresent()){
            System.out.print("Found the student ... : "+ studentOptionalFindAny.get());
        } else {
            System.out.print("Student Not found");
        }
        System.out.print("\n");
        Optional<Student> studentOptionalFindFirst = findFirstStudent();
        if(studentOptionalFindFirst.isPresent()){
            System.out.println("Find the first student ... : "+ studentOptionalFindFirst.get());
        } else {
            System.out.println("find first Student Not found");
        }
    }

}
