import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        // Array to store who gave a gift to each friend (using 1-based indexing)
        int[] givers = new int[n + 1];
        
        // Loop through each friend i who gave a gift to friend p
        for (int i = 1; i <= n; i++) {
            int p = scanner.nextInt();
            givers[p] = i; // Friend p received a gift from friend i
        }
        
        // Print the giver for friend 1, friend 2, ..., friend n
        for (int i = 1; i <= n; i++) {
            System.out.print(givers[i] + " ");
        }
        
        scanner.close();
    }
}