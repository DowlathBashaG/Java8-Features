package io.dowlath.functionalinterfaces;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Author Dowlath
 * @create 5/27/2020 2:25 AM
 */
/*
      Supplier(...) it wont take any input but it return.
      functions :
                    1. get

      Note: It just opposite consumer.
 */
public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Student> studentSupplier = () -> {
            return new Student("Adam",2,3.6,"male", Arrays.asList("Swiming","BasketBall","VolleyBall"));
        };
        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

        System.out.println("Student is ... : "+ studentSupplier.get());
        System.out.println("Students List  ... : "+ listSupplier.get());
    }
}
