package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	float x;
	float y;


	OrthographicCamera mapCamera;
	Texture map;

	@Override
	public void create () {
		mapCamera = new OrthographicCamera();
		mapCamera.setToOrtho(false, 800, 480);
		map = new Texture("mapa.png");
		 x=-400;
		 y=-240;
		batch = new SpriteBatch();

	}
	float time = 0;

	@Override
	public void render () {
		mapCamera.translate(x, y);
		mapCamera.update();
		batch.begin();
		{
			batch.setProjectionMatrix(mapCamera.combined);
			batch.draw(map, 0, 0);
		}
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
