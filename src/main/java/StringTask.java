
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringTask { //    https://vjudge.net/contest/442181#rank

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringBuilder Sb = new StringBuilder();

        String text = br.readLine();
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') || (c == 'y'))) {
                Sb.append(".").append(c);

            }
        }
        System.out.println(Sb);
    }
}
