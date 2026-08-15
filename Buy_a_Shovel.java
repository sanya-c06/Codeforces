import java.util.Scanner;

public class Buy_a_Shovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the price of one shovel (k) and the coin denomination (r)
        int k = scanner.nextInt();
        int r = scanner.nextInt();
        
        // Loop to find the minimum number of shovels (from 1 to 10)
        for (int i = 1; i <= 10; i++) {
            int totalCost = i * k;
            
            // If the total cost ends in 0 or ends in r, we found our answer
            if (totalCost % 10 == 0 || totalCost % 10 == r) {
                System.out.println(i);
                break;
            }
        }
        
        scanner.close();
    }
}