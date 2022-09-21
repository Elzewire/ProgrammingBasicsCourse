import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        int [][] mat1 = Helper.genArr2D(n, m);
        int [][] mat2 = Helper.genArr2D(m, d);

        int [][] resMat = new int[n][d];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                for (int k = 0; k < m; k++) {
                    resMat[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        Helper.printArr2D(mat1);
        Helper.printArr2D(mat2);
        Helper.printArr2D(resMat);
    }
}
