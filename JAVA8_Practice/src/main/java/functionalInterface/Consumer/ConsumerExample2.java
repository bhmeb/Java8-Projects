package functionalInterface.Consumer;

import model.Student;
import model.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    static Consumer<Student> studentsConsumer = (student) -> System.out.println(student);
    static Consumer<Student> studentNameConsumer = (student) -> System.out.println(student.getName());
    static Consumer<Student> studentActivitesConsumer = (student) -> System.out.println(student.getActivities());


    public static void printName(){
        System.out.println("--------Call printName-----------");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentsConsumer);  //forEach method return consumer type
    }

    public static void printNameAndActivites(){
        System.out.println("--------Call printNameAndActivites-----------");
        List<Student> studentList2 = StudentDataBase.getAllStudents();
        studentList2.forEach(studentNameConsumer.andThen(studentActivitesConsumer)); //consumer chaining
    }


    public static void printNameAndActivitesUsingCondition(){
        System.out.println("--------Call printNameAndActivitesUsingCondition-----------");
        List<Student> studentList2 = StudentDataBase.getAllStudents();
        studentList2.forEach((student) -> {
            if(student.getGradeLevel()>=3 && student.getGpa()>=3.9){
                //studentNameConsumer.andThen(studentActivitesConsumer).accept(student);
                studentNameConsumer.andThen(studentActivitesConsumer).andThen(studentsConsumer).accept(student);
            }
        });
    }

    public static void main(String[] args) {
        printName();
        printNameAndActivites();
        printNameAndActivitesUsingCondition();
    }
}


