package io.dowlath.optionals;

import io.dowlath.data.Bike;
import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.Optional;

/**
 * @Author Dowlath
 * @create 5/28/2020 7:28 PM
 */
public class OptionalMapFlatMap {

    // filter
    private static void optionalFilter(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());  // Optional<Student>
        studentOptional.filter(student -> student.getGpa() >= 3.5)
                            .ifPresent( student -> System.out.println(student));
    }
    // map
    private static void optionalMap(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());  // Optional<Student>
        if(studentOptional.isPresent()){
           Optional<String> studentOptional1 =  studentOptional.filter(student -> student.getGpa() >=3.5)
                    .map(Student::getName);
            System.out.println(studentOptional1.get());
        }
    }
    // flatMap
    private static void optionalFlatMap(){
        Optional<Student> studentOptional =
                   Optional.ofNullable(StudentDataBase.studentSupplier.get()); // Optional<Student>
        Optional<String> name = studentOptional.filter(student -> student.getGpa() >=3.5)  // Optional<Student<Optional<Bike>>
                       .flatMap(Student::getBike) // returns -> Optional<Bike>
                       .map(Bike::getName);
        System.out.println(name.get());

    }

    public static void main(String[] args) {
       optionalFilter();
       optionalMap();
       optionalFlatMap();
    }
}
