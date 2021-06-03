
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BITpluPlus {
    
     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     static int x;

    public static void main(String[] args) throws IOException {  //https://vjudge.net/contest/442181#problem/A
        
        int tamanio = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < tamanio; i++) {
            String text = br.readLine();
            
            if (text.equals("++X") || text.equals("X++")) {
                x++;
                
            } else if (text.equals("--X") || text.equals("X--")) {
                x--;
            }
        }
        System.out.println(x);
    }
}
