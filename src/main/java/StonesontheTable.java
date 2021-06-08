
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StonesontheTable {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int cont = 0;
    static String text;

    public static void main(String[] args) throws IOException {

        try {
            int number = Integer.parseInt(br.readLine());
            text = br.readLine();
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == text.charAt(i + 1)) {
                    cont++;
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(cont);
        }
    }
}
