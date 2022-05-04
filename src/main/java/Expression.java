
import static java.lang.Integer.max;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pipes
 */
public class Expression {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        
        int ans=a+b+c;
        ans=max(ans,(a*b*c));
        ans=max(ans,(a+b)*c);
        ans=max(ans,a*(b+c));
        ans=max(ans,a+(b*c));
        ans=max(ans,(a*b)+c);
        
        System.out.println(ans);
        
        
    }
    
}
