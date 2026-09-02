import java.util.Scanner;

public class Minutes_Before_the_New_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int h = scanner.nextInt();
            int m = scanner.nextInt();
            
            // Calculate total elapsed minutes and subtract from 1440
            int remainingMinutes = 1440 - (h * 60 + m);
            
            System.out.println(remainingMinutes);
        }
        
        scanner.close();
    }
}