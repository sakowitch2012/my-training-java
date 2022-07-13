import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        float[] temp = new float[30];
        int healthy = 0;
        float all = 0;
        DecimalFormat df = new DecimalFormat("##.##");

        for(int i = 0; i < temp.length;i++){
            temp[i] = 32 + (float) (Math.random() * 8);
            if (temp[i]>36.2 && temp[i]<36.9){
                healthy++;
            }
            all += temp[i];
            System.out.println(df.format(temp[i]));
        }
        all = all / 30;
        System.out.println("healthy = " + healthy);
        System.out.println("all = " + df.format(all));

    }
}