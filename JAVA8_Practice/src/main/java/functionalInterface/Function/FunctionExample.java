package functionalInterface.Function;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();

    static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat(" default");

    public static void main(String[] args) {

        System.out.println("Result is :" + function.apply("java8"));

        //It will return the result - "JAVA8 Relesed".
        System.out.println("Result is :" + function.andThen(addSomeString).apply("java8"));

        //What compose method does -
        //It will do first addSomeString operation, and then it will returne to name.toUpperCase()
        //Finally it will return the result - JAVA8 RELESED.
        System.out.println("Result is :" + function.compose(addSomeString).apply("java8"));
    }
}

//AndThen - Execute the functions the order it is mentioned.
//Compose - Execute the first parameter in compose method then execute the outer function.
