import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 25; i++) {
            if (s.nextInt() == 1) {
                System.out.print(Math.abs(i / 5 - 2) + Math.abs(i % 5 - 2));
                break;
            }
        }
    }
}