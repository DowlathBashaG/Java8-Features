package io.dowlath.functionalinterfaces;

/**
 * @Author Dowlath
 * @create 5/27/2020 1:33 AM
 */
public class FunctionCallingFunctionExample {
    public static String performConcat(String str){
       return FunctionExample.addSomeThing.apply(str);
    }
    public static void main(String[] args) {
        String result = performConcat("Hello");
        System.out.println(result);
    }
}
