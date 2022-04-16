
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author pipes
 */
public class CalculatingFunction {

    static Scanner sc = new Scanner(System.in);
    static int total, total2;

    public static void main(String[] args) {
        long numero = sc.nextLong();

       // for (int i = 1; i <= numero; i++) {
            if (numero % 2 == 0) {
                 //total = total + i;
                 System.out.println(numero/2);
            } else {
                 //total2 = total2 + i;
                 System.out.println(-(numero+1)/2);
            }
      //  }
    
      //  int total3 = total - total2 ;
      //  System.out.println(total3);

    }

}
