import java.io.*;
import java.util.*;

public class Permutation_Cuts {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n - 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int max_val = -1;
            for (int i = 0; i < n - 1; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                if (a[i] > max_val) {
                    max_val = a[i];
                }
            }
            
            // The maximum value in the cut array must exactly be n - 1
            if (max_val != n - 1) {
                out.append("0\n");
                continue;
            }
            
            int first_max = -1, last_max = -1;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] == max_val) {
                    if (first_max == -1) first_max = i;
                    last_max = i;
                }
            }
            
            // Verifying the array is properly unimodal
            boolean possible = true;
            for (int i = 0; i < first_max; i++) {
                if (a[i] > a[i+1]) { possible = false; break; }
            }
            for (int i = last_max; i < n - 2; i++) {
                if (a[i] < a[i+1]) { possible = false; break; }
            }
            for (int i = first_max; i <= last_max; i++) {
                if (a[i] != max_val) { possible = false; break; }
            }
            
            if (!possible) {
                out.append("0\n");
                continue;
            }
            
            // L and R arrays trace the bounding indices where a[i] >= x
            int[] L = new int[n];
            int[] R = new int[n];
            for (int i = 1; i < n; i++) {
                L[i] = n;
                R[i] = -1;
            }
            
            for (int i = 0; i < n - 1; i++) {
                if (i < L[a[i]]) L[a[i]] = i;
                if (i > R[a[i]]) R[a[i]] = i;
            }
            // Propagate bounds downwards
            for (int i = n - 2; i >= 1; i--) {
                if (L[i+1] < L[i]) L[i] = L[i+1];
                if (R[i+1] > R[i]) R[i] = R[i+1];
            }
            
            long ans = 2; // n and n-1 can be placed in 2 different boundary extremes
            
            for (int x = n - 2; x >= 1; x--) {
                int L_curr = L[x], R_curr = R[x];
                int L_prev = L[x+1], R_prev = R[x+1];
                
                // Element 'x' expands bound box on both sides simultaneously (impossible)
                if (L_curr < L_prev && R_curr > R_prev) {
                    ans = 0;
                    break;
                } 
                // Expanding strictly on one of the sides provides 1 placement choice
                else if (L_curr < L_prev || R_curr > R_prev) {
                    // ans = (ans * 1) % 998244353;
                } 
                // Boundary stays the same; place 'x' in any available empty slot within it
                else {
                    int empty_spaces = (R_curr - L_curr + 2) - (n - x);
                    if (empty_spaces <= 0) {
                        ans = 0;
                        break;
                    }
                    ans = (ans * empty_spaces) % 998244353;
                }
            }
            
            out.append(ans).append("\n");
        }
        System.out.print(out);
    }
}