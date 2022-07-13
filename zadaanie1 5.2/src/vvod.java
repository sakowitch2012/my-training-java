import java.util.Scanner;

public class vvod {
    static String Vvod ="";
    public static String vvod() {
        Scanner print = new Scanner(System.in);
        String Vvod1 = print.nextLine();
        Vvod = Vvod1;
        return Vvod1;
    }

    public static String getVvod() {
        return Vvod;
    }
}
