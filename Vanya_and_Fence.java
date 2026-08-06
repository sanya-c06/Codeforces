import java.util.Scanner;

public class Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of friends (n) and the height of the fence (h)
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        
        int totalWidth = 0;
        
        // Loop through each friend's height
        for (int i = 0; i < n; i++) {
            int height = scanner.nextInt();
            
            // If the friend is taller than the fence, they bend down (width = 2)
            if (height > h) {
                totalWidth += 2;
            } 
            // Otherwise, they walk normally (width = 1)
            else {
                totalWidth += 1;
            }
        }
        
        // Output the final calculated width
        System.out.println(totalWidth);
        
        scanner.close();
    }
}