package io.dowlath.lambdas;

import java.util.function.Consumer;

/**
 * @Author Dowlath
 * @create 5/27/2020 3:09 AM
 */

/*
    Lambda's have some restrictions on using local variables.

    1. Not allowed to use the same the local variable name as
       lambda parameters or inside the lambda body.

    2. Not allowed re-assign a value to a local variable.

    3. No restrictions on instance variables.
       instance variable or class variable (static)  we can use and modified inside lambda functions.

   Effectively Final :
   ================

   Lambda's are allowed to use local variables but not allowed to modify it even though they are not
   declared final. This concept is called Effectively final.

   Not allowed to modify the value inside the lambda.

   int value=4;
   Consumer<Integer> c1 = (a) -> {
   // value = 6; // reassigning not allowed
   // System.out.println(++value);

   Note :

   prior java8 , any variable that's used inside the anonymous class should be declared final.

   Advantages of effectively final :

   Easy to perform concurrency operations.

   Promotes Functional Programming and demotes the Imperative Style Programming.

  */


public class LambdaVariable_Not_Allowed_Local {
    public static void main(String[] args) {
        int i= 0;
        Consumer<Integer> c1 = i1 ->{
            System.out.println(i1);
        };

    }
}
