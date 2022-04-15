import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String s = "bla bla <alex@stackhowto.com> && mail:emily@gmail.com";
        String st = "alex@stackhowto.com";
        Matcher m = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(st);
//        System.out.println(m.find());
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
