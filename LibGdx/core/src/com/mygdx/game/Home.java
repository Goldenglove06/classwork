package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
public class Home extends ApplicationAdapter {
Test t;
		sandPhysics sp;
		sandPhysics2 sp2;
		ShapeRenderer sr;
		Grain g;
	//	int x = 0;
		int y = 50;

		@Override
		public void create() {
			//Gdx.graphics.setWindowedMode(400,600);
			sr = new ShapeRenderer();
			sp2 =new sandPhysics2();
			//t=new Test();
			//t.Test(0,50);.
			g =new Grain();
		}

		@Override
		public void render() {

			//if (Gdx.input.isKeyPressed(Input.Keys.ENTER)) {
			//	System.out.println(Gdx.graphics.getWidth());
		//	}
			//	Gdx.input.isKeyPressed(Input.Keys.S);
		//a	ScreenUtils.clear(0, 0, 0, 1);
		//	sr.begin(ShapeRenderer.ShapeType.Filled);
			//t.draw(sr);
			sp2.moveGrain();
				//	sr.setColor(Color.WHITE);

				//	sr.rect(x, y, w, h);
				//sr.end();

			}


		@Override
		public void dispose() {
		//sr.dispose();
		}
	}
