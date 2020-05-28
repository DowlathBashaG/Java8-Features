package io.dowlath.defaultmethods;

import io.dowlath.data.Student;
import io.dowlath.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author Dowlath
 * @create 5/28/2020 8:07 PM
 */
public class StudentNameSortByName {
    static Consumer<Student>  studentConsumer = student -> System.out.println(student);
    static Comparator<Student>  nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student>  gradeComparator = Comparator.comparing(Student::getGradeLevel);
    static Comparator<Student>  gpaComparator = Comparator.comparing(Student::getGpa);

    private static void sortByName(List<Student> students){
        students.sort(nameComparator);
        System.out.println("After sort.... :");
        students.forEach(studentConsumer);
    }

    private static void sortByGpa(List<Student> students){
        students.sort(gpaComparator);
        System.out.println("Sort By GPA.... :");
        students.forEach(studentConsumer);
    }

    private static void comparatorComparing(List<Student> studentList){
        System.out.println("After comparatorChaining....:");
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }
    // nullsLast & nullsFirst ( inside the Comparator these two methods are there )
    public static void sortWithNullValuesFirst(List<Student> studentList){
        System.out.println("After sortWithNullValuesFirst....");
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }
    // nullsLast & nullsFirst ( inside the Comparator these two methods are there )
    public static void sortWithNullValuesLast(List<Student> studentList){
        System.out.println("After sortWithNullValuesLast....");
        Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before sort... : ");
        studentList.forEach(studentConsumer);
        System.out.println("\n");
     //   sortByName(studentList);
        System.out.println("\n");
    //    sortByGpa(studentList);
        System.out.println("\n");
      //  comparatorComparing(studentList);
        System.out.println("\n");
        sortWithNullValuesFirst(studentList);
        System.out.println("\n");
        sortWithNullValuesLast(studentList);
    }
}
