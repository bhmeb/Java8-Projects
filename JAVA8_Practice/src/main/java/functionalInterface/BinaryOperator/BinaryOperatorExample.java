package functionalInterface.BinaryOperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    //When BinaryOperator is applicable -
    //The Inputes and Outputes of the same type then you use BinaryOperator.

    static Comparator<Integer> comparator =   (a,b) -> a.compareTo(b);
    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;
        System.out.println(binaryOperator.apply(3,4));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Result of MaxBy: " + maxBy.apply(4,5));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("Result of MinBy: " + minBy.apply(4,5));

    }
}
