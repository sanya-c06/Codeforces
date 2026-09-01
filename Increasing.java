import java.util.Scanner;
import java.util.HashSet;

public class Increasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            
            // A HashSet automatically ignores duplicate values
            HashSet<Integer> uniqueNumbers = new HashSet<>();
            
            // Read all numbers and add them to the set
            for (int i = 0; i < n; i++) {
                uniqueNumbers.add(scanner.nextInt());
            }
            
            // If the set size is the same as 'n', there were no duplicates
            if (uniqueNumbers.size() == n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}