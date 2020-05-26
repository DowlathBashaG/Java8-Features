package io.dowlath.lambdas;

/**
 * @Author Dowlath
 * @create 5/26/2020 3:42 PM
 */
public class RunnableLambdaExample {
    public static void main(String[] args) {

        // legacy way...
        Runnable runnable1 = new Runnable(){
            public void run(){
                System.out.println("Inside Runnable run ...1");
            }
        };

        new Thread(runnable1).start();

        // with Lambda () -> {}
        Runnable runnable2 = () -> {
            System.out.println("Inside Lambda runnable ... 2");
        };

        new Thread(runnable2).start();

    }
}
