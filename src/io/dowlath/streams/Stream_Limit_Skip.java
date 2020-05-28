package io.dowlath.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Author Dowlath
 * @create 5/27/2020 9:50 PM
 */

/*
   Short circuit operations limit and skip. ( like : if first block is true it wont execute next one : && , || )

   These two function helps to create a sub-stream.

    limit(n)  -> limits the "n" number of elements to be processed in the stream
    skip(n) -> skips "n" number of elements from the stream

 */
public class Stream_Limit_Skip {
     public static Optional<Integer> limit(List<Integer> integers){

         return integers.stream()  // stream is passing 6,7,8,9,10
                 .limit(2).reduce((x,y) -> x+y);   // o/p : 13 ( ie 6 + 7 )
     }
    public static Optional<Integer> skip(List<Integer> integers){

        return integers.stream()  // stream is passing 6,7,8,9,10
                .skip(3).reduce((x,y) -> x+y);   // o/p : 19 ( ie 9 + 10 )
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        Optional<Integer> limitResult = limit(integerList);
        if(limitResult.isPresent()){
            System.out.println("The limit result is ... : "+ limitResult.get());
        } else{
            System.out.println("No input is processed");
        }

        Optional<Integer> skipResult = skip(integerList);
        if(skipResult.isPresent()){
            System.out.println("The skip result is ... : "+ skipResult.get());
        } else{
            System.out.println("No input is processed");
        }
    }
}
