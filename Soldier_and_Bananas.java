import java.util.Scanner;

public class Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read k (cost of first banana), n (initial dollars), and w (number of bananas)
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        
        int totalCost = 0;
        
        // Loop from the 1st banana up to the w-th banana
        for (int i = 1; i <= w; i++) {
            totalCost += i * k; // The i-th banana costs i * k
        }
        
        // Calculate the difference between the total cost and the money he has
        int borrow = totalCost - n;
        
        // If the amount to borrow is negative (he has enough money), print 0
        if (borrow < 0) {
            System.out.println(0);
        } else {
            System.out.println(borrow);
        }
        
        scanner.close();
    }
}