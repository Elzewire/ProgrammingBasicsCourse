import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int max = 0;

        while (n != 0) {
            if (n % 10 > max) {
                max = n % 10;
            }
            n = n / 10;
        }

        System.out.println(max);
    }
}
