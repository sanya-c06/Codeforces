import java.util.Scanner;

public class Queue_at_the_School {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read n (number of children) and t (time in seconds)
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        
        // Read the initial queue arrangement
        String s = scanner.next();
        
        // Convert string to character array for easy swapping
        char[] queue = s.toCharArray();
        
        // Simulate the queue changes for 't' seconds
        for (int time = 0; time < t; time++) {
            // Loop through the queue to find "BG" pairs
            for (int i = 0; i < n - 1; i++) {
                if (queue[i] == 'B' && queue[i + 1] == 'G') {
                    // Swap the boy and the girl
                    queue[i] = 'G';
                    queue[i + 1] = 'B';
                    
                    // Skip the next index so we don't move the same boy twice in one second
                    i++; 
                }
            }
        }
        
        // Print the final arrangement
        System.out.println(new String(queue));
        
        scanner.close();
    }
}