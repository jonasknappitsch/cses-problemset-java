
import java.util.Scanner;

/**
 *
 * @author jonasknappitsch
 */
public class Repetitions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        char current = input.charAt(0);
        int count = 0;
        int maxCount = 1;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == current) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                current = input.charAt(i);
                count = 1;
            }
        }
        System.out.println(maxCount);
    }
}
