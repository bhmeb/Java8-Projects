package StreamAPI.FactoryMethod;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

    public static void main(String[] args) {

        //of() method
        Stream<String> stringStream = Stream.of("adam", "dan", "julie");
        stringStream.forEach(System.out::println);


        //iterate() method
        //Stream.iterate(1, x->x*2).forEach(System.out::println); //It will execute infinite time. To solve it use limit()
        Stream.iterate(1, x->x*2)
                .limit(5)
                .forEach(System.out::println);

        //generate() method
        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(5)
                .forEach(System.out::println);

    }
}
