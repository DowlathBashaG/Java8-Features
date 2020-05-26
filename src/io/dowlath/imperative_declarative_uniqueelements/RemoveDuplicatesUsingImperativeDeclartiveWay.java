package io.dowlath.imperative_declarative_uniqueelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author Dowlath
 * @create 5/26/2020 3:12 PM
 */
public class RemoveDuplicatesUsingImperativeDeclartiveWay {
    public static void main(String[] args) {
        // imperative way
        List<Integer> integerList = Arrays.asList(1,2,3,3,4,4,4,5,5,6,6,7,7,7,7,8,9,10,10,10);

        List<Integer> uniqueList = new ArrayList<>();

        for(Integer integer : integerList){
            if( !uniqueList.contains(integer)){
                uniqueList.add(integer);
            }
        }
        System.out.println("Imperative way ... : " + uniqueList);

        // Declartive way

        List<Integer> declartiveWay = integerList.stream()
                                      .distinct()
                                      .collect(Collectors.toList());

        System.out.println("Declartive way ... : "+ declartiveWay);

    }


}
;