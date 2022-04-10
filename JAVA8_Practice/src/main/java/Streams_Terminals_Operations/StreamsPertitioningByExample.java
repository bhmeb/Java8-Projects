package Streams_Terminals_Operations;

import model.Student;
import model.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPertitioningByExample {

    public static void pertitioningBy_1(){
        Predicate<Student> pgaPredicate = student -> student.getGpa()>=3.9;
        Map<Boolean, List<Student>> partitioningMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(pgaPredicate));

        System.out.println("partitioningMap: " + partitioningMap);
    }

    public static void pertitioningBy_2(){
        Predicate<Student> pgaPredicate = student -> student.getGpa()>=3.9;
        Map<Boolean, Set<Student>> partitioningMap2 = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(pgaPredicate,
                        toSet())); //you can pass any kind of collections

        System.out.println("partitioningMap2: " + partitioningMap2);
    }

    public static void main(String[] args) {
        //pertitioningBy_1();
        pertitioningBy_2();
    }
}
