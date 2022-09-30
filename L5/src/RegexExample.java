import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        //String regex = "^[]$";
        Pattern pattern = Pattern.compile("([\\w.]+)@([\\w.]+)");

        System.out.println(pattern.matcher("asdasd@gmail.com").matches());
        System.out.println(pattern.matcher("asdasdgmail.com").matches());
        System.out.println(pattern.matcher("asdasd@@@gmail.com").matches());
        System.out.println(pattern.matcher("@gmail.com").matches());
        System.out.println(pattern.matcher("asdasd@").matches());
        System.out.println(pattern.matcher("a@gmail.com").matches());
        System.out.println(pattern.matcher("asdasd@m").matches());
        System.out.println();

        String str = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n" +
                "tempor incididunt asdasd@@@gmail.com ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n" +
                "quis nostrud exercitation asdasd@gmail.com ullamco laboris nisi ut aliquip ex ea commodo\n" +
                "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n" +
                "cillum dolore eu fugiat nulla pariatur. Excepteur fgd@gmail2.com sint occaecat cupidatat non\n" +
                "proident, sunt in culpa qui asfghf@gmail3.com officia deserunt mollit anim id est laborum.";

        Matcher m = pattern.matcher(str);

        while (m.find()) {
            System.out.println(m.group(0));
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println();
        }
    }
}
