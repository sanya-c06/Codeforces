import java.util.Scanner;

public class Stones_on_the_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of stones and the string of colors
        int n = scanner.nextInt();
        String s = scanner.next();
        
        int removeCount = 0;
        
        // Loop through the string and compare adjacent stones
        for (int i = 0; i < n - 1; i++) {
            // If the current stone matches the next one, one must be removed
            if (s.charAt(i) == s.charAt(i + 1)) {
                removeCount++;
            }
        }
        
        // Output the total number of stones removed
        System.out.println(removeCount);
        
        scanner.close();
    }
}