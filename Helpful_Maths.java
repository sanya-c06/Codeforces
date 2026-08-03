import java.util.Scanner;
import java.util.Arrays;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        
        // 1. Split the string into an array of numbers, removing the '+' signs
        String[] numbers = s.split("\\+");
        
        // 2. Sort the array in ascending order
        Arrays.sort(numbers);
        
        // 3. Join the sorted numbers back together with '+' signs and print
        System.out.println(String.join("+", numbers));
        
        scanner.close();
    }
}