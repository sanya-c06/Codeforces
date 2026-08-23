import java.util.Scanner;
import java.util.ArrayList;

public class Team_Olympiad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of children
        int n = scanner.nextInt();
        
        // Lists to store the 1-based indices of students for each subject
        ArrayList<Integer> programmers = new ArrayList<>();
        ArrayList<Integer> mathematicians = new ArrayList<>();
        ArrayList<Integer> sportsmen = new ArrayList<>();
        
        // Read each child's skill and sort their index into the correct list
        for (int i = 1; i <= n; i++) {
            int skill = scanner.nextInt();
            if (skill == 1) {
                programmers.add(i);
            } else if (skill == 2) {
                mathematicians.add(i);
            } else if (skill == 3) {
                sportsmen.add(i);
            }
        }
        
        // The maximum number of teams is dictated by the smallest group
        int w = Math.min(programmers.size(), Math.min(mathematicians.size(), sportsmen.size()));
        
        System.out.println(w);
        
        // Print the first 'w' students from each list
        for (int i = 0; i < w; i++) {
            System.out.println(programmers.get(i) + " " + mathematicians.get(i) + " " + sportsmen.get(i));
        }
        
        scanner.close();
    }
}