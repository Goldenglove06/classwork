package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

public class sandPhysics2 {
    private float grain[];
    private int Mx;
    private int My;
    private float VelocityX = 0;
    private float VelocityY = 0;
    private float AccelerationX = 0.1f;
    private float AccelerationY = 1f;
    ShapeRenderer sr;
    Grain g;

    public sandPhysics2() {
        g = new Grain();
        sr = new ShapeRenderer();
    }

    public void create() {
        if (Gdx.input.isKeyPressed(Input.Keys.Q)) {
            setMx();
            setMy();
            g.addGrain(Mx, My, VelocityX, AccelerationX, VelocityY, AccelerationY,true);
        }
    }

    public void moveGrain() {
        ScreenUtils.clear(0, 0, 0, 1);
        //pulls values from grain class
            create();
        for (int i = 0; i < g.countGrain(); i++) {
            float[] grain = g.getGrain(i);
            draw(grain[0], grain[1]);
            if (grain[0] > 0) {//if x is coordinates are on screen
                if (grain[0] < 640) {
                }
                if (grain[1] > 0) {//if y coordinates are on screen
                    if (grain[1] < 480) {
                        grain[4] += grain[5];//velocity+=acceleration
                        grain[1] -= grain[4];//y-=velocity
            //            draw(grain[0], grain[1]);
                        g.setGrain(i, (int) grain[0], (int) grain[1], grain[2], grain[3], grain[4], grain[5],true);
                    }
                }
                else{

                    g.setGrain(i, (int) grain[0],0,grain[2], grain[3], 0, 0,false);
                }
            }
        }
    }
    public void draw(float x, float y) {
        sr.begin(ShapeRenderer.ShapeType.Filled);
        sr.setColor(Color.WHITE);
        sr.rect(x, y, 1, 1);
        sr.end();
    }

    public void setMx() {
        Mx = Gdx.input.getX();
    }

    public void setMy() {
        My = 480-Gdx.input.getY();
    }
}