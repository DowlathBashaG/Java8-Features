package io.dowlath.defaultmethods;

/**
 * @Author Dowlath
 * @create 5/28/2020 9:01 PM
 */
public class InterfaceImple_1_2_3 implements Interface_1,Interface_2,Interface_3{

    public void methodA(){
        System.out.println("Interface_1 : Inside methodA" + InterfaceImple_1_2_3.class);
    }

    //  1 -> class the implements the interface
    //  2 -> the sub interface that extends the interface.

    public static void main(String[] args) {
        InterfaceImple_1_2_3 client123 = new InterfaceImple_1_2_3();
        client123.methodA();  //  resolve to the child implementation
        client123.methodB();
        client123.methodC();
    }

}
