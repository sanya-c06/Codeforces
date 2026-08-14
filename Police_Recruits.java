import java.util.Scanner;

public class Police_Recruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of events
        int n = scanner.nextInt();
        
        int availableOfficers = 0;
        int untreatedCrimes = 0;
        
        // Loop through all events
        for (int i = 0; i < n; i++) {
            int event = scanner.nextInt();
            
            if (event > 0) {
                // If it's a positive number, add to available officers
                availableOfficers += event;
            } else if (event == -1) {
                // If it's a crime (-1), check if we have officers
                if (availableOfficers > 0) {
                    availableOfficers--; // An officer investigates the crime
                } else {
                    untreatedCrimes++;   // No officers available, crime goes untreated
                }
            }
        }
        
        // Output the total number of untreated crimes
        System.out.println(untreatedCrimes);
        
        scanner.close();
    }
}