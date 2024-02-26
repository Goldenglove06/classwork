package com.mygdx.game;
public class Grid {
    private int x=25;
    private int y=25;
public Grid(){
}
    public int getX() {
        return x;
    }
    public void setX(int c) {
        x=25;
        x*=c;
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int r) {
        y=25;
        y*=r;
        this.y = y;
    }
}
