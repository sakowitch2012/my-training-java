import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner vse = new Scanner(System.in);
        String nraz = vse.nextLine();
        String[] raz = nraz.split(" ");
        System.out.println("imya: " + raz[0] + "  " + "fam: " + raz[1]);

    }
}