
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
public class LuckyDivision {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        
        int number = Integer.parseInt(br.readLine());
        
        if (number % 4 == 0 || number % 7 == 0 || number % 47 == 0 || number % 74 == 0 || number % 477 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
}
