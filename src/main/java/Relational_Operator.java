
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Relational_Operator {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int tamanio = Integer.parseInt(br.readLine());

        for (int i = 0; i < tamanio; i++) {

            String textos = br.readLine();
            String[] parts = textos.split(" ");
            int number1 = Integer.parseInt(parts[0]);
            int number2 = Integer.parseInt(parts[1]);

            if (number1 < number2) {
                System.out.println("<");
            } else if (number1 > number2) {
                System.out.println(">");
            } else if (number1 == number2) {
                System.out.println("=");
            }
        }
    }
}
