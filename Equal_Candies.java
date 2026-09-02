import java.util.Scanner;

public class Equal_Candies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            
            int sum = 0;
            int min = Integer.MAX_VALUE;
            
            // Read values on the fly, tracking both the sum and the absolute minimum
            for (int i = 0; i < n; i++) {
                int candies = scanner.nextInt();
                sum += candies;
                if (candies < min) {
                    min = candies;
                }
            }
            
            // Total eaten = Original Sum - Final Sum
            System.out.println(sum - (n * min));
        }
        
        scanner.close();
    }
}