import javax.print.attribute.standard.RequestingUserName;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    /*
    1)Создать массив - пирамидку N x N

    N - Ввводится

    Пример N = 4:
    1
    2 3
    4 5 6
    7 8 9 10

    int [][] arr = new int[5][];
     */

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] tempArr;

        int [][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
            tempArr = new int[i + 1];
            arr[i] = tempArr;
        }

        Random r  = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
