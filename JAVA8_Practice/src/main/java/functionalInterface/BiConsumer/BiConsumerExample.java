package functionalInterface.BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("a :" + a + ", b :" + b);
        };
        biConsumer.accept("JAVA", "Kotlin");


    BiConsumer<Integer, Integer> multiply = (x,y) -> {
        System.out.println("Multiplication :" + (x*y));
    };

    BiConsumer<Integer, Integer> division = (x,y) -> {
        System.out.println("Multiplication :" + (x/y));
    };

    multiply.andThen(division).accept(4,2);
    }
}
