import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        /*
            18:53:00
         */
        Pattern p = Pattern.compile("([0-1]\\d|2[0-3]):(\\d{2}):(\\d{2})");

        System.out.println(p.matcher("18:53:00").matches());
        System.out.println(p.matcher("21:12:65").matches());
        System.out.println(p.matcher("23:05:45").matches());
        System.out.println(p.matcher("25:12:00").matches());

    }
}
