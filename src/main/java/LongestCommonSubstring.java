
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author pipes
 */

public class LongestCommonSubstring {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String findstem(String arr[]) {
        // Determine size of the array
        int n = arr.length;

        // Take first word from array as reference
        String s = arr[0];
        int len = s.length();

        String res = "";

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {

                // generating all possible substrings
                // of our reference string arr[0] i.e s
                String stem = s.substring(i, j);
                int k = 1;
                for (k = 1; k < n; k++) // Check if the generated stem is
                // common to all words
                {
                    if (!arr[k].contains(stem)) {
                        break;
                    }
                }

                // If current substring is present in
                // all strings and its length is greater
                // than current result
                if (k == n && res.length() < stem.length()) {
                    res = stem;
                }
            }
        }

        return res;
    }

    // Driver Code
    public static void main(String args[]) throws IOException {

        int tamanio = Integer.parseInt(br.readLine());
        String[] arr = new String[tamanio];
        for (int i = 0; i < tamanio; i++) {
            arr[i] = br.readLine();  // llena el array pasandoloe datos
        }

        // Function call
        String stems = findstem(arr);
        System.out.println(stems.length());
    }
}
