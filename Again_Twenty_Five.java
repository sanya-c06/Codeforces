import java.util.Scanner;

public class Again_Twenty_Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // We read the input to process it, but we don't actually need to use it
        scanner.nextLong(); 
        
        // The last two digits of 5^n (for n >= 2) are always 25
        System.out.println("25");
        
        scanner.close();
    }
}