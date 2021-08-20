
import java.util.Scanner;

public class Statistics_Kattis {

    public static void main(String[] args) {  //link del ejercicio https://vjudge.net/contest/454382#problem/D

        Scanner sc = new Scanner(System.in);
        int numberCases = 1;
        while (sc.hasNext()) {
            int min = Integer.MAX_VALUE;  //forma para buscar un numeros menores y mayores
            int max = Integer.MIN_VALUE;
            int mayor = 0;
            int ncases = sc.nextInt();
            for (int i = 0; i < ncases; i++) {
                int numbers = sc.nextInt();
                if (min > numbers) {
                    min = numbers;
                }
                if (max < numbers) {
                    max = numbers;
                }
            }
            System.out.println("Case " + numberCases++ + ": " + min + " " + max + " " + (max - min));
        }
    }
}
