import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l;

        do {
            l = sc.nextLine();
            String [] ln = l.split(" ");

            if (ln[0].equals("sum")) {
                if (ln.length == 3) {
                    try {
                        int x = Integer.parseInt(ln[1]);
                        int y = Integer.parseInt(ln[2]);
                        System.out.println(x + y);
                    } catch (NumberFormatException e) {
                        System.out.println(Color.RED + "Параметр должен быть целым числом" + Color.RESET);
                    }
                }
            } else if (ln[0].equals("mult")) {
                if (ln.length == 3) {
                    try {
                        int x = Integer.parseInt(ln[1]);
                        int y = Integer.parseInt(ln[2]);
                        System.out.println(x * y);
                    } catch (NumberFormatException e) {
                        System.out.println(Color.RED + "Параметр должен быть целым числом" + Color.RESET);
                    }
                }
            } else if (ln[0].equals("help")) {
                System.out.println("Команды:\n" +
                        Color.YELLOW + "sum <a> <b> - Сумма двух целых чисел\n" +
                        "mult <a> <b> - Произведение двух целых чисел\n" +
                        "exit - Завершить работу" + Color.RESET);
            }
        } while (!l.equals("exit"));

    }
}
