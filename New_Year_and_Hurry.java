
import java.util.Scanner;

/**
 *
 * @author pipes
 */
public class New_Year_and_Hurry {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNext()) {

            String textos = sc.nextLine();
            String[] parts = textos.split(" ");
            int problems = Integer.parseInt(parts[0]);
            int time = Integer.parseInt(parts[1]);

            int resta = 240 - time, sum = 0, cont = 0;

            for (int i = 1; i <= problems; i++) {
                sum = 5 * i;

                if (resta >= sum) {
                    cont = cont + 1;
                    resta = resta - sum;
                }
            }
            System.out.println(cont);

        }
    }
}
