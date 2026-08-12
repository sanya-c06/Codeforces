import java.util.Scanner;
import java.util.ArrayList;

public class Sum_of_Round_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Loop through each test case
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            
            // Use an ArrayList since we don't know exactly how many round numbers there will be
            ArrayList<Integer> rounds = new ArrayList<>();
            int multiplier = 1; 
            
            // Extract digits from right to left
            while (n > 0) {
                int digit = n % 10;
                
                // If the digit is not zero, multiply it by its place value and save it
                if (digit > 0) {
                    rounds.add(digit * multiplier);
                }
                
                // Remove the last digit and increase the place value multiplier
                n /= 10;
                multiplier *= 10;
            }
            
            // First print how many round numbers we found
            System.out.println(rounds.size());
            
            // Then print the actual round numbers separated by spaces
            for (int num : rounds) {
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next line for the next testcase
        }
        
        scanner.close();
    }
}