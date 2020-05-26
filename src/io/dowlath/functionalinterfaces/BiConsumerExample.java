package io.dowlath.functionalinterfaces;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * @Author Dowlath
 * @create 5/26/2020 11:53 PM
 */

/* accepts two input -> Consumer(...)

       functions :
                    1. accept( T1 t1, T2 t2 )
                    2. andThen

 */
public class BiConsumerExample {

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name,activities) -> System.out.println(name+ " ... "+ activities);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach( student -> {
            biConsumer.accept(student.getName(), student.getActivities() );
        });
    }

    public static void main(String[] args) {

        BiConsumer<String,String> biConsumer = (a,b) -> {
            System.out.println("a..:" +a +", "+ "b.."+b);
        };
        biConsumer.accept("java7","java8");

        BiConsumer<Integer,Integer> multiplication = (a,b) ->
        {
            System.out.println("Multipliation : " +a*b);
        };

        BiConsumer<Integer,Integer> divison = (a,b) ->
        {
            System.out.println("Divison : " +a/b);
        };

        multiplication.andThen(divison).accept(6,3);

        nameAndActivities();
    }


}
