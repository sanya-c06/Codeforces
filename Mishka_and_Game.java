import java.util.Scanner;

public class Mishka_and_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of rounds
        int n = scanner.nextInt();
        int balance = 0;
        
        // Loop through each round
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt(); // Mishka's roll
            int c = scanner.nextInt(); // Chris's roll
            
            // Adjust the balance based on who won the round
            if (m > c) {
                balance++;
            } else if (c > m) {
                balance--;
            }
        }
        
        // Determine the overall winner
        if (balance > 0) {
            System.out.println("Mishka");
        } else if (balance < 0) {
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }
        
        scanner.close();
    }
}