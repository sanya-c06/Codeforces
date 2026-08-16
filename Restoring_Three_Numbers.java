import java.util.Scanner;
import java.util.Arrays;

public class Restoring_Three_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the four numbers into an array
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Sort the array so the largest number (a+b+c) is at the last index
        Arrays.sort(nums);
        
        // Subtract the smaller sums from the total sum to get the individual numbers
        int a = nums[3] - nums[0];
        int b = nums[3] - nums[1];
        int c = nums[3] - nums[2];
        
        // Print the original three numbers
        System.out.println(a + " " + b + " " + c);
        
        scanner.close();
    }
}