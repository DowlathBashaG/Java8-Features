package io.dowlath.methodreference;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.function.Predicate;

/**
 * @Author Dowlath
 * @create 5/27/2020 2:51 AM
 */

public class RefactorMethodReference {
    static Predicate<Student> p1 = RefactorMethodReference::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student s){
       return  s.getGradeLevel() >= 3;
    }
    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
    }
}
