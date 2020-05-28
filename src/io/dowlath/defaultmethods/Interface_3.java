package io.dowlath.defaultmethods;

/**
 * @Author Dowlath
 * @create 5/28/2020 8:58 PM
 */
public interface Interface_3 extends Interface_2{

    default void methodC(){
        System.out.println("Interface_3 : Inside methodC");
    }
}
