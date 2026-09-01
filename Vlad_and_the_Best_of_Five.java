import java.util.Scanner;

public class Vlad_and_the_Best_of_Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            String s = scanner.next();
            int countA = 0;
            
            // Loop through each character in the string
            for (char c : s.toCharArray()) {
                if (c == 'A') {
                    countA++;
                }
            }
            
            // If 'A' appears more than 2 times in a 5-character string, it's the majority
            if (countA > 2) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
        
        scanner.close();
    }
}