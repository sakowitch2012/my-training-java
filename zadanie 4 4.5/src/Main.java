import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);
        String nomer = vvod.nextLine();
        nomer = nomer.replaceAll("[^0-9]","");
        String proverka = nomer.substring(0,1);
        int proverka1 = Integer.parseInt(proverka);

        if (nomer.length()>11 || nomer.length()<10){
            System.out.println(" ne tot nomer");
    }
        else if (proverka1>8 || proverka1<7){
            System.out.println(" ne tot nomer");
        }
             else if (proverka1 == 8){
                 String zamena = nomer.substring(1);
            System.out.println("7"+zamena);
        }
             else  System.out.println(nomer);


}
}