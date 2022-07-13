import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        int day = 15;
        int month = 2;
        int year = 2001;
        Calendar calendar =new GregorianCalendar(year,month,day);
        DateFormat format1 = new SimpleDateFormat("dd-MM-yyyy - EEEEEEEEEEE");
        for (int i = 0;i < 24;i++){
            String formatted = format1.format(calendar.getTime());
            calendar.add(Calendar.YEAR, 1);
            System.out.println(i + " " + formatted);
        }


    }
}