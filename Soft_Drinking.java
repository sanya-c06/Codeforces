import java.util.Scanner;

public class Soft_Drinking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read all the inputs
        int n = scanner.nextInt();  // number of friends
        int k = scanner.nextInt();  // bottles of drink
        int l = scanner.nextInt();  // milliliters per bottle
        int c = scanner.nextInt();  // number of limes
        int d = scanner.nextInt();  // slices per lime
        int p = scanner.nextInt();  // grams of salt
        int nl = scanner.nextInt(); // drink needed per toast
        int np = scanner.nextInt(); // salt needed per toast
        
        // Calculate the total possible toasts for each ingredient
        int drinkToasts = (k * l) / nl;
        int limeToasts = c * d;
        int saltToasts = p / np;
        
        // Find the limiting ingredient (the minimum of the three)
        int totalToasts = Math.min(drinkToasts, Math.min(limeToasts, saltToasts));
        
        // Divide by the number of friends to get toasts per friend
        System.out.println(totalToasts / n);
        
        scanner.close();
    }
}