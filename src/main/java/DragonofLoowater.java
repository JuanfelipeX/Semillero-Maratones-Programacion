import java.io.*;
import java.util.*;

public class DragonofLoowater  {
   
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);

        int numberHeads = sc.nextInt();
        int numberKnights = sc.nextInt();
        
        while (numberHeads != 0 || numberKnights != 0) {
            
            int[] heads = new int[numberHeads];
            int[] knightsHeights = new int[numberKnights];
            for (int i = 0; i < numberHeads; i++) {
                heads[i] = sc.nextInt();
            }
            for (int i = 0; i < numberKnights; i++) {
                knightsHeights[i] = sc.nextInt();
            }
            Arrays.sort(heads);
            Arrays.sort(knightsHeights);
           
            int gold = 0;
            int cut = 0;
            int indexH = 0;
            for (int i = 0; i < numberKnights; i++) {
                if (knightsHeights[i] < heads[indexH]) {
                    continue;
                }
                cut++;
                gold += knightsHeights[i];
                indexH++;
                if (indexH >= numberHeads) {
                    break;
                }
            }
           
            if (cut == numberHeads) {
                System.out.println(gold+"\n");
            } else {
                System.out.println("Loowater is doomed!\n");
            }
           
            numberHeads = sc.nextInt();
            numberKnights = sc.nextInt();
        }
    }
}