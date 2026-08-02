import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), k = s.nextInt(), c = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = s.nextInt();
        for (int x : a) if (x > 0 && x >= a[k - 1]) c++;
        System.out.print(c);
    }
}