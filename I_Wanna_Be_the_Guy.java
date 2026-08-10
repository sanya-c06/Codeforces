import java.util.Scanner;
import java.util.HashSet;

public class I_Wanna_Be_the_Guy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the total number of levels
        int n = scanner.nextInt();
        
        // A HashSet automatically ignores duplicate values
        HashSet<Integer> levels = new HashSet<>();
        
        // Read the levels Little X can pass and add them to the set
        int p = scanner.nextInt();
        for (int i = 0; i < p; i++) {
            levels.add(scanner.nextInt());
        }
        
        // Read the levels Little Y can pass and add them to the set
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            levels.add(scanner.nextInt());
        }
        
        // If the number of unique levels they can pass equals n, they can beat the game
        if (levels.size() == n) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
        
        scanner.close();
    }
}