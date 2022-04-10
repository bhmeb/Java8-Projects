package StreamAPI.NumericStream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {

        IntStream intStream = IntStream.range(1,50);
        LongStream longStream = LongStream.range(1,50);

        System.out.println("Int Stream Range Count: " + intStream.count());
        IntStream.range(1,50).forEach(value -> System.out.print(value + ","));

        System.out.println();
        System.out.println("Int Stream RangeClosed Count " + IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value + ","));


        System.out.println();
        System.out.println("Long Stream Range Count: " + longStream.count());
        LongStream.range(1,50).forEach(value -> System.out.print(value + ","));

        System.out.println();
        System.out.println("Long Stream RangeClosed Count " + LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value + ","));


        System.out.println("Double Stream with Range count");
        IntStream.range(1,50).asDoubleStream().forEach(value -> System.out.print(value + ","));
        IntStream.rangeClosed(1,50).asDoubleStream().forEach(value -> System.out.print(value + ","));

    }
}
