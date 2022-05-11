import com.sun.source.doctree.SeeTree;

import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) throws ParseException {
        String s = "bla bla <alex@stackhowto.com> && mail:emily@gmail.com";
        String st = "alex@stackhowto.com";
        Matcher m = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(st);
//        System.out.println(m.find());
        while (m.find()){
            System.out.println(m.group());
        }
        String testing  = "War ended in 6724-10-1945, UN was established on 15-08-194789";
        System.out.println(distinct(testing));

    }

    static int distinct(String statement) throws ParseException {
        Matcher m = Pattern.compile("([ ]\\d{1,2}-\\d{1,2}-[0-9]{1,4})").matcher(statement);
        Set<String> ans = new HashSet<>();
        while (m.find()){
            String[] val = m.group().split("-");
            System.out.println(m.group());
            ans.add(val[2]);
        }
        return ans.size();
    }
}
