import java.util.Scanner;

public class Team { 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), c = 0;
        
        while (n-- > 0) 
            if (s.nextInt() + s.nextInt() + s.nextInt() > 1) c++;
            
        System.out.print(c);
    }
}