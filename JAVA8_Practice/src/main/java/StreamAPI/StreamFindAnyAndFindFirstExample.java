package StreamAPI;

import model.Student;
import model.StudentDataBase;

import java.util.Optional;

public class StreamFindAnyAndFindFirstExample {

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGpa()>=3.9))
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGpa()>=4.2))
                .findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> studentOptionalfindAny= findAnyStudent();
        Optional<Student> studentOptionalfindFirst= findFirstStudent();

        if(studentOptionalfindAny.isPresent()){
            System.out.println("Found the result : " + studentOptionalfindAny);
        }else{
            System.out.println("Not found the result");
        }

        if(studentOptionalfindFirst.isPresent()){
            System.out.println("Found the result : " + studentOptionalfindFirst);
        }else{
            System.out.println("Not found the result");
        }
    }
}

//the problem will come in parallel stream
