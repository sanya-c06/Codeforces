import java.util.Scanner;

public class Short_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            String s = scanner.next();
            
            // Check if at least one character is in its correct place
            if (s.charAt(0) == 'a' || s.charAt(1) == 'b' || s.charAt(2) == 'c') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}