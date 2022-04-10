package StreamAPI.NumericStream;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class NemaricStreamMapExample {

    public static List<Integer> mapToObj(){
        return IntStream.rangeClosed(1,50)
                .mapToObj((i) -> {
                    return new Integer(i);
                })
                .collect(toList());
    }

    public static Long mapToLong(){
        return IntStream.rangeClosed(1,50)
                .mapToLong(((i) -> i))
                .sum();
    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(1,50)
                .mapToDouble(((i) -> i))
                .sum();
    }

    public static void main(String[] args) {

        System.out.println("map to object: " + mapToObj());
        System.out.println("map to Long: " + mapToLong());
        System.out.println("map to Double: " + mapToDouble());



    }
}
