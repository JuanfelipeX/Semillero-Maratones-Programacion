import java.util.Scanner;

public class KnotKnowledge_Kattis {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n - 1];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            y[i] = sc.nextInt();
        }

        boolean cont = false;
        for (int i = 0; i < n; i++) {
            cont = false;
            for (int j = 0; j < n - 1; j++) {
                if (x[i] == y[j]) {
                    cont = true;
                    break;
                }
            }

            if (!cont) {
                System.out.println(x[i]);
                break;
            }
        }

    }
    
}
