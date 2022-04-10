package Lambdas2;

import java.util.function.Consumer;

public class lambdasVariable2 {

    public static void main(String[] args) {
        int value = 4;
        Consumer<Integer> consumer = i ->{
            //value++; //ressign is not allowed in lambda scope
            System.out.println(value + i);
        };

        //value = 10; //error - local variables referenced from a lambda expression must be final or effectively final
        consumer.accept(4);
    }

}
