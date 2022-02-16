
import java.util.Scanner;

/**
 *
 * @author pipes
 */
public class LaptopSticker {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (sc.hasNext()) {

            String textos = sc.nextLine();
            String[] parts = textos.split(" ");
            int wc = Integer.parseInt(parts[0]);
            int hc = Integer.parseInt(parts[1]);
            int ws = Integer.parseInt(parts[2]);
            int hs = Integer.parseInt(parts[3]);

            if (ws + 1 < wc && hs +1 < hc) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

    }

}
