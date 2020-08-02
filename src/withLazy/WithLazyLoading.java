package withLazy;

import java.util.function.Supplier;

public class WithLazyLoading {

    public static int evaluate(int n ) {
        System.out.println("evaluate was called");
        return n * 2;
    }
    public static void main(String[] args) {
        int x = 4;
        Supplier<Integer> temp = () -> evaluate(x);

        // temp will not get called unless x > 5
        if(x > 5 && temp.get() > 10) {
            System.out.println("Path 1");
        } else {
            System.out.println("Path 2");
        }
    }
}
