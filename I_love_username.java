import java.util.Scanner;

public class I_love_username {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the total number of contests
        int n = scanner.nextInt();
        
        // The first contest sets the initial minimum and maximum records
        int minScore = scanner.nextInt();
        int maxScore = minScore;
        int amazingCount = 0;
        
        // Loop through the remaining contests
        for (int i = 1; i < n; i++) {
            int currentScore = scanner.nextInt();
            
            // Check if the current score strictly breaks the highest record
            if (currentScore > maxScore) {
                maxScore = currentScore;
                amazingCount++;
            } 
            // Check if the current score strictly breaks the lowest record
            else if (currentScore < minScore) {
                minScore = currentScore;
                amazingCount++;
            }
        }
        
        // Output the total number of amazing performances
        System.out.println(amazingCount);
        
        scanner.close();
    }
}