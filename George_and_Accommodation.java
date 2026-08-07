import java.util.Scanner;

public class George_and_Accommodation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of rooms
        int n = scanner.nextInt();
        
        int availableRooms = 0;
        
        // Loop through each room
        for (int i = 0; i < n; i++) {
            int p = scanner.nextInt(); // People already living in the room
            int q = scanner.nextInt(); // Total capacity of the room
            
            // Check if the remaining capacity is at least 2
            if (q - p >= 2) {
                availableRooms++;
            }
        }
        
        // Output the total number of valid rooms
        System.out.println(availableRooms);
        
        scanner.close();
    }
}