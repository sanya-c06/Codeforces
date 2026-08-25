import java.util.Scanner;
import java.util.HashSet;

public class ICPC_Balloons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            
            // A HashSet only stores unique items, automatically ignoring duplicates
            HashSet<Character> uniqueProblems = new HashSet<>();
            
            // Add every character from the string into the set
            for (char c : s.toCharArray()) {
                uniqueProblems.add(c);
            }
            
            // The answer is simply the length of the string plus the number of unique characters
            System.out.println(n + uniqueProblems.size());
        }
        
        scanner.close();
    }
}