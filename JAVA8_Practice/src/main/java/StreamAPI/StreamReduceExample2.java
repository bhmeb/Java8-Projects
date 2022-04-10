package StreamAPI;

import model.Student;
import model.StudentDataBase;

import java.util.Optional;

public class StreamReduceExample2 {


    //Oprtional because I don't have any optional value.
    public static Optional<Student> getHighestGpaStudent(){

        //Tarnary operator
        return StudentDataBase.getAllStudents().stream()
                //Student one by one
                .reduce((s1,s2) -> (s1.getGpa()>s2.getGpa()) ? s1 : s2);

        /*return StudentDataBase.getAllStudents().stream()
                //Student one by one
                .reduce((s1,s2) -> {
                    if(s1.getGpa()> s2.getGpa()){
                        return s1;
                    }else{
                        return s2;
                    }
                });*/
    }


    public static void main(String[] args) {
       Optional<Student> studentOptional = getHighestGpaStudent();
       if(studentOptional.isPresent()){
           System.out.println(studentOptional.get());
       }

    }
}
