package io.dowlath.optionals;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.Optional;

/**
 * @Author Dowlath
 * @create 5/28/2020 7:10 PM
 */
public class Optional_OrElse_OrElseGet_OrElseThrow {
    //orElse
    public static String optionalOrElse(){
       // Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null); // Option.empty
       String name = studentOptional.map(Student::getName).orElse("Default");
       return name;
    }

    //orElseGet
    public static String optionalOrElseGet(){
         Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
       // Optional<Student> studentOptional = Optional.ofNullable(null); // Option.empty
        String name = studentOptional.map(Student::getName).orElseGet(() -> "Default"); // supplier does not take any
                                                                      // input and return value.
        return name;
    }

    //orElseThrow
    public static String optionalOrElseThrow(){
       // Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null); // Option.empty
        String name = studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("No Data Available")); // supplier does not take any
        // input and return value.
        return name;
    }
    public static void main(String[] args) {
        System.out.println("OrElse ... :"+optionalOrElse());
        System.out.println("OrElseGet ... :"+optionalOrElseGet());
        System.out.println("OrElseThrow ... :"+optionalOrElseThrow());
    }
}
