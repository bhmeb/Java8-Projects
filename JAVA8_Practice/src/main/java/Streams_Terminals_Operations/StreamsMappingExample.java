package Streams_Terminals_Operations;

import model.Student;
import model.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamsMappingExample {

    public static void main(String[] args) {

        List<String> nameList1 = StudentDataBase.getAllStudents()
                .stream()
                .map(student -> student.getName())//see the below mapping() function can avoid this additional map() function.
                .collect(toList());
        System.out.println("Student name List1 : " + nameList1);


        List<String> nameList = StudentDataBase.getAllStudents().stream()
                .collect(mapping(Student::getName, toList()));
       System.out.println("Student name List : " + nameList);


        Set<String> nameSet = StudentDataBase.getAllStudents().stream()
                .collect(mapping(Student::getName, toSet()));
        System.out.println("Student name Set : " + nameSet);

    }
}
