
import java.util.Scanner;

/**
 *
 * @author jonasknappitsch
 */
public class WeirdAlgorithm {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();

        String output = "";

        while (n > 1) {
            output += n + " ";
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }
        output += "1";
        System.out.println(output);
    }
}
