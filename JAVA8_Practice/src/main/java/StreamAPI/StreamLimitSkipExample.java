package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integerList){
       return integerList.stream()
                .limit(3) //First 3 element will be calculated and rest of elements will be skiped
                .reduce((x,y) -> x+y);
    }

    public static Optional<Integer> skip(List<Integer> integerList){
        return integerList.stream()
                .skip(3) //First 3 element will skip and rest of elements will be calculated
                .reduce((x,y) -> x+y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,9,10,20);
        Optional<Integer> limitResult = limit(integerList);
        Optional<Integer> skipResult = skip(integerList);

        if(limitResult.isPresent()){
            System.out.println("The Limit result is: " + limitResult.get());
        }else{
            System.out.println("No input in the List");
        }

        if(skipResult.isPresent()){
            System.out.println("The Skip result is: " + skipResult.get());
        }else{
            System.out.println("No input in the List");
        }
    }
}
