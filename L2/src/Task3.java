import java.util.Scanner;

public class Task3 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(task3_1(n));
        System.out.println(task3_2(n));
    }

    public static int task3_1(int n) {
        int s = 0;
        for (int i = 0; i <= n; i++) {
            s += i;
        }
        return s;
    }

    public static int task3_2(int n) {
        int s = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                s += i;
            }
        }
        return s;
    }
}
