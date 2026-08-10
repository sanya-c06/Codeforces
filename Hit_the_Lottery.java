import java.util.Scanner;

public class Hit_the_Lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the total amount of money
        int n = scanner.nextInt();
        
        // Array of denominations sorted from largest to smallest
        int[] bills = {100, 20, 10, 5, 1};
        int totalBills = 0;
        
        // Loop through each denomination
        for (int bill : bills) {
            // Add how many of this bill we can use
            totalBills += n / bill;
            
            // Update the remaining money using the modulo operator
            n %= bill;
        }
        
        // Print the final count of bills
        System.out.println(totalBills);
        
        scanner.close();
    }
}