package Streams_Terminals_Operations;

import model.Student;
import model.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class StreamsJoiningExample {

    public static String Joining_1(){
       return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining());
    }

    public static String Joining_2(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining("-"));
    }

    public static String Joining_3(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining("-", "(", ")"));
    }

    public static void main(String[] args) {

        System.out.println("Stream Joining 1: " + Joining_1());
        System.out.println("Stream Joining 2: " + Joining_2());
        System.out.println("Stream Joining 3: " + Joining_3());



    }
}
