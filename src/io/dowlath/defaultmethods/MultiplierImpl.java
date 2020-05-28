package io.dowlath.defaultmethods;

import java.util.List;

/**
 * @Author Dowlath
 * @create 5/28/2020 8:36 PM
 */
public class MultiplierImpl implements Multiplier{

    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream().reduce(1,(x,y) -> x*y);

    }
    // methods can be overridden
    public int size(List<Integer> integerList){
        System.out.println("Inside MultiplierImpl class");
        return integerList.size();
    }
}
