package MethodReference;

import model.Student;
import model.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    //static Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>=2);
    //or

    public static boolean greaterThanGradeLevel(Student s){
        return s.getGradeLevel()>=3;
    }
    static Predicate<Student> studentPredicate = RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static void main(String[] args) {
        System.out.println(studentPredicate.test(StudentDataBase.studentSupplier.get()));

    }
}
