import java.util.Scanner;
import java.util.Arrays;

public class The_New_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to hold the three coordinates
        int[] coordinates = new int[3];
        coordinates[0] = scanner.nextInt();
        coordinates[1] = scanner.nextInt();
        coordinates[2] = scanner.nextInt();
        
        // Sort the array from smallest to largest
        Arrays.sort(coordinates);
        
        // The total minimum distance is simply the largest minus the smallest
        System.out.println(coordinates[2] - coordinates[0]);
        
        scanner.close();
    }
}