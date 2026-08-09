import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // Loop through each layer of feeling from 1 to n
        for (int i = 1; i <= n; i++) {
            
            // Odd layers are "hate", even layers are "love"
            if (i % 2 == 1) {
                System.out.print("I hate");
            } else {
                System.out.print("I love");
            }
            
            // If it's the last layer, end with " it"
            if (i == n) {
                System.out.print(" it");
            } 
            // Otherwise, connect to the next layer with " that "
            else {
                System.out.print(" that ");
            }
        }
        
        scanner.close();
    }
}