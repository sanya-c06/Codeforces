import java.util.Scanner;
import java.util.Arrays;

public class Amusing_Joke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the three strings
        String guest = scanner.next();
        String host = scanner.next();
        String pile = scanner.next();
        
        // Combine the guest and host names
        String combined = guest + host;
        
        // Convert to character arrays
        char[] combinedArray = combined.toCharArray();
        char[] pileArray = pile.toCharArray();
        
        // Sort both arrays alphabetically
        Arrays.sort(combinedArray);
        Arrays.sort(pileArray);
        
        // If the sorted arrays are exactly the same, the letters match perfectly
        if (Arrays.equals(combinedArray, pileArray)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}