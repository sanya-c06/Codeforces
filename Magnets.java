import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the total number of magnets
        int n = scanner.nextInt();
        
        // We always start with at least 1 group for the first magnet
        int groups = 1; 
        
        // Read the first magnet's orientation
        String previousMagnet = scanner.next();
        
        // Loop through the rest of the magnets
        for (int i = 1; i < n; i++) {
            String currentMagnet = scanner.next();
            
            // If this magnet's orientation is different from the last one, it forms a new group
            if (!currentMagnet.equals(previousMagnet)) {
                groups++;
            }
            
            // Update previousMagnet to the current one for the next iteration
            previousMagnet = currentMagnet;
        }
        
        // Output the total number of groups
        System.out.println(groups);
        
        scanner.close();
    }
}