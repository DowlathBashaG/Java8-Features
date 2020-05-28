package io.dowlath.defaultmethods;

import java.util.Arrays;
import java.util.List;

/**
 * @Author Dowlath
 * @create 5/28/2020 8:39 PM
 */
public class MultiplierClient {
    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(1,3,5);
        System.out.println("Result is ... : "+ multiplier.multiply(integerList));
        System.out.println("Default method size is  ... : "+ multiplier.size(integerList));
        System.out.println("statci method isEmpty is  ... : "+ Multiplier.isEmpty(integerList));
    }
}
