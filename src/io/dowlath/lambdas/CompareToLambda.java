package io.dowlath.lambdas;

import java.util.Comparator;

/**
 * @Author Dowlath
 * @create 5/26/2020 4:02 PM
 */
public class CompareToLambda {
    public static void main(String[] args) {

        // Prior java 8
        Comparator<Integer> comparator = new Comparator<>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);    // o1 == o2 -> 0, o1 > o2 = 1, o1 < o2 = -1
            }
        };

        System.out.println("Before Java8 Comparator : "+ comparator.compare(3,2));

        // Java 8

        Comparator<Integer> lambdaComparator = (a,b) ->  a.compareTo(b) ;

        System.out.println("Java8 Comparator ... : "+ comparator.compare(3,2));

    }
}