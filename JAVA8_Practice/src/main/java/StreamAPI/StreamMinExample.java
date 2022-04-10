package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {

    //Note - When you want to find Min value, never use deault.

    public static Optional<Integer> findMinValue(List<Integer> integerList){
        return integerList.stream()
                .reduce( (x,y) -> x<y ? x : y); //If you use identity the min value will be returned zero
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList){
        return integerList.stream()
                .reduce((x,y) -> x<y ? x : y);
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6,7,9,10);
        //List<Integer> integerList = new ArrayList<>();

        Optional<Integer> minvalueOptional = findMinValue(integerList);
        System.out.println("max value is : " + minvalueOptional);

        if(minvalueOptional.isPresent()){
            System.out.println("The Min value is: " + minvalueOptional.get());
        }else{
            System.out.println("No input in the List");
        }
    }
}
