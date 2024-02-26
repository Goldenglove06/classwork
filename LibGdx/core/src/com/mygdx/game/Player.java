package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

import java.util.ArrayList;
import java.util.Random;

public class entitys {
   private int [] player=new int [2];
    private int [] mon=new int [2];
   private int [] treasure=new int [2];
   private int [] traps=new int [2];
    Random rand= new Random();
    ArrayList<int[]>treasureXY=new ArrayList<>();
    ArrayList<int[]>trapXY=new ArrayList<>();
    public entitys(){//add spawn collision check so they dont spawn inside eachother
        player[0]=rand.nextInt(10);
        player [1]=rand.nextInt(10);
        mon[0]=rand.nextInt(10);
        mon[1]=rand.nextInt(10);
        for(int i=0;i<10;i++){
            treasure[0]=rand.nextInt(10);
            treasure [1]=rand.nextInt(10);
            treasureXY.add(treasure);
        }
        for(int k=0;k<3;k++){
            traps [0]=rand.nextInt(10);
            traps [1]=rand.nextInt(10);
            trapXY.add(traps);
        }
    }
    public void player(){

        if(Gdx.input.isKeyPressed(Input.Keys.W)){
        player[1]+=1;
        }
            if(Gdx.input.isKeyPressed(Input.Keys.A)){
                player[0]-=1;
            }
                if(Gdx.input.isKeyPressed(Input.Keys.S)){
                    player[1]-=1;
                }
                    if(Gdx.input.isKeyPressed(Input.Keys.D)){
                        player[0]+=1;
                    }
    }
    public void trap(){}
    public void monster(){}
    public void treasure(){}

    public int[] getPlayer() {
        return player;
    }

    public void setPlayer(int[] player) {
        this.player = player;
    }

    public int[] getMon() {
        return mon;
    }

    public void setMon(int[] mon) {
        this.mon = mon;
    }
}
