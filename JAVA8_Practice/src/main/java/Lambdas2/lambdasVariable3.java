package Lambdas2;

import java.util.function.Consumer;

public class lambdasVariable3 {

   static int value = 4; //instance variable or class variable

    public static void main(String[] args) {

        Consumer<Integer> consumer = i ->{
            value++;
            System.out.println(value + i);
        };

        consumer.accept(4);
    }

}