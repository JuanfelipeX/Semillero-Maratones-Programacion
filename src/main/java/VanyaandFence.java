
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author pipes
 */
public class VanyaandFence {

    static Scanner sc = new Scanner(System.in);
    static int sum = 0;

    public static void main(String[] args) {

        String textos = sc.nextLine();
        String[] parts = textos.split(" ");
        int friends = Integer.parseInt(parts[0]);
        int height = Integer.parseInt(parts[1]);
        
        for (int i = 0; i < friends; i++) {
            int tamanios = sc.nextInt();
            if (tamanios > height) {
                sum = sum + 2;
            } else{
                sum = sum + 1;
            }
        }
        
        System.out.println(sum);
        
    }

}
