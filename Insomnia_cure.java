import java.util.Scanner;

public class Insomnia_cure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the inputs
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        
        int damagedDragons = 0;
        
        // Loop through every dragon from 1 to d
        for (int i = 1; i <= d; i++) {
            // If the dragon's number is divisible by k, l, m, or n, it gets damaged
            if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
                damagedDragons++;
            }
        }
        
        // Output the final count
        System.out.println(damagedDragons);
        
        scanner.close();
    }
}