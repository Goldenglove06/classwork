package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
public class sandPhysics {
   // ShapeRenderer sr= new ShapeRenderer();
    private int x=-100;
    private int y=-100;
    private int w;
    private int h;
    private int Mx;
    private int My;
    private int [][] grid;

public void sandPhysics(int x, int y){
    this.x=x;
    this.y=y;
    w=Gdx.graphics.getWidth()/5;
    h=Gdx.graphics.getHeight()/5;
    grid= new int [640][480];
    for(int k=0;k<640;k++){
        for(int l=0;l<480;l++){
            grid[k][l]=0;
        }
    }
}
    public void draw(ShapeRenderer sr) {
       // for (int i = 0; i < 5; i++) {
          //  int increment = i * w;
           // sr.setColor(Color.WHITE);
      //      sr.rect(Gdx.input.getX(),480-Gdx.input.getY(), 4, 4);

            if(Gdx.input.isKeyPressed(Input.Keys.Q)){
              for(int k=0;k<2;k++){
               for(int i=0;i<2;i++){
                grid[getMx()-1+i][getMy()-1+k]=1;}}

               // sr.setColor(Color.WHITE);
               // sr.rect(getMx(),getMy(), 4, 4);
            } for(int k=0;k<640;k++){
            for(int l=0;l<480;l++){
                if(grid[k][l]==1){
                    sr.setColor(Color.WHITE);
                    sr.rect(k,l,1,1);
                    if(l!=0){
                        if(grid[k][l-1]!=1){
                    grid[k][l]=0;
                    grid[k][l-1]=1;}
                    else if(grid[k-1][l-1]==0){
                            grid[k][l]=0;
                        grid[k-1][l-1]=1;}
                        else if(grid[k+1][l-1]==0){
                            grid[k][l]=0;
                            grid[k+1][l-1]=1;
                    }}
                }
            }}
     //   }

 /*
        for (int i = 0; i < 5; i++) {
            int increment = i * w;
            sr.setColor(Color.BLUE);
            sr.rect(w + increment, y, 1, h + 10);*/
        }
 //   }


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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
