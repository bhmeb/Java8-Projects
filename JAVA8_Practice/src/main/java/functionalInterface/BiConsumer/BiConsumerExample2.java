package functionalInterface.BiConsumer;

import model.Student;
import model.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {

    //In BiConsumer creates only one single instance for name and activites
    //But in Consumer creates 2 instances for name and activites
    //As per requirement apply them accordingly

    public static void printNameAndActivites(){
        BiConsumer<String, List<String>> biConsumer = (name, activites) -> {
            System.out.println(name + " : "+ activites);
        };
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));
    }

    public static void main(String[] args) {
        printNameAndActivites();
    }
}
