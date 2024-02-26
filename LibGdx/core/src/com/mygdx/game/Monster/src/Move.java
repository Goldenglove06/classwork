import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.TimeUtils;

public class Move {
    private long lastTime;
    Player p = new Player();
    Monster m= new Monster(p);
    Grid g=new Grid();
    Treasure te=new Treasure();
    Trap tp=new Trap();
    int score=0;
    boolean caught =false;
    int dimensions =25;
    private long lastTime2;
    private boolean paused=false;
    boolean found=false;
    public Move() {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                lastTime=TimeUtils.millis();
                lastTime2=TimeUtils.millis();

            }
        }
    }
    public void gameDraw(ShapeRenderer sr) {
        collision();
            ScreenUtils.clear(Color.DARK_GRAY);
            sr.begin(ShapeRenderer.ShapeType.Filled);
            sr.setColor(Color.WHITE);
            sr.rect(515,450,175,2);
            long currentTime = TimeUtils.millis();
            long currentTime2 = TimeUtils.millis();
            if (currentTime2 - lastTime2 > 150) {
                if(paused==false) {
                p.playerMove();
                }
                pause();
                lastTime2 = currentTime;
            }
            if (currentTime - lastTime > 300) {
                if(paused==false) {
                    if(found==true) {
                        m.monsterMove();
                    }
                }
                lastTime = currentTime;
            }
            sr.setColor(Color.YELLOW);
            for (int l = 0; l < 20; l++) {
                int[] currentTreasure = te.getObjects(l);
                sr.rect(currentTreasure[0], currentTreasure[1], dimensions, dimensions);
            }
            sr.setColor(Color.BLUE);
            sr.rect(p.getPlayerX(), p.getPlayery(), dimensions, dimensions);
           if(found ==true) {
               sr.setColor(Color.RED);
               sr.rect(m.getMonsterX(), m.getMonsterY(), dimensions, dimensions);
           }
            sr.setColor(Color.BLACK);
            for (int i = 0; i < 21; i++) {
                g.setX(i);
                g.setY(0);
                sr.rect(g.getX(), g.getY(), 1, 500);
            }
            for (int k = 0; k < 20; k++) {
                g.setX(0);
                g.setY(k);
                sr.rect(g.getX(), g.getY(), 500, 1);
            }
         //   sr.end();
        }
    public void collision() {
       if(caught ==false){
        if (p.getPlayerX() == m.getMonsterX()) {
            if (p.getPlayery() == m.getMonsterY()) {
                caught = true;
               // System.out.println(te.getScore());
            }
        }
    }
        for (int i = 0; i < 20; i++) {
            int[] treasurexy = te.getObjects(i);
            if (p.getPlayerX() == treasurexy[0]) {
                if (p.getPlayery() == treasurexy[1]) {
                    te.moveTreasure(i);
                    score += 100;
                }
            }
        }
        for(int k=0;k<5;k++) {
            int[] trapxy = tp.getObjects(k);
            if (p.getPlayerX() == trapxy[0]) {
                if (p.getPlayery() == trapxy[1]) {
                    found = true;
                }
            }
        }
    }

    public boolean isCaught() {
        return caught;
    }

    public void pause() {
        if (Gdx.input.isKeyPressed(Input.Keys.P)) {
            if (paused == true) {
                 paused= false;
            } else {
                paused = true;
            }
        }
    }
    public boolean isPaused(){
        return paused;
    }
}





