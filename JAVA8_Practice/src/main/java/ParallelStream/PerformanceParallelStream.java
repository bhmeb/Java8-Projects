package ParallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class PerformanceParallelStream {

    public static long checkPerformanceResult(Supplier<Integer> supplier, int times){

        Long startTime = System.currentTimeMillis();
        for(int i = 0; i<times; i++){
            supplier.get();
        }
        Long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }

    public static int sumSequentialStream(){
       return IntStream.rangeClosed(1, 1000)
                .sum();
    }

    public static int sumParallelStream(){
        return IntStream.rangeClosed(1, 1000)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {

        //Check how many processor are available in this machine
        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println("Sequential stream result: " + checkPerformanceResult(PerformanceParallelStream::sumSequentialStream,20));
        System.out.println("parallel stream result: " + checkPerformanceResult(PerformanceParallelStream::sumParallelStream,20));

        //System.out.println("Sequential Stream: " + sumSequentialStream());
        //System.out.println("parallel Stream: " + sumParallelStream());

    }
}
