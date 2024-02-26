package com.mygdx.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import java.util.Random;
public class Player {
private int playerX=25;
private int playery=25;
Random rand = new Random();
    public Player() {
        int spawnX=rand.nextInt(10);
        int spawnY=rand.nextInt(10);
         playerX*=spawnX;
         playery*=spawnY;
         System.out.println(playerX);
        System.out.println(playery);
    }
    public void playerMove() {
                if (Gdx.input.isKeyPressed(Input.Keys.W)) {
                    if(playery<475){
                    playery += 25;
                    }
                } else if (Gdx.input.isKeyPressed(Input.Keys.A)) {
                    if(playerX>0) {
                        playerX -= 25;
                    }
                } else if (Gdx.input.isKeyPressed(Input.Keys.S)) {
                        if(playery>0) {
                            playery -= 25;
                        }
                } else if (Gdx.input.isKeyPressed(Input.Keys.D)) {
                    if(playerX<475) {
                        playerX += 25;
                    }
                }
            }
    public int getPlayerX() {
        return playerX;
    }
    public int getPlayery() {
        return playery;
    }
}