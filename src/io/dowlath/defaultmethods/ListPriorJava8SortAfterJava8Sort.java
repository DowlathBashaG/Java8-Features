package io.dowlath.defaultmethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author Dowlath
 * @create 5/28/2020 7:59 PM
 */
public class ListPriorJava8SortAfterJava8Sort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Dowlath", "Naveeda","Ariz","Arsh");
        // prior Java8
        Collections.sort(names);
        System.out.println("Prior Java8 Sort Ascending Order Names ... :" + names);

        // In Java8 onwards.... because of default method for sort()
        names.sort(Comparator.naturalOrder());
        System.out.println("Java8 Sort Ascending Order Names ... :" + names);

        // reverseOrder ...because of default method for sort()
        names.sort(Comparator.reverseOrder());
        System.out.println("Java8 Sort Descending Order Names ... :" + names);

    }
}
