package com.mygdx.game;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

public class main extends ApplicationAdapter {
    Move m;
    Treasure t;
    ShapeRenderer sr;
    Color col = new Color();
    private SpriteBatch batch;
    private BitmapFont font;
    @Override
    public void create() {
        sr = new ShapeRenderer();
        int grid[];
        m= new Move();
        t=new Treasure();
        font=new BitmapFont();
        batch=new SpriteBatch();
        font.setColor(Color.WHITE);
        font.getData().scale(2);
    }

    @Override
    public void render() {
        int score=m.score;
        batch.begin();
        font.draw(batch, "Monster", 525, 490);
        batch.end();
        batch.begin();
        font.draw(batch,""+score, 535, 400);// Draw text at position (100, 100)
        batch.end();
        if (m.isCaught() == false) {
            m.gameDraw(sr);;
            sr.setColor(Color.GRAY);
            sr.rect(515,450,175,42);
            sr.rect(515,400,175,42);
            sr.end();
            batch.begin();
            font.draw(batch, "Monster", 525, 490);
            batch.end();
            batch.begin();
            font.draw(batch,""+score, 535, 440);// Draw text at position (100, 100)
            batch.end();
            if(m.isPaused()==true){
                batch.begin();
                font.draw(batch,"PAUSED", 162, 270);// Draw text at position (100, 100)
                batch.end();
            }

        }
        else{
            ScreenUtils.clear(Color.DARK_GRAY);
            sr.begin(ShapeRenderer.ShapeType.Filled);
            sr.setColor(Color.BLACK);
           // m.gameDraw(sr);
            sr.rect(0,0,500,500);
            sr.setColor(Color.GRAY);
            sr.rect(515,450,175,42);
            sr.rect(515,400,175,42);
            sr.end();
            batch.begin();;
            font.draw(batch,"GAME OVER",120,270);
            font.draw(batch, "Monster", 525, 490);
            font.draw(batch,""+score, 535, 440);// Draw text at position (100, 100)
            batch.end();
        }
    }
            @Override
            public void dispose () {

            }
}
