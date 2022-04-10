package Streams_Terminals_Operations;

import model.Student;
import model.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumAvgExample {

    public  static int sum(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNoteBook));
    }

    public  static double avg(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::getNoteBook));
    }


    public static void main(String[] args) {

        System.out.println("Total no of notebooks:- " + sum());
        System.out.println("Average of noteBooks:- " + avg());


    }
}
