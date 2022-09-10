public class Main {
    public static void main(String[] args) {

      int cometPeriod = 79;
      int now = 2022;
      int before = now -200;
      int after = now + 100;
      for(int i = 0; i <= after;i++){
          if(i % 79 == 0 && i >=before){
              System.out.println("Компета пролетала в " + i + " году");
          }
      }


    }
    }
