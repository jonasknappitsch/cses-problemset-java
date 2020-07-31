
import java.util.Scanner;

/**
 *
 * @author jonasknappitsch
 */
public class IncreasingArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        long diffSum = 0;
        long maxVal = 0;

        a[0] = in.nextInt();

        for (int i = 1; i < a.length; i++) {
            a[i] = in.nextInt();

            maxVal = Math.max(maxVal, a[i - 1]);

            if (a[i] < maxVal) {
                diffSum += maxVal - a[i];
            }
        }
        System.out.println(diffSum);
    }
}
