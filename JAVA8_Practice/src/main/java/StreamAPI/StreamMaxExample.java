package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {

    //Note - When you want to find Max value, always use Optional as a return type.

    public static int findMaxValue(List<Integer> integerList){
        return integerList.stream()
                //6
                //7
                //9
                //10
                //x variable hold the max value for each element in the iteration
                //x=0, y=6 is 0>6 and return result is 6
                //x=6, y=7 is 6>7 and return result is 7
                //x=7, y=9 is 7>9 and return result is 9
                //x=9, y=10 is 9>10 and return result is 10
                //x=10 and that will be returned.
                .reduce(0, (x,y) -> x>y ? x : y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList){
        return integerList.stream()
                .reduce((x,y) -> x>y ? x : y);
    }

    public static void main(String[] args) {

        //List<Integer> integerList = Arrays.asList(6,7,9,10);
        List<Integer> integerList1 = new ArrayList<>();

        int maxvalue = findMaxValue(integerList1);
        System.out.println("max value is : " + maxvalue);

        Optional<Integer> maxvalue1 = findMaxValueOptional(integerList1);
        System.out.println("Optional Max is : " + maxvalue1);
        if(maxvalue1.isPresent()){
            System.out.println("max value using Oprional : " + maxvalue1.get());
        }else{
            System.out.println("Input list is empty");
        }
    }
}
