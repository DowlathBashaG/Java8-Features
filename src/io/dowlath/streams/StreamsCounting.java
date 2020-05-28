package io.dowlath.streams;

import io.dowlath.data.StudentDataBase;

import static java.util.stream.Collectors.counting;

/**
 * @Author Dowlath
 * @create 5/28/2020 12:29 AM
 */
public class StreamsCounting {
    private static long count(){
        return StudentDataBase.getAllStudents().stream()
                   .filter(student -> student.getGpa() >=3.9)
                   .collect(counting());
    }
    public static void main(String[] args) {
        System.out.println(count());
    }
}
