import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int f = 1;
        int p = 0;
        int temp = f;

        for (int i = 0; i < n; i++) {
            System.out.print(f + " ");
            temp = f;
            f += p;
            p = temp;
        }
    }

}
