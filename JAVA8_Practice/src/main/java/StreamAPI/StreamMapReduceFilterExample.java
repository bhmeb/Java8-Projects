package StreamAPI;

import model.Student;
import model.StudentDataBase;

public class StreamMapReduceFilterExample {

    private static int noOfNoteBooks(){
        int numberOfNoteBooks = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>3.9)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNoteBook)
               //.reduce(0, (a,b) -> a + b);
                //Alternative way
                .reduce(0, Integer::sum); //But Integer class doesn't have Multiplication


        return numberOfNoteBooks;
    }

    public static void main(String[] args) {

        System.out.println("Number of NoteBooks: " + noOfNoteBooks());

    }
}
