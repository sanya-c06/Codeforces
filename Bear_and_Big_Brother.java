import java.util.Scanner;

public class Bear_and_Big_Brother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read Limak's weight (a) and Bob's weight (b)
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int years = 0;
        
        // Loop as long as Limak's weight is less than or equal to Bob's
        while (a <= b) {
            a *= 3; // Limak's weight triples
            b *= 2; // Bob's weight doubles
            years++; // Increment the year counter
        }
        
        // Output the total number of years it took
        System.out.println(years);
        
        scanner.close();
    }
}