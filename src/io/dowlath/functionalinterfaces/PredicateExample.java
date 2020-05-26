package io.dowlath.functionalinterfaces;

import java.util.function.Predicate;

/**
 * @Author Dowlath
 * @create 5/27/2020 12:21 AM
 */
/*
     Predicate(...)
      functions :
                    1. test
                    2. and
                    3. or
                    4. negate
 */
public class PredicateExample {

    private static Predicate<Integer> p1 = i -> i%2 == 0;
    private static Predicate<Integer> p2 = i -> i%5 == 0;

    private static void predicateAnd(){
        System.out.println(" Predicate AND result is ... : "+ p1.and(p2).test(10)); // predicate chaining
        System.out.println(" Predicate AND result is ... : "+ p1.and(p2).test(9)); // predicate chaining
    }

    private static void predicateOr(){
        System.out.println(" Predicate OR result is ... : "+ p1.or(p2).test(10)); // predicate chaining
        System.out.println(" Predicate OR result is ... : "+ p1.or(p2).test(9)); // predicate chaining
    }

    // negate is reverse , ie if it true will give false , if it is false will give true
    private static void predicateNegate(){
        System.out.println(" Predicate NEGATE result is ... : "+ p1.or(p2).negate().test(8)); // predicate chaining
    }
    public static void main(String[] args) {
        System.out.println(p1.test(4));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }

}
