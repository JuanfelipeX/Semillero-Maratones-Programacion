
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Substrings {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        
        int tamanio = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < tamanio; i++) {
            
            String number = br.readLine();
            int re = number.length()-3; 
            
            System.out.println(number.substring(0, re));
            
        
        }

    }

}
