
import java.util.Scanner;

/**
 *
 * @author jonasknappitsch
 */
public class MissingNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextInt();

        long sum = 0;
        for (long i = 0; i < n - 1; i++) {
            sum += in.nextInt();
        }

        System.out.println(n * (n + 1) / 2 - sum);
    }
}
