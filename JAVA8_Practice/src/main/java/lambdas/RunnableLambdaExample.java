package lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {
        /*
         * Prior Java 8
         * */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable Interface");
            }
        };

        new Thread(runnable).start();

        /*
         * Java 8 with Lambda
         * */

        //1
        Runnable runnable1 = () -> {
            System.out.println("Inside Runnable Interface with lambda1");
        };

        //2
        Runnable runnable2 = () -> System.out.println("Inside Runnable Interface with lambda2");

        new Thread(runnable1).start();
        new Thread(runnable2).start();

        //3
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable Interface with lambda4 inside the thread");
            }
        });
        //We directly executed here as well
        new Thread(() -> System.out.println("Inside Runnable Interface with lambda3")).start();
    }
}

