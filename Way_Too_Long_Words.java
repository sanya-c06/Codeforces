import java.util.Scanner;

public class  Way_Too_Long_Words{ 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        while (n-- > 0) {
            String w = s.next();
            int l = w.length();
            System.out.println(l > 10 ? "" + w.charAt(0) + (l - 2) + w.charAt(l - 1) : w);
        }
    }
}