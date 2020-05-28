package io.dowlath.defaultmethods;

/**
 * @Author Dowlath
 * @create 5/28/2020 9:10 PM
 */

/*
      Note:

          if you have similar methods in both interface  for example here

          Interface_1 :
              default void methodA(){
              System.out.println("Interface_1 : Inside methodA" + Interface_1.class);
               }

           AND interface_3 also having the same method.

          Interface_4 :
              default void methodA(){
              System.out.println("Interface_1 : Inside methodA" + Interface_1.class);
               }

         in this case compiler issue will come in the implementation class.

         So overcome this issue , you need to implement the same method in client class.

         like,

           public void methodA(){
             System.out.println("Interface_4 : Inside methodA" + Client_1_4.class);
            }

        Result :

        then only resolve this issue.

 */
public class Client_1_4 implements Interface_1,Interface_4 {
    public void methodA(){
        System.out.println("Interface_4 : Inside methodA" + Client_1_4.class);
    }

    public static void main(String[] args) {
        Client_1_4 client14 = new Client_1_4();
        client14.methodA();
    }
}
