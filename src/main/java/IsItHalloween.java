
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsItHalloween {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String textos = br.readLine();
        String[] parts = textos.split(" ");
        String fecha = parts[0];
        int dia = Integer.parseInt(parts[1]);

        if ((fecha.equalsIgnoreCase("OCT") && dia == 31) || (fecha.equalsIgnoreCase("DEC") && dia == 25)) {
            System.out.println("yup");
        } else {
            System.out.println("nope");
        }
    }
}
