import java.util.Scanner;

public class Flying_Saucer_Segments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        
        long result = 1;
        long base = 3 % m;
        long exp = n;
        
        // Fast Modular Exponentiation to calculate (3^n) % m
        while (exp > 0) {
            // If the current exponent bit is odd, multiply the base with the result
            if (exp % 2 == 1) {
                result = (result * base) % m;
            }
            // Square the base and halve the exponent
            base = (base * base) % m;
            exp /= 2;
        }
        
        // Subtract 1 as per the formula (3^n - 1). 
        // We add 'm' before taking modulo to handle potential negative numbers in Java.
        System.out.println((result - 1 + m) % m);
        
        scanner.close();
    }
}