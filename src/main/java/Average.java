
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author pipes
 */

public class Average {
    
    static Scanner sc = new Scanner(System.in);
    static int res = 0;
    
    public static void main(String[] args) {
        String s = sc.nextLine();
        searchASCII(s);
        
    }
    
    static void searchASCII(String s){
        char[] cadena = s.toCharArray();
        byte[] bytes = s.getBytes(StandardCharsets.US_ASCII);
        for (int i = 0; i < cadena.length; i++) {
            res += bytes[i];
        }
        int  c = res / s.length();
        char value_char  = (char) c;
        System.out.println(value_char);
    }
}
