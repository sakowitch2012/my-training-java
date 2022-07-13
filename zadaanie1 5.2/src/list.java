import java.util.ArrayList;

public class list {
    public static ArrayList<String> ToDolist = new ArrayList<>(){{
        add("prosnutsa");
        add("sdelat omlet");
        add("ychitsa");
        add("doit corovy");
    }};


    public static void getlist(){
        for( String item: ToDolist){
            System.out.println(item);
        }
    }
}
