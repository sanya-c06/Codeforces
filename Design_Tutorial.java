import java.util.Scanner;

public class Design_Tutorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        // If n is even, output 4 and n - 4
        if (n % 2 == 0) {
            System.out.println(4 + " " + (n - 4));
        } 
        // If n is odd, output 9 and n - 9
        else {
            System.out.println(9 + " " + (n - 9));
        }
        
        scanner.close();
    }
}