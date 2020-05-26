package io.dowlath.functionalinterfaces;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

/**
 * @Author Dowlath
 * @create 5/27/2020 12:42 AM
 */
public class PredicateStudentExample {
    static Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = s -> s.getGpa() >= 3.9;
    static List<Student> studentList = StudentDataBase.getAllStudents();

    private static void filterStudentsByGradeLevel(){
        System.out.println("Filter Students By GradeLevel ");
        studentList.forEach( student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }

    private static void filterStudentsByGpaLevel(){
        System.out.println("Filter Students By Gpa ");
        studentList.forEach(student -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        });
    }

    private static void filterStudentsByGradeLevelAndGpaLevel(){
        System.out.println("Filter Students By GradeLevel and Gpa Level ");
        studentList.forEach(student -> {
               if(p1.and(p2).test(student)){
                   System.out.println(student);
                    }
                }
        );
    }
    public static void main(String[] args) {
        filterStudentsByGradeLevel();
        filterStudentsByGpaLevel();
        filterStudentsByGradeLevelAndGpaLevel();
    }

}
