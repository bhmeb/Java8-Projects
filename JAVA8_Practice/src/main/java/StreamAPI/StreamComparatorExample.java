package StreamAPI;

import model.Student;
import model.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {

    public static List<Student> sortStudentByName(){

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentByGpa(){

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentByGpaDesc(){

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        //System.out.println(sortStudentByName());
        System.out.println("Students sorted by name");
        sortStudentByName().forEach(System.out::println);

        System.out.println("Students sorted by Gpa");
        sortStudentByGpa().forEach(System.out::println);

        System.out.println("Students sorted by Gpa DESC order");
        sortStudentByGpaDesc().forEach(System.out::println);


    }
}
