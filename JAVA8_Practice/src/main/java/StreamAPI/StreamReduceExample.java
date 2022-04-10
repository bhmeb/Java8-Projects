package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream()
                //1
                //2
                //5
                //7
                //a=1, b=1(from stream) => result 1 is returned
                //a=1(PRV result), b=2 => result 2 is returned
                //a=2(PRV result), b=5 => result 10 is returned
                //a=10(PRV result), b=7 => result 70 is returned
                .reduce(1, (a,b) -> a*b); //BinaryOperation value - (a,b) -> a*b
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b) -> a*b); //BinaryOperation value - (a,b) -> a*b
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(2,5,7);
        List<Integer> integers1 = new ArrayList<>();
        System.out.println(performMultiplication(integers));

       Optional<Integer> result =  performMultiplicationWithoutIdentity(integers);
       System.out.println(result);
        System.out.println(result.isPresent());
        System.out.println(result.get());

        Optional<Integer> result1 =  performMultiplicationWithoutIdentity(integers1);
        System.out.println(result1.isPresent());
        if(result1.isPresent()){
            System.out.println(result1.get());
        }
    }
}
