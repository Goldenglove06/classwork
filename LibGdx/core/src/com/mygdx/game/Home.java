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

		sandPhysics sp;
		ShapeRenderer sr;
	//	int x = 0;
		int y = 50;

		@Override
		public void create() {
			//Gdx.graphics.setWindowedMode(400,600);
			sr = new ShapeRenderer();
			sp =new sandPhysics();
			sp.sandPhysics(0,50);
		}

		@Override
		public void render() {

			if (Gdx.input.isKeyPressed(Input.Keys.ENTER)) {
				System.out.println(Gdx.graphics.getWidth());
			}
			//	Gdx.input.isKeyPressed(Input.Keys.S);
			ScreenUtils.clear(0, 0, 0, 1);
			sr.begin(ShapeRenderer.ShapeType.Filled);
				sp.draw(sr);
				//	sr.setColor(Color.WHITE);

				//	sr.rect(x, y, w, h);
				sr.end();

			}


		@Override
		public void dispose() {
		//sr.dispose();
		}
	}
