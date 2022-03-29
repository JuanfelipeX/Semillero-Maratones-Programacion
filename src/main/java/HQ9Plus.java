
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
public class HQ9Plus {
    
     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        
         String word = br.readLine();
         
         if (word.contains("H") || word.contains("9") || word.contains("Q")) {
             System.out.println("YES");
        } else {
             System.out.println("NO");
         }
    }
}
