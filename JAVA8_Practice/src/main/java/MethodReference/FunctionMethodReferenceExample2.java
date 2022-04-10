package MethodReference;

import model.Student;
import model.StudentDataBase;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionMethodReferenceExample2 {

    //static Consumer<Student> studentConsumer = (student -> System.out.println(student));
    /***
     * ClassName::MethodName
     */
    static Consumer<Student> c1 = (System.out::println);
    /***
     * ClassName::InstanceMethodName
     */
    static Consumer<Student> c2 = Student::printActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
