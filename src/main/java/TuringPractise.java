import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TuringPractise {

    public static int calPoint(String[] ops){
        List<Integer> points = new ArrayList<>();
        for (String op : ops) {
            switch (op) {
                case "+" -> points.add(points.get(points.size() - 1) + points.get(points.size() - 2));
                case "D" -> points.add(points.get(points.size() - 1) * 2);
                case "C" -> points.remove(points.size() - 1);
                default -> points.add(Integer.parseInt(op));
            }
        }
        return points.stream().mapToInt(Integer::intValue).sum();
    }


    public static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();

        int st = 0;
        int ed = arr.length - 1;

        while(st < ed){
            if(!Character.isLetter(arr[st])){
                st++;
            } else if(!Character.isLetter(arr[ed])){
                ed--;
            } else {
                char temp = arr[st];
                arr[st] = arr[ed];
                arr[ed] = temp;
                st++;
                ed--;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(TuringPractise.calPoint(new String[]{"5", "-2","4", "C", "D", "9", "+", "+"}));
        System.out.println(reverseOnlyLetters("ab-cda"));
    }
}
