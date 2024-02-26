package com.mygdx.game.FlappyBird;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class pipe {
    private int x;
    private int y;
    private int gap;
    private int velocity;
    private int width;
    int height;
    int p2h;

//private int pipes[];
//private int values[];
    public pipe(int x,int y,int gap,int velocity,int width,int height){
        this.x=x;
        this.y=y;
        this.gap=gap;
        this.velocity=velocity;
        this.width=width;
        this.height=height;
    }
    public void draw(ShapeRenderer sr){
        p2h=600-height-gap;
        sr.setColor(Color.GREEN);
        sr.rect(x,y,width,height);//bottom pipe
        sr.rect(x,height+gap,width,p2h);//top pipe
        sr.setColor(Color.BROWN);
        sr.rect(0,0,700,20);//floor
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
    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getP2h() {
        return p2h;
    }

    public void setP2h(int p2h) {
        this.p2h = p2h;
    }

    public int getGap() {
        return gap;
    }

    public int getWidth() {
        return width;
    }
}

