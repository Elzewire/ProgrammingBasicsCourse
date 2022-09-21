import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] arr1 = Helper.generate(n, m);
        int [][] arr2 = Helper.generate(n, m);
        int [][] arr3 = new int [n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        Helper.printArray(arr1);
        Helper.printArray(arr2);
        Helper.printArray(arr3);
    }
}
