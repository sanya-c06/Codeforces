import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0, n = s.nextInt();
        while (n-- > 0) {
            x += s.next().contains("+") ? 1 : -1;
        }
        System.out.print(x);
    }
}