import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of teams
        int n = scanner.nextInt();
        
        int[] home = new int[n];
        int[] guest = new int[n];
        
        // Store the home and guest uniform colors for each team
        for (int i = 0; i < n; i++) {
            home[i] = scanner.nextInt();
            guest[i] = scanner.nextInt();
        }
        
        int count = 0;
        
        // Compare every team's home uniform with every other team's guest uniform
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // If the host's home color matches the guest's guest color, increment count
                if (home[i] == guest[j]) {
                    count++;
                }
            }
        }
        
        // Print the total number of times the host wears the guest uniform
        System.out.println(count);
        
        scanner.close();
    }
}