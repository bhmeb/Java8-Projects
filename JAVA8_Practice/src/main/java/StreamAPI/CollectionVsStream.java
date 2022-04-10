package StreamAPI;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionVsStream {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Raj");
        names.add("Aryan");
        names.add("Rahul");


        //Collection:
        //Collection traverse n time.
        //Perform External Iteration to iterate through the element.
        for(String name:names){
            System.out.println(name);
        }

        for(String name:names){
            System.out.println(name);
        }

        names.remove(0);
        System.out.println(names);


        //Stream:
        //Stream traverse only once
        //Perform Internal Iteration to iterate through the element.
        System.out.println("<<<<<Stream call>>>>>>");
        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        //nameStream.forEach(System.out::println);

    }
}
