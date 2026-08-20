import java.util.Scanner;

public class Holiday_Of_Equality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of citizens
        int n = scanner.nextInt();
        
        int maxWealth = 0;
        int currentSum = 0;
        
        // Find the maximum wealth and the sum of all wealth on the fly
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            maxWealth = Math.max(maxWealth, a);
            currentSum += a;
        }
        
        // The total cost is the target total minus the current total
        int totalCost = (n * maxWealth) - currentSum;
        
        System.out.println(totalCost);
        
        scanner.close();
    }
}