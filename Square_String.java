import java.util.Scanner;

public class Square_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            String s = scanner.next();
            int len = s.length();
            
            // A square string must have an even length
            if (len % 2 != 0) {
                System.out.println("NO");
            } else {
                // Cut the string into two equal halves
                String firstHalf = s.substring(0, len / 2);
                String secondHalf = s.substring(len / 2);
                
                // Check if the two halves are exactly the same
                if (firstHalf.equals(secondHalf)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        
        scanner.close();
    }
}