
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bars {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Scanner sc = new Scanner(System.in);
    static int cont;
    static boolean flag = true;

    public static void main(String[] args) throws IOException {
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int longitud = sc.nextInt();
            int bars = sc.nextInt();
            int[] array = new int[bars];
            for (int j = 0; j < array.length; j++) {
                array[j] = sc.nextInt();
            }
            for (int j = 0; j < (1 << bars); j++) {  //(1 << bars) esto es para hacer permutacion es decir 2 elevado a n (potencia ) osea un pow
                int cont = 0;
                for (int k = 0; k < bars; k++) {
                    if ((j >> k & 1) == 1) {
                        cont += array[k];
                    }
                }
                if (cont == longitud) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
            
            if (flag == true) {
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
