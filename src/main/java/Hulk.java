
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author pipes
 */
public class Hulk {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {

            if (i == 1) 
                System.out.printf("I hate ");
             else if(i % 2 == 0)
                System.out.printf("that I love ");
             else
                System.out.printf("that I hate ");
            
            
        }
        System.out.printf("it\n");
    }

}
