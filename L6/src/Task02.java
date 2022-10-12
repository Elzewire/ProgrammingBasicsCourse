import java.util.Random;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[sc.nextInt()];
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(1000) + 1000;
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        boolean flag = false;
        int tmp = 0;
        int prev = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            prev = arr[i] % 10;
            tmp = Math.abs(arr[i] / 10);
            while (tmp != 0) {
                if (tmp % 10 <= prev) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
                prev = tmp % 10;
                tmp /= 10;
            }

            if (flag) {
                index = i;
                break;
            }
        }

        System.out.println(flag);
        if (flag) {
            System.out.println(index);
        }
    }
}
