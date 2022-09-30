import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample2 {
    public static void main(String[] args) {
        //String regex = "^[]$";
        Pattern pattern = Pattern.compile("^\\w+$");

        System.out.println(pattern.matcher("012930129").matches());
        System.out.println(pattern.matcher("FFF").matches());
        System.out.println(pattern.matcher("FFFF").matches());
    }
}
