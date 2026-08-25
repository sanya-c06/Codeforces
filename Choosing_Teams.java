import java.util.Scanner;

public class Choosing_Teams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of students and required participations
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int eligibleStudents = 0;
        
        // Read each student's current participation count
        for (int i = 0; i < n; i++) {
            int y = scanner.nextInt();
            
            // Check if the student can participate k more times
            if (y + k <= 5) {
                eligibleStudents++;
            }
        }
        
        // Output the maximum number of full teams that can be formed
        System.out.println(eligibleStudents / 3);
        
        scanner.close();
    }
}