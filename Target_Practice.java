import java.util.Scanner;

public class Target_Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int totalScore = 0;
            
            // Loop through each of the 10 rows
            for (int i = 0; i < 10; i++) {
                String row = scanner.next();
                
                // Loop through each character in the row
                for (int j = 0; j < 10; j++) {
                    if (row.charAt(j) == 'X') {
                        // Find the distance to the closest edge
                        int ringIndex = Math.min(Math.min(i, 9 - i), Math.min(j, 9 - j));
                        
                        // The point value is the ring index + 1
                        totalScore += (ringIndex + 1);
                    }
                }
            }
            
            // Output the final calculated score for the test case
            System.out.println(totalScore);
        }
        
        scanner.close();
    }
}