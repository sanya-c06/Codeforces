import java.util.Scanner;
import java.util.Arrays;

public class Medium_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Loop through each test case
        while (t-- > 0) {
            // Read the three numbers into an array
            int[] nums = new int[3];
            nums[0] = scanner.nextInt();
            nums[1] = scanner.nextInt();
            nums[2] = scanner.nextInt();
            
            // Sort the array in ascending order
            Arrays.sort(nums);
            
            // The medium number is always in the middle (index 1)
            System.out.println(nums[1]);
        }
        
        scanner.close();
    }
}