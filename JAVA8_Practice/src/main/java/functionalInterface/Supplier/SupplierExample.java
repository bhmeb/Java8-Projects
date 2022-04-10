package functionalInterface.Supplier;

import model.Student;
import model.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    //Its opposit of Consumer Interface

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () ->{
            return new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
        };

        Supplier<List<Student>> studentListSupplier = () -> StudentDataBase.getAllStudents();

        System.out.println("Student is :" + studentSupplier.get());
        System.out.println("Student List is :" + studentListSupplier.get());

    }
}
