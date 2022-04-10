package BoxingAndUnBoxing;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class NumericStreamBoxingUnBoxingExample {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10)
                //int
                .boxed()
                //Integer
                .collect(toList());

    }

    //Wrapper to Primitive
    public static int unBoxing(List<Integer> integerList){
        return integerList.stream()
                //Wrapper Integer value
                .mapToInt(Integer::intValue) //mapToInt will return intStream back, it will return int value
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("boxig : "+boxing());

        List<Integer> integerList = boxing();
        System.out.println("unboxig : "+ unBoxing(integerList));
    }
}
