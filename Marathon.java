import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Loop through each test case
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt(); // Timur's distance
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            
            int participantsInFront = 0;
            
            // Check each participant's distance against Timur's
            if (b > a) participantsInFront++;
            if (c > a) participantsInFront++;
            if (d > a) participantsInFront++;
            
            // Output the total count
            System.out.println(participantsInFront);
        }
        
        scanner.close();
    }
}