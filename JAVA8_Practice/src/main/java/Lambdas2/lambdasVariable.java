package Lambdas2;

import java.util.function.Consumer;

public class lambdasVariable {

    public static void main(String[] args) {

        int i = 0;

        Consumer<Integer> consumer = i1 -> {  //Here is the issue i. to fix it use i1
            System.out.println("value of i is: " + i);
        };
    }
}
