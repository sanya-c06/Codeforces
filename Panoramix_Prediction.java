import java.util.Scanner;

public class Panoramix_Prediction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // List of all prime numbers up to slightly past 50
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53};
        
        boolean isNextPrime = false;
        
        // Loop through the primes to find n
        for (int i = 0; i < primes.length - 1; i++) {
            if (primes[i] == n) {
                // Check if the very next prime in the list matches m
                if (primes[i + 1] == m) {
                    isNextPrime = true;
                }
                break; // Stop searching once n is found
            }
        }
        
        if (isNextPrime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}