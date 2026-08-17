import java.util.Scanner;

public class Vasya_the_Hipster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of red socks (a) and blue socks (b)
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // The number of days with different socks is the smaller of the two quantities
        int differentSocks = Math.min(a, b);
        
        // The number of remaining pairs of the same color
        int sameSocks = Math.abs(a - b) / 2;
        
        // Output the results separated by a space
        System.out.println(differentSocks + " " + sameSocks);
        
        scanner.close();
    }
}