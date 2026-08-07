import java.util.Scanner;

public class In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of people asked
        int n = scanner.nextInt();
        
        // Loop through each person's response
        for (int i = 0; i < n; i++) {
            // If anyone answers 1, it's a hard problem
            if (scanner.nextInt() == 1) {
                System.out.println("HARD");
                scanner.close();
                return; // Immediately exit the program, no need to check the rest
            }
        }
        
        // If the loop finishes without finding a 1, it must be easy
        System.out.println("EASY");
        
        scanner.close();
    }
}