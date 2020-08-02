package withoutLazy;

public class WithoutLazyLoading {

    public static int evaluate(int n ) {
        System.out.println("evaluate was called");
        return n * 2;
    }
    public static void main(String[] args) {
        int x = 4;
        int temp = evaluate(x);

        if(x > 5 && temp > 10) {
            System.out.println("Path 1");
        } else {
            System.out.println("Path 2");
        }
    }
}
