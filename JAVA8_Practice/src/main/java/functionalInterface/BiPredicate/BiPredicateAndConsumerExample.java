package functionalInterface.BiPredicate;

import model.Student;
import model.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredicateAndConsumerExample {

    //lambda behave the same for static and Instance method.

    Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;

    //It takes 2 input
    BiPredicate<Integer, Double> studentBiPredicate = (grageLevel, gpa) -> grageLevel>=3 && gpa>=3.9;

    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + ":" +activities);

    Consumer<Student> studentConsumer = (student -> {

        if(studentBiPredicate.test(student.getGradeLevel(),student.getGpa())){
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }

       /* if(p1.and(p2).test(student)){
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }*/
    });

    public  void printNameAndActivites(List<Student> students){
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new BiPredicateAndConsumerExample().printNameAndActivites(studentList);
    }
}
