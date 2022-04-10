package MethodReference;

import model.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferencesExample {

    //With Lambda
    //static Supplier<Student> studentSupplier = () -> new Student();
    //static Function<String,Student> studentFunction = s -> new Student(s);

    //With Constructor reference
    static Supplier<Student> studentSupplier = Student::new;
    static Function<String,Student> studentFunction = Student::new;

    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println(studentFunction.apply("ABC"));
    }
}
