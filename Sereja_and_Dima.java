import java.util.Scanner;

public class Sereja_and_Dima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of cards
        int n = scanner.nextInt();
        int[] cards = new int[n];
        
        // Fill the array with the card values
        for (int i = 0; i < n; i++) {
            cards[i] = scanner.nextInt();
        }
        
        // Pointers for the leftmost and rightmost available cards
        int left = 0;
        int right = n - 1;
        
        int serejaScore = 0;
        int dimaScore = 0;
        boolean serejaTurn = true; // Tracks whose turn it is
        
        // Loop until all cards are taken
        while (left <= right) {
            int chosenCard;
            
            // Greedily choose the larger of the two ends
            if (cards[left] > cards[right]) {
                chosenCard = cards[left];
                left++;  // Move the left pointer inwards
            } else {
                chosenCard = cards[right];
                right--; // Move the right pointer inwards
            }
            
            // Add the chosen card to the correct player's score
            if (serejaTurn) {
                serejaScore += chosenCard;
            } else {
                dimaScore += chosenCard;
            }
            
            // Alternate the turn
            serejaTurn = !serejaTurn;
        }
        
        // Print the final scores separated by a space
        System.out.println(serejaScore + " " + dimaScore);
        
        scanner.close();
    }
}