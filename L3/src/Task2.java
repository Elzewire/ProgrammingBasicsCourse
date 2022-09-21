/*
2) Транспонировать матрицу N x M

N, M - Ввводится

Пример:
1 2 3
4 5 6

1 4
2 5
4 6
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] mat = new int[n][m];
        int [][] matT = new int[m][n];

        Random r  = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = r.nextInt(10);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matT[j][i] = mat[i][j];
            }
        }

        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
        System.out.println();
        for (int i = 0; i < matT.length; i++) {
            System.out.println(Arrays.toString(matT[i]));
        }
    }
}
