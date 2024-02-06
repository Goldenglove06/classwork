import java.util.Scanner;

public class RouletteLauncher {
    public static void main(String[] args) {
        Roulette r= new Roulette();
        Scanner s= new Scanner(System.in);
        System.out.println("How many people are playing?");
        int players=s.nextInt();
        r.Roulette(players);
        for(int i=0;i<1;){
          if(r.winCheck()==true){
              System.out.println("the winner is player "+r.getPlayer());
              i++;
          }
          else{
              r.shootCheck();
          }
       }
    }
}