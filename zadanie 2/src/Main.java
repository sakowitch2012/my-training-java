public class Main {
    public static void main(String[] args) {
        String text = "Sofia Sapega was arrested alongside her partner, dissident journalist Roman Protasevich, after their flight was forcibly diverted to Minsk in May 2021. She was later sentenced to six years in jail for inciting discord, charges her family say are false. But in comments issued by her lawyer, Ms Sapega apologised for her actions. In a letter addressed to Mr Lukashenko, the 24-year-old said she had been motivated to commit crimes by her youth and stupidity and claimed that she had come under the influence of a destructive group of people. She appealed to the authoritarian Belarusian leader to be lenient and to offer her the opportunity to be useful to society and be close to her mom and dad";
        text = text.replaceAll("[ +,]",".");
        String[] raz = text.split("\\.+");
        for (int i = 0;i< raz.length;i++ ){
            System.out.println(raz[i]);
        }
    }
}