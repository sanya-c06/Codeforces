import java.util.Scanner;

public class Calculating_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Use 'long' because n can be up to 10^15, which is too big for a standard 'int'
        long n = scanner.nextLong();
        
        // If n is even
        if (n % 2 == 0) {
            System.out.println(n / 2);
        } 
        // If n is odd
        else {
            System.out.println(-(n + 1) / 2);
        }
        
        scanner.close();
    }
}