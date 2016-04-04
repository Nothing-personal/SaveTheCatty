package com.savethecatty.gameworld;

/**
 * Class will draw all game objects.
 */

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.savethecatty.gameobjects.Catty;
import com.savethecatty.helpers.AssetLoader;

public class GameRenderer {

    private GameWorld myWorld;
    private OrthographicCamera camera;
    private ShapeRenderer renderer;
    private SpriteBatch batcher;

    private int midPointY;
    private int gameHeight;

    public GameRenderer(GameWorld world, int gameHeight, int midPointY) {
        myWorld = world;

        this.gameHeight = gameHeight;
        this.midPointY = midPointY;

        camera = new OrthographicCamera();
        camera.setToOrtho(true, 136, gameHeight);

        batcher = new SpriteBatch();
        batcher.setProjectionMatrix(camera.combined);
        renderer = new ShapeRenderer();
        renderer.setProjectionMatrix(camera.combined);
    }

    public void render(float runTime) {

        Catty catty = myWorld.getCatty();

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        renderer.begin(ShapeType.Filled);
        renderer.setColor(55 / 255.0f, 80 / 255.0f, 100 / 255.0f, 1);
        renderer.rect(0, 0, 136, midPointY + 66);
        renderer.end();

        batcher.begin();
        batcher.draw(AssetLoader.cattyAnimation.getKeyFrame(runTime), catty.getX(), catty.getY(),
                catty.getWidth(),catty.getHeight());
        batcher.end();
    }
}
