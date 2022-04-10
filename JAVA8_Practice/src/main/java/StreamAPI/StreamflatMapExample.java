package StreamAPI;

import model.Student;
import model.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamflatMapExample {

    public static List<String> printStudentActivites(){
       List<String> studentActivites =  StudentDataBase.getAllStudents().stream()
               .map(Student::getActivities)  //Stream<List<String>>
               .flatMap(List::stream)
               .distinct()
               .sorted()
               .collect(toList());
       return studentActivites;
    };
    public static long printStudentActivitesCount(){
        long numberOfStudentActivites =  StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)  //Stream<List<String>>
                .flatMap(List::stream)
                .distinct()
                .count();
        return numberOfStudentActivites;
    };

    public static void main(String[] args) {

        System.out.println("Call printStudentActivites: " + printStudentActivites());
        System.out.println("Call printStudentActivitesCount: "+ printStudentActivitesCount());

    }
}
