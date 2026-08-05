import java.util.Scanner;

public class Nearly_Lucky_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        
        int luckyCount = 0;
        
        // Loop through each digit in the string
        for (char c : n.toCharArray()) {
            if (c == '4' || c == '7') {
                luckyCount++;
            }
        }
        
        // Check if the total count of lucky digits is itself a lucky number (4 or 7)
        if (luckyCount == 4 || luckyCount == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}