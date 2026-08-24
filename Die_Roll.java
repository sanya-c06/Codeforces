import java.util.Scanner;

public class Die_Roll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Find the maximum of Yakko's and Wakko's rolls instantly
        int maxRoll = Math.max(scanner.nextInt(), scanner.nextInt());
        
        // Hardcode the reduced fractions for max rolls 1 through 6
        // Index 0 is left empty because dice rolls start at 1
        String[] probabilities = {"", "1/1", "5/6", "2/3", "1/2", "1/3", "1/6"};
        
        // Output the corresponding probability
        System.out.println(probabilities[maxRoll]);
        
        scanner.close();
    }
}