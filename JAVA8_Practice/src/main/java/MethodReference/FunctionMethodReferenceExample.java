package MethodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    public static Function<String, String> toUpperCaselambda = (s) -> s.toUpperCase();
    public static Function<String, String> toUpperCaseMethodReference = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println(toUpperCaselambda.apply("java8"));
        System.out.println(toUpperCaseMethodReference.apply("java8"));
    }
}
