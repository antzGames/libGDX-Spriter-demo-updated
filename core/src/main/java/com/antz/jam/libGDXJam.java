package com.antz.jam;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.brashmonkey.spriter.Data;
import com.brashmonkey.spriter.Drawer;
import com.brashmonkey.spriter.libGdx.LibGdxDrawer;
import com.brashmonkey.spriter.libGdx.LibGdxLoader;
import com.brashmonkey.spriter.Loader;
import com.brashmonkey.spriter.Player;
import com.brashmonkey.spriter.SCMLReader;

public class libGDXJam extends ApplicationAdapter {

	SpriteBatch batch;
	OrthographicCamera camera;

	// Sprite animation objects
	Loader spriteLoader;
	ShapeRenderer spriteRenderer;
	Drawer spriteDrawer;
	Player spritePlayer;

	@Override
	public void create() {
		super.create();
		camera = new OrthographicCamera();
		camera.zoom = 1f;
		batch = new SpriteBatch();

		// Load project file
		FileHandle handle = Gdx.files.internal("GreyGuy/player.scml");
		Data data = new SCMLReader(handle.read()).getData();

		// Load the images needed for the project
		spriteLoader = new LibGdxLoader(data);
		spriteLoader.load("GreyGuy"); // set to the project parent path

		// Initialize the renderer, drawer and the player entities
		spriteRenderer = new ShapeRenderer();
		spriteDrawer = new LibGdxDrawer(spriteLoader, batch, spriteRenderer);
		spritePlayer = new Player(data.getEntity(0));

		// you can set to specific animation by name or index
		spritePlayer.setAnimation("walk");

		/*
		 For more information of how to manipulate the player object at run time see:
		 	https://github.com/Trixt0r/spriter#manipulate-a-player-at-runtime
		*/
	}

	@Override
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		// make sure you update the player entity
		spritePlayer.update();

		// draw the player entity
		batch.begin();
		spriteDrawer.draw(spritePlayer);
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		camera.position.set(0, 0, 0f);
		camera.update();
		spriteRenderer.setProjectionMatrix(camera.combined);
		batch.setProjectionMatrix(camera.combined);
	}

	@Override
	public void dispose() {
		spriteRenderer.dispose();
		spriteLoader.dispose();
		batch.dispose();
	}
}