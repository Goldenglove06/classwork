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

public void sandPhysics(int x, int y){
    grid= new int [640][480];
    for(int k=0;k<640;k++){
        for(int l=0;l<480;l++){
            grid[k][l]=0;
        }
    }
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
                //  grid[getMx()-1+i][getMy()-1+k]=1;}
            }
        }
        for (int k = 0; k < 640; k++) {
            for (int l = 0; l < 480; l++) {
                if (grid[k][l] == 1) {
                    sr.setColor(210 / 255f, 170 / 255f, 109 / 255f, 1f);
                    sr.rect(k, l, 1, 1);
                    if (l != 0) {
                        if (grid[k][l - 1] != 1) {
                            grid[k][l] = 0;
                            grid[k][l - 1] = 1;
                        } else if (grid[k - 1][l - 1] !=1) {
                            if (k - 2 >0) {
                                grid[k][l] = 0;
                                grid[k - 1][l - 1] = 1;
                            }
                        } else if (grid[k + 1][l - 1] == 0) {
                            if (k +2 < 640) {
                                grid[k][l] = 0;
                                grid[k + 1][l - 1] = 1;
                            }
                        }
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