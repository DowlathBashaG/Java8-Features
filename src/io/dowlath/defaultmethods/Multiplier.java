package io.dowlath.defaultmethods;

import java.util.List;

/**
 * @Author Dowlath
 * @create 5/28/2020 8:36 PM
 */
public interface Multiplier {

    int multiply(List<Integer> integerList);

    // methods can be overridden
    default int size(List<Integer> integerList){
        System.out.println("Inside Multiplier Interface");
        return integerList.size();
    }
    // can not be overridden
    static boolean isEmpty(List<Integer> integerList){
        return integerList!=null && integerList.size()>0;
    }
}
