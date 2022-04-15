import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PastPresentFuture {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your date: MM/DD/YYYY \n");
        System.out.print("-> ");
        String date = in.nextLine();
        System.out.println("Date: " + date);
        in.close();
        String[] dateForm = date.split("/");
        LocalDate localDate = LocalDate.now();

        if(localDate.getYear() != Integer.parseInt(dateForm[2])){
            System.out.println("Not this YEAR");
        }
        else {
            if (localDate.getMonth().getValue() > Integer.parseInt(dateForm[0])) {
                System.out.println("Earlier Month this YEAR");
            } else if (localDate.getMonth().getValue() < Integer.parseInt(dateForm[0])) {
                System.out.println("Later Month this YEAR");
            } else if (localDate.getMonth().getValue() == Integer.parseInt(dateForm[0])) {
                System.out.println("this Month");
            }
        }
    }
}
