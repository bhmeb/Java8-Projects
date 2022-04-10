package StreamAPI;

import model.Student;
import model.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class StreamMapExample {

    public static List<String> nameList(){
        List<String> studentList = StudentDataBase.getAllStudents().stream()
                //Student as an Input -> Student name as an Output
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        return studentList;
    };

    public static Set<String> nameSet(){
        Set<String> studentSet = StudentDataBase.getAllStudents().stream()
                //Student as an Input -> Student name as an Output
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toSet());

        return studentSet;
    };

    public static void main(String[] args) {

        System.out.println(nameList());
        System.out.println(nameSet());

    }
}
