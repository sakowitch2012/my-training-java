

public class proverka {
    static String  Vvod = vvod.getVvod();


    public static void p1w() {
        switch (Word1()){
            case  ("LIST"):
                list.getlist();
                break;
            case  ("ADD"):
                if(isNumeric(Word2())){
                    if (Integer.parseInt(Word2())<list.ToDolist.size()){
                    list.ToDolist.add(Integer.parseInt(Word2()),Vvod.substring((Vvod.indexOf(Word2()))+2));
                    list.getlist();}
                    else {list.ToDolist.add(Vvod.substring((Vvod.indexOf(Word2()))+2));
                        list.getlist();}
                }
                else {list.ToDolist.add(Vvod.substring((Vvod.indexOf(Word2()))+2));
                list.getlist();}
                break;
            case ("EDIT"):
                list.ToDolist.set(Integer.parseInt(Word2()),(Vvod.substring(Vvod.indexOf(Word2())+2)));
                list.getlist();
                break;
            case ("DELETE") :
                list.ToDolist.remove(Integer.parseInt(Word2()));
                list.getlist();
        }
    }


    public static String Word2(){
        String[] words = Vvod.split(" ");
        String w2 = words[1];
        return w2;
        }

    public static String Word1(){
        String[] words = Vvod.split(" ");
        String w1 = words[0];
        return w1;
    }


    public static boolean isNumeric(String string) {
        int intValue;

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }
}
