package io.dowlath.functionalinterfaces;

import java.util.function.Function;

/**
 * @Author Dowlath
 * @create 5/27/2020 1:24 AM
 */
/*
     Function methods ,

           1. apply
           2. andThen
           3. compose
 */

public class FunctionExample {

    static Function<String,String> function = name -> name.toUpperCase();
    static Function<String,String> addSomeThing = name -> name.toUpperCase().concat("default");

    public static void main(String[] args) {
        System.out.println("Result is ... : "+ function.apply("Dowlath"));
        System.out.println("Result of andThen is ... : "+ function.andThen(addSomeThing).apply("java8"));
        //compose is working as follows parameters first and then function the word
        System.out.println("Result of andThen is ... : "+ function.compose(addSomeThing).apply("java8"));
    }

}
