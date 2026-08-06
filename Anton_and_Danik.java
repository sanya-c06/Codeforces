import java.util.Scanner;

public class Anton_and_Danik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of games and the string of outcomes
        int n = scanner.nextInt();
        String s = scanner.next();
        
        int antonCount = 0;
        int danikCount = 0;
        
        // Loop through each character in the string
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                antonCount++;
            } else if (c == 'D') {
                danikCount++;
            }
        }
        
        // Compare the scores and print the appropriate result
        if (antonCount > danikCount) {
            System.out.println("Anton");
        } else if (danikCount > antonCount) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
        
        scanner.close();
    }
}