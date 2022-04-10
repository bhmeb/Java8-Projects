package functionalInterface.Predicate;

import model.Student;
import model.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> student1 = (s) -> s.getGradeLevel()>=3;
    static Predicate<Student> student2 = (s) -> s.getGpa()>=3.9;
    static List<Student> studentsList = StudentDataBase.getAllStudents();

    public static void FilterStudentByGradeLevel(){
        System.out.println(">>>>>>>>>Call FilterStudentByGradeLevel>>>>>>>>");
        studentsList.forEach((s -> { //s.getGradeLevel()>=3;
            if(student1.test(s)){
                System.out.println(s);
            }
        }));
    }

    public static void FilterStudentBygetGpa(){
        System.out.println(">>>>>>>>>Call FilterStudentBygetGpa>>>>>>>>");
        studentsList.forEach((s -> {//s.getGpa()>=3.9;
            if(student2.test(s)){
                System.out.println(s);
            }
        }));
    }

    public static void FilterStudentAnd(){
        System.out.println(">>>>>>>>>Call FilterStudent>>>>>>>>");
        studentsList.forEach((s -> { //s.getGpa()>=3.9; and s.getGradeLevel()>=3;
            if(student1.and(student2).test(s)){
                System.out.println(s);
            }
        }));
    }

    public static void FilterStudentOr(){
        System.out.println(">>>>>>>>>Call FilterStudentOr>>>>>>>>");
        studentsList.forEach((s -> { //common result print
            if(student1.or(student2).test(s)){
                System.out.println(s);
            }
        }));
    }

    public static void FilterStudentNegate(){
        System.out.println(">>>>>>>>>Call FilterStudentNegate>>>>>>>>");
        List<Student> studentsList = StudentDataBase.getAllStudents();
        studentsList.forEach((s -> { //Reserse result of Or method
            if(student1.or(student2).negate().test(s)){
                System.out.println(s);
            }
        }));
    }

    public static void main(String[] args) {
        FilterStudentByGradeLevel();
        FilterStudentBygetGpa();
        FilterStudentAnd();
        FilterStudentOr();
        FilterStudentNegate();
    }
}
