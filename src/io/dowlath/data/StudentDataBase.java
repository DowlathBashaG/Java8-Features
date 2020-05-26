package io.dowlath.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Author Dowlath
 * @create 5/26/2020 4:22 PM
 */
public class StudentDataBase {

    public static Supplier<Student> studentSupplier = () -> {
       return new Student("Adam",
                2,3.6,"male", Arrays.asList("Swimming","BasketBall","VolleryBall"));
    } ;

      /* Totally 6 students in this database */

    public static List<Student> getAllStudents(){
        /*
          2nd Grade Students
         */
        Student student1 = new Student("Dowlath",
                  2,3.6,"male", Arrays.asList("Swimming","BasketBall","VolleryBall"));
        Student student2 = new Student("Naveeda",
                2,3.8,"female", Arrays.asList("Swimming","Gymnastics","Soccer"));
         /*
          3rd Grade Students
         */
        Student student3 = new Student("Lalitha",
                3,4.0,"fmale", Arrays.asList("Swimming","Gymnastics","Aerobics"));
        Student student4 = new Student("Arsh",
                3,3.9,"male", Arrays.asList("Swimming","Gymnastics","Soccer"));

          /*
          4th Grade Students
         */
        Student student5 = new Student("Sophie",
                4,3.5,"fmale", Arrays.asList("Swimming","Dancing","Aerobics"));
        Student student6 = new Student("Ariz",
                4,3.9,"male", Arrays.asList("Swimming","Gymnastics","Soccer","BaseBall"));

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);
        return students;
    }
}
