import java.util.Scanner;

public class Brexiting {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String s = sc.nextLine();
        
        lastSearch(s);
        
    }
    
    static void lastSearch(String s){
        if (s.endsWith("a") || s.endsWith("e") || s.endsWith("i") || s.endsWith("o") || s.endsWith("u")) {
            s = s + "ntry";
            System.out.println(s);
        } else {
            String search = s.substring(0, s.length() - 1);
            lastSearch(search);
        }
    }
}