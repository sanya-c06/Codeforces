import java.util.Scanner;

public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        
        // Keep checking the next years indefinitely until we find a match
        while (true) {
            year++; // Move to the next year
            
            // Extract the individual digits
            int a = year / 1000;           // First digit (Thousands)
            int b = (year / 100) % 10;     // Second digit (Hundreds)
            int c = (year / 10) % 10;      // Third digit (Tens)
            int d = year % 10;             // Fourth digit (Ones)
            
            // Check if all four digits are distinct
            if (a != b && a != c && a != d && b != c && b != d && c != d) {
                System.out.println(year);
                break; // Exit the loop once the beautiful year is found
            }
        }
        
        scanner.close();
    }
}