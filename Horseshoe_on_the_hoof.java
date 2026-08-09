import java.util.Scanner;
import java.util.HashSet;

public class Horseshoe_on_the_hoof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // A HashSet only keeps unique items
        HashSet<Integer> uniqueColors = new HashSet<>();
        
        // Read the 4 horseshoe colors and add them to the set
        for (int i = 0; i < 4; i++) {
            uniqueColors.add(scanner.nextInt());
        }
        
        // The number to buy is 4 minus the number of unique colors we already have
        System.out.println(4 - uniqueColors.size());
        
        scanner.close();
    }
}