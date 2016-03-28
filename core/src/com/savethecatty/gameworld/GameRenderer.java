package com.savethecatty.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

/**
 * Created by Кевин on 26.03.2016.
 */
public class GameRenderer {

    private GameWorld myWorld;
    private OrthographicCamera camera;
    private ShapeRenderer renderer;

    public GameRenderer(GameWorld world) {
        myWorld = world;
        camera = new OrthographicCamera();
        camera.setToOrtho(true, 136, 204);
        renderer = new ShapeRenderer();
        renderer.setProjectionMatrix(camera.combined);
    }

    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }
}
