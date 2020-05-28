package io.dowlath.optionals;

import java.util.Optional;

/**
 * @Author Dowlath
 * @create 5/28/2020 3:24 PM
 */
public class OptionalOfEmptyNullable {
    public static Optional<String> ofNullable(){
        Optional<String>  stringOptional = Optional.ofNullable("Hello");
        return stringOptional;

    }
    public static Optional<String> ofNullableWithNullValue(){
        Optional<String>  stringOptionalNull = Optional.ofNullable(null);
        return stringOptionalNull;
    }

    public static Optional<String> of(){
        // of method always expecting value inside of method. if you pass null will return null pointer exception.
        // but ofNullable will send null it wont through null pointer exception. it will give empty value.
        Optional<String>  stringOf = Optional.of("Hello");
        return stringOf;
    }
    public static Optional<String> empty(){
        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println("OfNullable without null...: "+ofNullable());
        // How to get the value from Optional wrapping.
        //System.out.println("OfNullable without null...: "+ofNullable().get());
       // System.out.println("OfNullable without argu...: "+ofNullable().isPresent());  // returns false

       // System.out.println("OfNullable with null...: "+ofNullableWithNullValue());
        // How to get the value from Optional wrapping.
       // System.out.println("OfNullable with null...: "+ofNullableWithNullValue().get());
       // System.out.println("OfNullable without null...: "+ofNullableWithNullValue().isPresent());  // returns false

        System.out.println("Of ...: "+of());
       // System.out.println("Of ...: "+of().isPresent());  // returns false
        System.out.println("empty ...: "+empty());


    }
}
