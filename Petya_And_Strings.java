import java.util.Scanner;

public class Petya_And_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Read the two strings and convert them to lowercase immediately
        String string1 = scanner.next().toLowerCase();
        String string2 = scanner.next().toLowerCase();
        
        // 2. Compare the two lowercase strings
        int result = string1.compareTo(string2);
        
        // 3. Check the result and print the required output
        if (result < 0) {
            System.out.println("-1");
        } else if (result > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        
        scanner.close();
    }
}