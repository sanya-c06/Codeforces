import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        // If the distance is perfectly divisible by 5, 
        // you only need exactly (x / 5) steps.
        if (x % 5 == 0) {
            System.out.println(x / 5);
        } 
        // If there is a remainder (1, 2, 3, or 4), 
        // the elephant just takes one additional step to cover it.
        else {
            System.out.println((x / 5) + 1);
        }
        
        scanner.close();
    }
}