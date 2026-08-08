import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of drinks
        int n = scanner.nextInt();
        
        // Use a double for the sum to ensure precise decimal division later
        double sum = 0;
        
        // Loop through each drink's percentage and add it to the total sum
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }
        
        // The final percentage is just the average (sum divided by number of drinks)
        System.out.println(sum / n);
        
        scanner.close();
    }
}