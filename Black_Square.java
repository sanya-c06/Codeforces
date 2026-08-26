import java.util.Scanner;

public class Black_Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array to store the calorie costs for the 4 strips
        int[] calories = new int[4];
        for (int i = 0; i < 4; i++) {
            calories[i] = scanner.nextInt();
        }
        
        // Read the string representing the sequence of touches
        String s = scanner.next();
        int totalCalories = 0;
        
        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Subtract '1' to convert the char into a 0-based array index
            totalCalories += calories[s.charAt(i) - '1'];
        }
        
        // Output the total calculated calories
        System.out.println(totalCalories);
        
        scanner.close();
    }
}