import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample {
    public static void main(String[] args) {
        List<String> locks = new ArrayList<>();
//        List<String> price = new ArrayList<>();
//        Set<String> rates = new HashSet<>();
        String val = "5.0,100,5.5,101,6.0,102:L10;5.0,99,5.5,100,6.0,101:L20;" ;
//
//        Matcher m = Pattern.compile("[L][0-9]+[;]").matcher(val);
//        Matcher r = Pattern.compile("[0-9]+\\.[0-9]").matcher(val);
//        Matcher p = Pattern.compile("\\$\\d+(?![0-9.])").matcher(val);
//        while (m.find()){
//            locks.add(m.group());
//        }
//        while (r.find()){
//            rates.add(r.group());
//        }
//        while (p.find()){
//            price.add(p.group());
//        }


        Map<Integer, List<String>> map = new HashMap<>();
        String[] first = val.split(";");
        List<String> locker = new ArrayList<>();
        for (int i = 0; i < first.length; i++) {
            int index = first[i].lastIndexOf(":");
            String clean = first[i].substring(0,index);
            locker.add(first[i].substring(index+2));
            List<String> al;
            String[] str = clean.split(",");
            al = Arrays.asList(str);
            map.put(i+1, al);
        }
        List<String> price = new ArrayList<>();
        Set<String> rates = new HashSet<>();

        int row = map.get(1).size() / 2;
        int column = locker.size();
        int[][] ans = new int[row][column];
        System.out.println(Arrays.toString(first));
        System.out.println(map);
        System.out.println(locker);
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                ans[i][j] =
//            }
//
//        }

    }
}
