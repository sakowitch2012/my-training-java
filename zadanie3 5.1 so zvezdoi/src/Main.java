public class Main {
    public static void main(String[] args) {
      String[][] x = {
              {"X"," "," ", " "," "," ","X"},
              {" ","X"," "," "," ","X"," "},
              {" "," ","X"," ","X"," "," ",},
              {" "," "," ","X"," "," "," "," "},
              {" "," ","X"," ","X"," "," ",},
              {" ","X"," "," "," ","X"," "},
              {"X"," "," ", " "," "," ","X"},
      };
      for (int i = 0;i< x.length;i++){
          System.out.println("\t");
          for (int j = 0; j<x[i].length;j++){
              System.out.print(x[i][j]);
          }
      }

    }
}