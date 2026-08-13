import java.util.Scanner;

public class Game_with_Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Loop through each testcase
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            
            // If n is already a multiple of 3, the Second player wins.
            if (n % 3 == 0) {
                System.out.println("Second");
            } 
            // Otherwise, the First player can easily win on turn 1.
            else {
                System.out.println("First");
            }
        }
        
        scanner.close();
    }
}