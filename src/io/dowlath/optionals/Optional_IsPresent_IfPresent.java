package io.dowlath.optionals;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Optional;

/**
 * @Author Dowlath
 * @create 5/28/2020 7:22 PM
 */
public class Optional_IsPresent_IfPresent {

    public static void main(String[] args) {
        //isPresent -> just telling is present or not.
        Optional<String> optional = Optional.ofNullable("Hello Optional");
        System.out.println(optional.isPresent());
        if(optional.isPresent()){
            System.out.println(optional.get());
        }
        //ifPresent  -> but it is telling value is present or not and it is performating additional operations.
       optional.ifPresent(s -> System.out.println(s));
    }
}
