
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flip {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //https://vjudge.net/contest/454382#problem/F

    public static void main(String[] args) throws IOException {

        int invertido = 0, resto, invertido2 = 0, resto2;

        String textos = br.readLine();
        String[] parts = textos.split(" ");
        int number = Integer.parseInt(parts[0]);
        int number2 = Integer.parseInt(parts[1]);

        while (number > 0) {
            resto = number % 10;
            invertido = (invertido * 10) + resto;
            number /= 10;
        }
        
        while (number2 > 0) {
            resto2 = number2 % 10;
            invertido2 = (invertido2 * 10) + resto2;
            number2 /= 10;
        }

        if (invertido > invertido2) {
            System.out.println(invertido);

        } else {
            System.out.println(invertido2);
        }
    }
}
