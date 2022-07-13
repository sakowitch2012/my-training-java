public class EmailsMove {
    static String  Vvod = vvod.getVvod();

    public static void Emails(){
        switch (Word1()){
            case ("LIST"):
                TreeSetList.getlist();
                break;
            case ("ADD"):
TreeSetList.ToDolist.add(Vvod.substring((Vvod.indexOf(Word1()))));
TreeSetList.getlist();
break;
        }
    }

    public static String Word1(){
        String[] words = vvod.Vvod.split(" ");
        String w1 = words[0];
        return w1;
    }
}
