
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author pipes
 */
public class Drinks {

    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int number = Integer.parseInt(br.readLine());
        double sum = 0;

        Double[] datos = new Double[number];

        String[] datos2 = br.readLine().split(" ");

        for (int c = 0; c < number; c++) {
            datos[c] = Double.parseDouble(datos2[c]);
            sum += datos[c];
        }

        double answer = (sum / number );

        System.out.println(answer);
    }

}
