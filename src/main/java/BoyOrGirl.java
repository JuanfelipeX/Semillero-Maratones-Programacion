
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoyOrGirl {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String text = br.readLine();

        text = text.replaceAll("(.*)(?=.*\\1)", "");  //expresion regular donde elimina caracteres repetidos 
        //text = text.replaceAll("(.)\\1", "$1"); esta expresion elimina caracteres repetidos de forma continua

        if (text.length() % 2 == 0) {
            System.out.println("CHAT WITH HER!");

        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
