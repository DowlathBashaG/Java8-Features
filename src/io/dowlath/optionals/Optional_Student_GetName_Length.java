package io.dowlath.optionals;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.Optional;

/**
 * @Author Dowlath
 * @create 5/28/2020 3:10 PM
 */
public class Optional_Student_GetName_Length {

    private static String getStudentName(){
     //Student student = StudentDataBase.studentSupplier.get();
       Student student = null;
      if(student != null){
          return student.getName();
      }
       return null;
    }

    private static Optional<String> getStudentNameOptional(){
      // Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);//Optional.empty();
       if(studentOptional.isPresent()){
           studentOptional.get(); // return Student Object
           return studentOptional.map(Student::getName);
       }
         return  Optional.empty(); // represent an optional object with no value.
    }


    public static void main(String[] args) {
      /*  String name = getStudentName();
        if(name != null) {
            System.out.println("Length of the student name ... : " + name.length());
        } else{
            System.out.println("Name not found ");
        }
       */

        Optional<String> stringOptional = getStudentNameOptional();

        if(stringOptional.isPresent()){
            System.out.println("Length of the student name(Optional) ... :" +
                    stringOptional.get().length()); // String which is student name and length
        }else{
            System.out.println("Name not found ");
        }



    }
}
