
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author pipes
 */
public class Presents {

    static Scanner sc = new Scanner(System.in);
    static int group, cases;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int cases = Integer.parseInt(br.readLine());

        Integer[] datos = new Integer[cases];
        Integer[] friends2 = new Integer[cases];

        String[] datos2 = br.readLine().split(" ");

        for (int c = 0; c < cases; c++) {
            datos[c] = Integer.parseInt(datos2[c]);
            friends2[datos[c] - 1] = c + 1;
            System.out.print(friends2[c] + " ");
        }
        
        for (int i = 0; i < cases; i++) {
            System.out.print(friends2[i] + " ");
        }

        //System.out.println(Arrays.toString(datos));
    }
}
