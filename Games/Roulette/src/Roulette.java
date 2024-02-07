import java.util.Random;

public class Roulette {

    private int players;
    private int[] lifes;
    private int bulletChamber;
    private int player = 0;
    private Random rand = new Random();

    public void Roulette(int p) {
        lifes = new int[p];
        for (int i = 0; i < p; i++) {
            lifes[i] = 3;
         //   System.out.println(lifes[i]);
        }
      //  System.out.print("jkfvn");
        players = p;
        bulletChamber = rand.nextInt((6) + 1);
    }

    public void shootCheck() {
        if (player > players) {
            System.out.println(player);
            player = 0;
        }
        if (lifes[player] != 0) {//if player has a life
          //  System.out.println(bulletChamber);
            if (bulletChamber == 1) {//if there is a bullet in the chamber
                lifes[player] = lifes[player] - 1;
                System.out.println("BANG!");
                bulletChamber = rand.nextInt((6) + 1);//reloading gun
                if (lifes[player]==0){
                    players--;
                    System.out.println("Player "+player+" is dead...");
                }
                player++;
            }
            else {
                bulletChamber--;
                player++;
               // System.out.println("Click");
            }
        }
               else {
                   player++;//if players dead then skip turn
            }

        }
        public boolean winCheck(){
        if(players==1){
            return true;
        }
        else{
            return false;
        }
        }

    public int getPlayer() {
        return player;
    }
}



