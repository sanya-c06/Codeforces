import java.util.Scanner;

public class Fox_And_Snake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        boolean rightHash = true; // Tracks whether the single hash is on the right or left
        
        for (int i = 1; i <= n; i++) {
            // Odd rows are completely filled with '#'
            if (i % 2 != 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            } 
            // Even rows have a single '#' alternating between right and left
            else {
                if (rightHash) {
                    for (int j = 0; j < m - 1; j++) System.out.print(".");
                    System.out.print("#");
                } else {
                    System.out.print("#");
                    for (int j = 0; j < m - 1; j++) System.out.print(".");
                }
                rightHash = !rightHash; // Toggle the position for the next snake row
            }
            System.out.println();
        }
        
        scanner.close();
    }
}