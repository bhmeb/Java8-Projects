package Streams_Terminals_Operations;

import model.Student;
import model.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {

    public static void groupStudentByGender(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));

        System.out.println(studentMap);
    }

    public static void customizedGroupStudentByGender(){
        Map<String, List<Student>> studentMap2 = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING":"AVERAGE"));

        System.out.println(studentMap2);
    }

    public static void twoLevelGrouping_1(){
        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING":"AVERAGE")));

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_2(){
        Map<Integer, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                       summingInt(Student::getNoteBook)));

        System.out.println(studentMap);
    }

    public static void threeArgumentGroupBy(){

       LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));

       //Student::getName -> input
        // LinkedHashMap::new -> return type
        //toSet ->
        System.out.println(studentLinkedHashMap);
    }

    public static void calculateTopGpa(){
        Map<Integer, Optional<Student>> studentMapOptional= StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println(studentMapOptional);
    }

    public static void calculateTopGpa_2(){
        Map<Integer, Student> studentMapOptional2= StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa))
                        ,Optional::get)));

        System.out.println(studentMapOptional2);
    }

    public static void calculateLeastGpa(){
        Map<Integer, Optional<Student>> studentMapOptional3= StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        minBy(Comparator.comparing(Student::getGpa))));

        System.out.println(studentMapOptional3);
    }


    public static void calculateTopGpa_3(){
        Map<Integer, Student> studentMapOptional2= StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa))
                                ,Optional::get)));

        System.out.println(studentMapOptional2);
    }

    public static void main(String[] args) {
        //groupStudentByGender();
        //customizedGroupStudentByGender();
        //twoLevelGrouping_1();
        //twoLevelGrouping_2();
        //threeArgumentGroupBy();
        //calculateTopGpa();
        //calculateTopGpa_2();
        //calculateLeastGpa();
        calculateTopGpa_3();
    }
}
