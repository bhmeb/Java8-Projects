package functionalInterface.BiFunction;

import model.Student;
import model.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = ((students, studentPredicate) -> {
        Map<String, Double> stdentGradeMap = new HashMap<>();
        students.forEach(student -> {
            if(studentPredicate.test(student)){
                stdentGradeMap.put(student.getName(), student.getGpa());
            }
        });
        return stdentGradeMap;
    });

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),BiFunctionExample.p1));

    }
}
