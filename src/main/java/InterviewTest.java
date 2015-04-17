import java.util.ArrayList;
import java.util.List;

/**
 * Created by msrunyu on 4/11/15.
 */
public class InterviewTest {

    public static void main(String[] args) throws Exception {

        int n = 20;

        System.out.println("Finding fib sequence from 0 to " + fib(n));
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i <= n; i++ ) {
            result.add(fib(i));
        }
        System.out.println("Fib result : " + result.toString());
    }


    /**
     * Returns fib number of input
     * @param n
     * @return
     */
    public static int fib (Integer n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }  else {
            return fib(n - 1) + fib(n - 2);
        }
    }




}
