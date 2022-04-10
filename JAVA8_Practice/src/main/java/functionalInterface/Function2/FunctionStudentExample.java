package functionalInterface.Function2;

import model.Student;
import model.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;

    //Find Student GradeLevel data
    static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {
        Map<String, Double> studentNameAndGradeMap = new HashMap<>();
        students.forEach(student -> {
            if(FunctionStudentExample.p1.test(student)) {
                studentNameAndGradeMap.put(student.getName(), student.getGpa());
            }
           /* if(FunctionStudentExample.p1.and(p2).test(student)) {
                studentNameAndGradeMap.put(student.getName(), student.getGpa());
            }*/
        });
        return studentNameAndGradeMap;
    });

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
