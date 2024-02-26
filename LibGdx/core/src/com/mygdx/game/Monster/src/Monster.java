import java.util.Random;
public class Monster {
    private int monsterX;
    private int monsterY ;
    private Random rand = new Random();
    private Player p;
    public Monster(Player player) {
        this.p = player;
        monsterX = rand.nextInt(10) * 25;
        monsterY = rand.nextInt(10) * 25;
    }
    public void monsterMove() {
        int difX = p.getPlayerX() - monsterX;
        int difY = p.getPlayery() - monsterY;
        int absDifX = Math.abs(difX);
        int absDifY = Math.abs(difY);
        if (absDifX > absDifY) {
            int dirX = Integer.compare(difX, 0);
            if (absDifX >= 25) {
                monsterX += dirX * 25;
            }
        } else {
            int dirY = Integer.compare(difY, 0);
            if (absDifY >= 25) {
                monsterY += dirY * 25;
            }
        }
    }
    public int getMonsterX() {
        return monsterX;
    }
    public int getMonsterY() {
        return monsterY;
    }
}