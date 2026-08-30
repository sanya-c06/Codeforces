import java.util.Scanner;

public class Vanya_and_Cubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the total number of cubes
        int n = scanner.nextInt();
        
        int height = 0;
        int cubesForCurrentLevel = 0;
        
        // Keep building as long as we have enough cubes for the next level
        while (n >= cubesForCurrentLevel + (height + 1)) {
            height++;
            
            // The next level needs all the cubes of the previous level, plus 'height' more
            cubesForCurrentLevel += height;
            
            // Subtract the cubes used for this level from our total pile
            n -= cubesForCurrentLevel;
        }
        
        // Output the maximum completed height
        System.out.println(height);
        
        scanner.close();
    }
}