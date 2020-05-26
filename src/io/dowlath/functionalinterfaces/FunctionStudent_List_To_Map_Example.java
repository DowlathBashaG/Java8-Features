package io.dowlath.functionalinterfaces;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @Author Dowlath
 * @create 5/27/2020 1:54 AM
 */
public class FunctionStudent_List_To_Map_Example {
    static Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
    static Function<List<Student>, Map<String,Double>> listMapFunction = (students ->{
        Map<String,Double> studentGradeMap = new HashMap<>();
        students.forEach((student ->{
            if(p1.test(student)){
                studentGradeMap.put(student.getName(),student.getGpa());
            }
        }));
        return studentGradeMap;
    });

    public static void main(String[] args) {
        System.out.println(listMapFunction.apply(StudentDataBase.getAllStudents()));
    }
}
