import java.util.Scanner;

public class Anton_and_Polyhedrons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of polyhedrons
        int n = scanner.nextInt();
        int totalFaces = 0;
        
        // Loop through each polyhedron string
        for (int i = 0; i < n; i++) {
            String shape = scanner.next();
            
            // Check only the first letter to determine the faces
            switch (shape.charAt(0)) {
                case 'T':
                    totalFaces += 4;
                    break;
                case 'C':
                    totalFaces += 6;
                    break;
                case 'O':
                    totalFaces += 8;
                    break;
                case 'D':
                    totalFaces += 12;
                    break;
                case 'I':
                    totalFaces += 20;
                    break;
            }
        }
        
        // Output the final sum
        System.out.println(totalFaces);
        
        scanner.close();
    }
}