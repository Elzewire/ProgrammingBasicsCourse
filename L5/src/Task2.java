import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c;
        /*
         (myMail)@(mail).(com)
         1 - любой символ алфавита или цифра
         2, 3 - любой символ алфавита
         */
        String valid1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String valid2 = "0123456789";
        int state = 1;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            switch (state) {
                case 1:
                    if (c == '@') {
                        state = 2;
                    } else {
                        if (!(valid1 + valid2).contains("" + c)) {
                            state = 0;
                        }
                    }
                    break;

                case 2:
                    break;

                case 3:
                    break;
            }
            if (state == 0) {
                break;
            }
        }
        System.out.println(state);
    }
}
