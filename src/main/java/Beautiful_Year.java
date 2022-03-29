
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author pipes
 */
public class Beautiful_Year {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int a,b,c,d;

    public static void main(String[] args) throws IOException {
        

        int year = Integer.parseInt(br.readLine());
        
        while (true) {            
            year++;
            a = year/1000;
            b = year/100%10;
            c = year/10%10;
            d = year%10;
            
            System.out.println("a:  " + a + "  b:  " + b + "  c:  " + c + "  d:  " + d + "  year:  " + year);
            
            if (a!=b && a!=c && a!=d && b!=c && b!=d && c!=d ) {
                break;
            }
        }
        
        System.out.println(year);

    }

}
