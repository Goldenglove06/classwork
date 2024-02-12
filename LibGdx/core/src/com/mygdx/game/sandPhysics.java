package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
public class sandPhysics {
   // ShapeRenderer sr= new ShapeRenderer();
    private int Mx;
    private int My;
    private int [][] grid;
    private float acceleration=0.01f;
    private float gravity=0;


public void sandPhysics(int x, int y){
    grid= new int [640][480];
    for(int k=0;k<640;k++){
        for(int l=0;l<480;l++){
            grid[k][l]=0;//sets every coordinate as undrawn
        }
    }
}


public void Gravity(int x, int y){


    if(y>0&&grid[x][y-1]==0){
        grid[x][y]=0;
        gravity =gravity-acceleration;//g=g+a


    }
    else{//this code here decides whether the sand should slide or not but its commented out rn so i can fix the acceleration
  /*      if (grid[x - 1][y - 1] !=1) {
            if (x - 2 >0) {
                grid[x][y] = 0;
                grid[x - 1][y - 1] = 1;
            }
        } else if (grid[x + 1][y - 1] == 0) {
            if (x +2 < 640) {
                grid[x][y] = 0;
                grid[x + 1][y - 1] = 1;
            }
        }
        */gravity=0;
    }
    if(y+gravity<0) {
        for (int k = 0; k < 1; ) {
            for (int i = 0; i < y; i++) {
                if (grid[x][i] == 0) {
                   grid[x][y] = 0;
                    grid[x][i] = 1;
                    k++;
                }
            }
        }
    }
        else{
            grid[x][y]=0;
        grid[x][(int)(y+gravity)]=1;}
    }




    public void draw(ShapeRenderer sr) {
        if (Gdx.input.isKeyPressed(Input.Keys.Q)) {
            for (int k = 0; k < 2; k++) {
                for (int i = 0; i < 2; i++) {
                    if (getMy() > 0 && getMy() < 480) {
                        if (getMx() > 0 && getMx() < 640) {
                            grid[getMx() - 1 + i][getMy() - 1 + k] = 1;
                        }
                    }
                }
            }
        }
        for (int k = 0; k < 640; k++) {
            for (int l = 0; l < 480; l++) {
                if (grid[k][l] == 1) {
                    sr.setColor(210 / 255f, 170 / 255f, 109 / 255f, 1f);
                    sr.rect(k, l, 1, 1);
                    if (l != 0) {
                        Gravity(k,l);
                    }
                }
            }

        }
    }

    public int getMx() {
        return Gdx.input.getX();
    }

    public void setMx(int mx) {
        Mx = mx;
    }

    public int getMy() {
       int holder=480-Gdx.input.getY();
        return holder;
    }

    public void setMy(int my) {
        My = my;
    }

}
//needs error checking for array as if i hold q out of the screen it creates an out of bound error