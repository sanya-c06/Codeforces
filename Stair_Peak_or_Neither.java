import java.util.Scanner;

public class Stair_Peak_or_Neither {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Loop through each test case
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            // Check for STAIR condition
            if (a < b && b < c) {
                System.out.println("STAIR");
            } 
            // Check for PEAK condition
            else if (a < b && b > c) {
                System.out.println("PEAK");
            } 
            // If neither, it's NONE
            else {
                System.out.println("NONE");
            }
        }
        
        scanner.close();
    }
}