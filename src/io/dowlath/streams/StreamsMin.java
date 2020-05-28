package io.dowlath.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Author Dowlath
 * @create 5/27/2020 9:40 PM
 */
public class StreamsMin {
    private static int findMinValue(List<Integer> integerList){
        // 6 -> y
        // 7 -> y
        // 8 -> y
        // 9 -> y
        // 10 -> y
        // x variable holds the max value for each element in the iteration
        return integerList.stream().reduce(0,(x,y) -> x < y ? x:y);
    }

    private static Optional<Integer> findMinValueOptional(List<Integer> integerList){
        return integerList.stream().reduce((x,y) -> x < y ? x:y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        //List<Integer> integerListOptional = new ArrayList<>();

       // int minValue = findMinValue(integerList);
      //  System.out.println("Min value is ... : "+ minValue);

        Optional<Integer> optionalInteger = findMinValueOptional(integerList);
        System.out.println("min Value ... : "+ optionalInteger);
        if(optionalInteger.isPresent()){
            System.out.println("Min Value using optional .... : "+ optionalInteger.get());
        } else{
            System.out.println("No min value found .");
        }

    }
}
