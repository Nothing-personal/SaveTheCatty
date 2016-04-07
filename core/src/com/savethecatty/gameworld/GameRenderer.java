package com.savethecatty.gameworld;

/**
 * Class will draw all game objects.
 */

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
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

    // Game Objects
    private Catty catty;

    //Game Assets
    private Animation cattyLeftAnimation, cattyRightAnimation;
    private TextureRegion background, wall, borderWallLeft, borderWallRight, angleWallLeft, angleWallLeftUp,
            angleWallRight, angleWallRightUp, sideWall;
    public static TextureRegion cattyMid, cattyLeftUp, cattyRightUp, cattyRightDown, cattyLeftDown;


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

        initGameObjects();
        initGameAssets();
    }

    private void initGameObjects() {
        catty = myWorld.getCatty();
    }

    private void initGameAssets() {
        cattyMid = AssetLoader.catty;
        cattyLeftDown = AssetLoader.cattyLeftDown;
        cattyLeftUp = AssetLoader.cattyLeftUp;
        cattyRightDown = AssetLoader.cattyRightDown;
        cattyRightUp = AssetLoader.cattyRightUp;
        cattyLeftAnimation = AssetLoader.cattyLeftAnimation;
        cattyRightAnimation= AssetLoader.cattyRightAnimation;
        background = AssetLoader.background;
        wall = AssetLoader.wall;
        borderWallLeft = AssetLoader.borderWallLeft;
        borderWallRight = AssetLoader.borderWallRight;
        angleWallLeft = AssetLoader.angleWallLeft;
        angleWallLeftUp = AssetLoader.angleWallLeftUp;
        angleWallRight = AssetLoader.angleWallRight;
        angleWallRightUp = AssetLoader.angleWallRightUp;
        sideWall = AssetLoader.sideWall;
    }

    public void render(float runTime) {

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        renderer.begin(ShapeType.Filled);
        renderer.setColor(55 / 255.0f, 80 / 255.0f, 100 / 255.0f, 1);
        renderer.rect(0, 0, 136, midPointY + 66);
        renderer.end();

        batcher.begin();
        batcher.disableBlending();
        batcher.draw(background, 0, 0, 136, 204);

        batcher.enableBlending();
        if (catty.getVelocityX() == 0){
            batcher.draw(cattyMid, catty.getX(), catty.getY(), catty.getWidth() / 2.0f, catty.getHeight() / 2.0f,
                    catty.getWidth(), catty.getHeight(), 1, 1, catty.getRotation());
        } else if (catty.isRight()) {
            batcher.draw(cattyLeftAnimation.getKeyFrame(runTime), catty.getX(), catty.getY(), catty.getWidth() / 2.0f,
                    catty.getHeight() / 2.0f, catty.getWidth(), catty.getHeight(), 1, 1, catty.getRotation());
        } else {
            batcher.draw(cattyRightAnimation.getKeyFrame(runTime), catty.getX(), catty.getY(), catty.getWidth() / 2.0f,
                    catty.getHeight() / 2.0f, catty.getWidth(), catty.getHeight(), 1, 1, catty.getRotation());
        }
        batcher.end();
    }
}
