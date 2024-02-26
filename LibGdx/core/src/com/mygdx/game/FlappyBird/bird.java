package com.mygdx.game.FlappyBird;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class bird {
private int x;
private int y;
private  int r;
private int width;
private int height;
private float accelerationY;
private float VelocityY;
    public bird(int x,int y,int width,int height){
    this.x=x;
    this.y=y;
    this.width=width;
    this.height=height;
    accelerationY=0.3f;
    VelocityY=0;
    }
    public void draw(ShapeRenderer sr){
        sr.setColor(Color.YELLOW);
        sr.rect(x,y,width,height);
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


    public float getAccelerationY() {
        return accelerationY;
    }

    public float getVelocityY() {
        return VelocityY;
    }

    public void setVelocityY(float VelocityY) {
        this.VelocityY = VelocityY;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
