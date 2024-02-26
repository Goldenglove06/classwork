package com.mygdx.game.FlappyBird;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.Random;

public class flappyMain extends ApplicationAdapter {
bird b;
pipe p;
Random rand;
ShapeRenderer sr;
boolean collided=false;
boolean start=false;
int pipeHeight;



    @Override
    public void create() {
        rand=new Random();
        pipeHeight=rand.nextInt(280);
        sr=new ShapeRenderer();
        b=new bird(100,320,30,30);
        p=new pipe(350,0,120,3,100,pipeHeight+100);

    }


    @Override
    public void render() {
    ScreenUtils.clear(137/255f,207/255f,240/255f,1f);
    sr.begin(ShapeRenderer.ShapeType.Filled);
    p.draw(sr);
    b.draw(sr);
    if(!collided){
    p.setX(p.getX()-p.getVelocity());
    if(b.getX()+b.getWidth()>p.getX()){
        if(b.getX()<p.getX()){
            if(b.getY()<p.getHeight()){
               collided=true;
               b.setVelocityY(3);
            }
            else if(b.getY()+b.getHeight()>p.getHeight()+p.getGap()){
                collided=true;
                b.setVelocityY(3);
            }
        }
    }
    if(b.getX()>p.getX()){
        if(b.getX()<p.getX()+p.getWidth()){
            if(b.getY()<p.getHeight()){
                collided=true;
                b.setVelocityY(3);
            }
            else if(b.getY()+b.getHeight()>p.getHeight()+p.getGap()){
                collided=true;
                b.setVelocityY(3);
            }
        }
    }
    }
    b.setVelocityY(b.getVelocityY()-b.getAccelerationY());
    b.setY((int) (b.getY()+b.getVelocityY()));
    if(b.getY()<20){
        collided=true;
        b.setY(20);
    }
    if (p.getX()<-100){
        p.setX(350);
        p.setHeight(rand.nextInt(280)+100);
    }
    if(!collided) {
        if (Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
            b.setVelocityY(5);
           // sr.rotate(20,0,0,10);
        }
    }
    sr.end();
    }

    @Override
    public void dispose() {

    }
}
