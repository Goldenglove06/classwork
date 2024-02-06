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
            System.out.println(lifes[i]);
        }
        players = p;
        bulletChamber = rand.nextInt((6) + 1);
    }

    public void shootCheck() {
        if (player > players) {
            player = 0;
        }
        if (lifes[player] != 0) {//if player has a life
            if (bulletChamber == 1) {//if there is a bullet in the chamber
                lifes[player] = lifes[player] - 1;
                bulletChamber = rand.nextInt((6) + 1);//reloading gun
                if (lifes[player]==0){
                    players--;
                    System.out.println("Dead");
                }
                player++;
            }
            else {
                bulletChamber--;
                player++;
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



