import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        //String str = sc.next();

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = 0;

        if (c == '+') {
            x = a + b;
        } else if (c == '-') {
            x = a - b;
        } else if (c == '*') {
            x = a * b;
        } else if (c == '/') {
            x = a / b;
        }
        System.out.println();
    }
}