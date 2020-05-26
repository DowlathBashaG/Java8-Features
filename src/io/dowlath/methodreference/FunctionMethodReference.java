package io.dowlath.methodreference;

import java.util.function.Function;

/**
 * @Author Dowlath
 * @create 5/27/2020 2:36 AM
 */
public class FunctionMethodReference {
    static Function<String,String> toUpperCaseLambda = s -> s.toUpperCase();
    static Function<String,String> toUpperCaseMethodReference = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("Dowlath"));
        System.out.println(toUpperCaseMethodReference.apply("Dowlath"));
    }
}
