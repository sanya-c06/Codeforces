import java.util.Scanner;

public class New_Year_and_Hurry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of problems (n) and travel time (k)
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        // Total contest time is 4 hours, which is 240 minutes
        int timeLeft = 240 - k;
        int solvedProblems = 0;
        
        // Loop through the problems from 1 to n
        for (int i = 1; i <= n; i++) {
            int timeRequired = 5 * i;
            
            // If Limak has enough time to solve the current problem, subtract the time
            if (timeLeft >= timeRequired) {
                timeLeft -= timeRequired;
                solvedProblems++;
            } else {
                // If he doesn't have enough time, he must stop to make it to the party
                break;
            }
        }
        
        // Output the maximum number of problems he can solve
        System.out.println(solvedProblems);
        
        scanner.close();
    }
}