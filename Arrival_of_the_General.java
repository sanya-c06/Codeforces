import java.util.Scanner;

public class Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int maxHeight = 0;
        int minHeight = 101; // Max possible height is 100, so 101 is a safe starting point
        
        int maxIndex = 0;
        int minIndex = 0;
        
        for (int i = 0; i < n; i++) {
            int currentHeight = scanner.nextInt();
            
            // Strictly greater ensures we keep the FIRST occurrence of the tallest
            if (currentHeight > maxHeight) {
                maxHeight = currentHeight;
                maxIndex = i;
            }
            
            // Less than OR equal ensures we keep the LAST occurrence of the shortest
            if (currentHeight <= minHeight) {
                minHeight = currentHeight;
                minIndex = i;
            }
        }
        
        // Calculate total swaps
        int totalSwaps = maxIndex + (n - 1 - minIndex);
        
        // If the tallest is behind the shortest, they will cross paths, saving 1 swap
        if (maxIndex > minIndex) {
            totalSwaps--;
        }
        
        System.out.println(totalSwaps);
        
        scanner.close();
    }
}