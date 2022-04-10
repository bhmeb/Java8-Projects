package functionalInterface.Consumer;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        /**
         * Prior of java 8
         *
         * */

        Consumer<String> consumer2 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        };
        consumer2.accept("INPUT");

        /**
         * Prior of java 8 with lambda
         *
         * */
        Consumer<String> consumer = (s) -> {System.out.println(s.toUpperCase());};
        consumer.accept("java8");
    }
}
