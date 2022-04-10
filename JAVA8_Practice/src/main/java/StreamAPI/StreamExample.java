package StreamAPI;

import model.Student;
import model.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>=3);
        Predicate<Student> studentPredicate2 = (student -> student.getGpa()>=3.9);

       Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
               //.filter((student -> student.getGradeLevel()>=3))
               .filter(studentPredicate)
               .filter(studentPredicate2)
               .collect(Collectors.toMap(Student::getName, Student::getActivities));
       System.out.println(studentMap);
    }
}

//BiFunctionExample
