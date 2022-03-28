
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author pipes
 */
public class Shopaholic {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int cases = Integer.parseInt(br.readLine());

        for (int i = 0; i < cases; i++) {

            int number = Integer.parseInt(br.readLine());
            int discount = 0;

            Integer[] datos = new Integer[number];
            
            String[] datos2 = br.readLine().split(" ");

            for (int c = 0; c < number; c++) {
                   datos[c] = Integer.parseInt(datos2[c]);
            }
            
            Arrays.sort(datos, Collections.reverseOrder()); //ordenar de mayor a menor
              
              for (int j = 2; j < number; j+= 3) {
                  discount += datos[j];
            }
              
              //System.out.println(Arrays.toString(datos));
              
              System.out.println(discount);

        }
    }
}
