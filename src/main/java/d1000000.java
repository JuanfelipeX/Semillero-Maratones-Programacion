
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pipes
 */
public class d1000000 {

    static Scanner sc = new Scanner(System.in);  
  
    public static void main(String[] args) {

        int tamanio = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < tamanio; i++) {
            
            int cont = 1, cont2 = 0;

            int tamanio2 = Integer.parseInt(sc.nextLine());
            Integer[] datos = new Integer[tamanio2];
            String[] datos2 = sc.nextLine().split(" ");
            
            for (int j = 0; j < tamanio2; j++) {
                int arreglo = datos[j] = Integer.parseInt(datos2[j]);
            }
            
             Arrays.sort(datos);
             
             for (int j = 0; j < tamanio2; j++) {
                 if (datos[j] >= cont) {
                     cont++;
                    cont2++;
                 }
            }
             
            //System.out.println(Arrays.toString(datos));
            
            System.out.println("Case #" + (i+1) + ": " + cont2);

        }
    }
}
