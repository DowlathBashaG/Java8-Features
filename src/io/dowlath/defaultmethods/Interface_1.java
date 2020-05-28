package io.dowlath.defaultmethods;

/**
 * @Author Dowlath
 * @create 5/28/2020 8:58 PM
 */
public interface Interface_1 {

    default void methodA(){
        System.out.println("Interface_1 : Inside methodA" + Interface_1.class);
    }
}
