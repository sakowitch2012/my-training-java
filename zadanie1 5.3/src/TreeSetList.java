
import java.util.TreeSet;

public class TreeSetList {
    public static TreeSet<String> ToDolist = new TreeSet<>(){{
        add("Pidor@ya.ru");
        add("GOVNO@ya.lol");
        add("siska@bk.wernidengi");
        add("lox@pizdec.wow");
    }};


    public static void getlist(){
        for( String item: ToDolist){
            System.out.println(item);
        }
    }
}
