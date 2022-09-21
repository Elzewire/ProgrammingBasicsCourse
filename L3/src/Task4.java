import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = Helper.genArr2D(n, n);

        Helper.printArr2D(arr);

        System.out.println(task4_1(arr));
        System.out.println(task4_2(arr));
        System.out.println(Arrays.toString(task4_3(arr)));
    }

    public static int task4_1(int [][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static int task4_2(int [][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static int [] task4_3(int [][] arr) {
        int [] sum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum[i] += arr[i][j];
            }
        }
        return sum;
    }
}
