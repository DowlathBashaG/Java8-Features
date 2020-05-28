package io.dowlath.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @Author Dowlath
 * @create 5/28/2020 12:00 AM
 */
public class NumericStreams_IntStream {
    private static int sumOfIntegers(List<Integer> list){
        return IntStream.rangeClosed(1,6).sum();
    }
    public static void main(String[] args) {
        List<Integer> sumOfNumbers = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Sum of N numbers ... :" +sumOfIntegers(sumOfNumbers));

        IntStream intStream = IntStream.range(1,50);
        System.out.print("Range Count : "+ intStream.count());
        System.out.println("\n");

        IntStream.range(1,50).forEach(value -> System.out.print(value+","));

        System.out.print("\nRange closed Count : "+ IntStream.rangeClosed(1,50).count());
        System.out.println("\n");
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value+","));

    }
}
