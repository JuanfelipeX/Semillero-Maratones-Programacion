
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Football {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException { //https://vjudge.net/contest/442181#problem/F
        
        String number = br.readLine();
        
        if (number.contains("1111111") || number.contains("0000000")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
