import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int m = 0;
        int k = 1;

        while (n != 0) {
            if (n % 2 == 1) {
                m += k * (n % 10);
                k *= 10;
            }
            n /= 10;
        }

        System.out.println(m);
    }
}
