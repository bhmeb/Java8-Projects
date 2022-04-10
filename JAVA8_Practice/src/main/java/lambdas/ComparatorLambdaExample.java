package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        /*
         * Prior Java 8
         * */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);  //return 0 -> o1 == o2
                                          //return 1 -> o1>o2
                                          //return -1 -> o1<o2
            }
        };
        System.out.println("Result of the comparator is: " + comparator.compare(4,3));

        /*
         * Java 8 with Lambda
         * */

        Comparator<Integer> comparator1 = (o1, o2) -> { return o1.compareTo(o2);};
        System.out.println("Result of the comparator using lambda: " + comparator.compare(4,3));

        Comparator<Integer> comparator2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println("Result of the comparator using lambda2: " + comparator.compare(2,3));
    }
}
