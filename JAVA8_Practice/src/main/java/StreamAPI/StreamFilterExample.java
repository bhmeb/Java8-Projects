package StreamAPI;

import model.Student;
import model.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamFilterExample {

    public static List<Student> filterStudent(){

       return StudentDataBase.getAllStudents()
                .stream()
                .filter(student->student.getGender().equals("female"))
               .filter(student -> student.getGpa()>=3.9)
                .collect(toList());
    }

    public static void main(String[] args) {

        filterStudent().forEach(System.out::println);

    }
}
