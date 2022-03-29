
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pipes
 */
public class GeorgeandAccommodation {
    
     static Scanner sc = new Scanner(System.in);
     static int count = 0;
    
    public static void main(String[] args) {
        
        int cases = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < cases; i++) {
            
            int people = sc.nextInt();
            int tamanio = sc.nextInt();
            
            if (tamanio - people >= 2) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
