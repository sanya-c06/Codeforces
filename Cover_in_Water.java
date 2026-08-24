import java.util.Scanner;

public class Cover_in_Water {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            
            // Check for the "infinite water" condition
            if (s.contains("...")) {
                System.out.println(2);
            } else {
                // Otherwise, count the total number of empty cells
                int count = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '.') {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
        
        scanner.close();
    }
}