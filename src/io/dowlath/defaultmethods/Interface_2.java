package io.dowlath.defaultmethods;

/**
 * @Author Dowlath
 * @create 5/28/2020 8:58 PM
 */
public interface Interface_2 extends Interface_1{

    default void methodB(){
        System.out.println("Interface_2 : Inside methodB");
    }
    default void methodA(){
        System.out.println("Interface_1 : Inside methodA" + Interface_2.class);
    }

}
