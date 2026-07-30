import java.util.Scanner;

public class Bigrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();
            int twos = 0, threes = 0;
            
            for (int i = 0; i < k; i++) {
                int c = sc.nextInt();
                if (c >= 2) twos++;
                if (c >= 3) threes++;
            }
            
            // Prints YES if we have at least one 3-count or at least two 2-counts, else NO
            System.out.println((threes > 0 || twos > 1) ? "YES" : "NO");
        }
        sc.close();
    }
}