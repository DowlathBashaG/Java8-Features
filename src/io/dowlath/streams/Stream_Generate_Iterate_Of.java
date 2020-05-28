package io.dowlath.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @Author Dowlath
 * @create 5/27/2020 10:36 PM
 */
public class Stream_Generate_Iterate_Of {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("adam","dan","juie");
        stringStream.forEach(System.out::println);

        // without limit its keep on execute infinite loop.It will show only 10 elements.
        Stream.iterate(1,x -> x*2).limit(10).forEach(System.out::println);

        // without limit , its keep on generating random numbes. Now limit is 5 , so only it will show 5 numbers
        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier).limit(5).forEach(System.out::println);
    }
}
