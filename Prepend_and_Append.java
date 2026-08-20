import java.util.Scanner;

public class Prepend_and_Append {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            
            int left = 0;
            int right = n - 1;
            
            // Move pointers inward as long as the ends are different
            while (left < right && s.charAt(left) != s.charAt(right)) {
                left++;
                right--;
            }
            
            // The remaining length is the distance between the pointers
            System.out.println(right - left + 1);
        }
        
        scanner.close();
    }
}