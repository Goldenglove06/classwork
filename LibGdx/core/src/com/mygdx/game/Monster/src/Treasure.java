import java.util.ArrayList;
import java.util.Random;

public class Treasure {
    private ArrayList<int[]> objects;
    private int[] treasureXY;
    private int x;
    private int y;
    int score;
    Random rand = new Random();
    public Treasure() {
        objects = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            x = 25*rand.nextInt(20);
            y = 25*rand.nextInt(20);
            treasureXY = new int[]{x,y};
            objects.add(treasureXY);
        }
    }
        public void moveTreasure(int index) {
            int[] move = new int[]{25 * rand.nextInt(20), 25 * rand.nextInt(20)};
            for (int i = 0; i < objects.size(); i++) {
                int[] obj = objects.get(i);
                if (move[0] == obj[0]) {
                    if (move[1] == obj[1]) {
                       move = new int[]{25 * rand.nextInt(20), 25 * rand.nextInt(20)};
                    }
                }
                else {
                        objects.set(index, move);
                    }
                }
            score+=100;
            }
    public int[] getObjects(int index) {
        return objects.get(index);
    }
}

