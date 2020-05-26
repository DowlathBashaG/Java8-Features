package io.dowlath.constructorreference;

import io.dowlath.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Author Dowlath
 * @create 5/27/2020 3:00 AM
 */
/*
    output :

    Student{name='null', gradeLevel=0, gpa=0.0, gender='null', activities=null}
   Student{name='Dowlath', gradeLevel=0, gpa=0.0, gender='null', activities=null}

 */
public class ConstructorReferenceExample {
    static Supplier<Student> studentSupplier = Student::new;
    static Function<String,Student> studentFunction = Student::new;

    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println(studentFunction.apply("Dowlath"));
    }
}
